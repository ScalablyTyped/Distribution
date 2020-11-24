package typings.angularCore.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Array storing OpCode for dynamically creating `i18n` blocks.
  *
  * Example:
  * ```ts
  * <I18nCreateOpCode>[
  *   // For adding text nodes
  *   // ---------------------
  *   // Equivalent to:
  *   //   lView[1].appendChild(lView[0] = document.createTextNode('xyz'));
  *   'xyz', 0, 1 << SHIFT_PARENT | 0 << SHIFT_REF | AppendChild,
  *
  *   // For adding element nodes
  *   // ---------------------
  *   // Equivalent to:
  *   //   lView[1].appendChild(lView[0] = document.createElement('div'));
  *   ELEMENT_MARKER, 'div', 0, 1 << SHIFT_PARENT | 0 << SHIFT_REF | AppendChild,
  *
  *   // For adding comment nodes
  *   // ---------------------
  *   // Equivalent to:
  *   //   lView[1].appendChild(lView[0] = document.createComment(''));
  *   ICU_MARKER, '', 0, 1 << SHIFT_PARENT | 0 << SHIFT_REF | AppendChild,
  *
  *   // For moving existing nodes to a different location
  *   // --------------------------------------------------
  *   // Equivalent to:
  *   //   const node = lView[1];
  *   //   lView[2].appendChild(node);
  *   1 << SHIFT_REF | Select, 2 << SHIFT_PARENT | 0 << SHIFT_REF | AppendChild,
  *
  *   // For removing existing nodes
  *   // --------------------------------------------------
  *   //   const node = lView[1];
  *   //   removeChild(tView.data(1), node, lView);
  *   1 << SHIFT_REF | Remove,
  *
  *   // For writing attributes
  *   // --------------------------------------------------
  *   //   const node = lView[1];
  *   //   node.setAttribute('attr', 'value');
  *   1 << SHIFT_REF | Attr, 'attr', 'value'
  * ];
  * ```
  */
@js.native
trait IcuCreateOpCodes
  extends Array[Double | String | ELEMENT_MARKER | ICU_MARKER | Null]
     with I18nDebug {
  
  var __brand__ : typings.angularCore.angularCoreStrings.I18nCreateOpCodes = js.native
}
