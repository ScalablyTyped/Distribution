package typings.angularCore.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores DOM operations which need to be applied to update DOM render tree due to changes in
  * expressions.
  *
  * The basic idea is that `i18nExp` OpCodes capture expression changes and update a change
  * mask bit. (Bit 1 for expression 1, bit 2 for expression 2 etc..., bit 32 for expression 32 and
  * higher.) The OpCodes then compare its own change mask against the expression change mask to
  * determine if the OpCodes should execute.
  *
  * NOTE: 32nd bit is special as it says 32nd or higher. This way if we have more than 32 bindings
  * the code still works, but with lower efficiency. (it is unlikely that a translation would have
  * more than 32 bindings.)
  *
  * These OpCodes can be used by both the i18n block as well as ICU sub-block.
  *
  * ## Example
  *
  * Assume
  * ```ts
  *   if (rf & RenderFlags.Update) {
  *    i18nExp(ctx.exp1); // If changed set mask bit 1
  *    i18nExp(ctx.exp2); // If changed set mask bit 2
  *    i18nExp(ctx.exp3); // If changed set mask bit 3
  *    i18nExp(ctx.exp4); // If changed set mask bit 4
  *    i18nApply(0);            // Apply all changes by executing the OpCodes.
  *  }
  * ```
  * We can assume that each call to `i18nExp` sets an internal `changeMask` bit depending on the
  * index of `i18nExp`.
  *
  * ### OpCodes
  * ```ts
  * <I18nUpdateOpCodes>[
  *   // The following OpCodes represent: `<div i18n-title="pre{{exp1}}in{{exp2}}post">`
  *   // If `changeMask & 0b11`
  *   //        has changed then execute update OpCodes.
  *   //        has NOT changed then skip `8` values and start processing next OpCodes.
  *   0b11, 8,
  *   // Concatenate `newValue = 'pre'+lView[bindIndex-4]+'in'+lView[bindIndex-3]+'post';`.
  *   'pre', -4, 'in', -3, 'post',
  *   // Update attribute: `elementAttribute(1, 'title', sanitizerFn(newValue));`
  *   1 << SHIFT_REF | Attr, 'title', sanitizerFn,
  *
  *   // The following OpCodes represent: `<div i18n>Hello {{exp3}}!">`
  *   // If `changeMask & 0b100`
  *   //        has changed then execute update OpCodes.
  *   //        has NOT changed then skip `4` values and start processing next OpCodes.
  *   0b100, 4,
  *   // Concatenate `newValue = 'Hello ' + lView[bindIndex -2] + '!';`.
  *   'Hello ', -2, '!',
  *   // Update text: `lView[1].textContent = newValue;`
  *   1 << SHIFT_REF | Text,
  *
  *   // The following OpCodes represent: `<div i18n>{exp4, plural, ... }">`
  *   // If `changeMask & 0b1000`
  *   //        has changed then execute update OpCodes.
  *   //        has NOT changed then skip `2` values and start processing next OpCodes.
  *   0b1000, 2,
  *   // Concatenate `newValue = lView[bindIndex -1];`.
  *   -1,
  *   // Switch ICU: `icuSwitchCase(lView[1], 0, newValue);`
  *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuSwitch,
  *
  *   // Note `changeMask & -1` is always true, so the IcuUpdate will always execute.
  *   -1, 1,
  *   // Update ICU: `icuUpdateCase(lView[1], 0);`
  *   0 << SHIFT_ICU | 1 << SHIFT_REF | IcuUpdate,
  *
  * ];
  * ```
  *
  */
@js.native
trait I18nUpdateOpCodes
  extends StObject
     with Array[String | Double | SanitizerFn | Null]
     with I18nDebug {
  
  var __brand__ : typings.angularCore.angularCoreStrings.I18nUpdateOpCodes = js.native
}
