package typings.angularCore.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Array storing OpCode for dynamically creating `i18n` translation DOM elements.
  *
  * This array creates a sequence of `Text` and `Comment` (as ICU anchor) DOM elements. It consists
  * of a pair of `number` and `string` pairs which encode the operations for the creation of the
  * translated block.
  *
  * The number is shifted and encoded according to `I18nCreateOpCode`
  *
  * Pseudocode:
  * ```
  * const i18nCreateOpCodes = [
  *   10 << I18nCreateOpCode.SHIFT, "Text Node add to DOM",
  *   11 << I18nCreateOpCode.SHIFT | I18nCreateOpCode.COMMENT, "Comment Node add to DOM",
  *   12 << I18nCreateOpCode.SHIFT | I18nCreateOpCode.APPEND_LATER, "Text Node added later"
  * ];
  *
  * for(var i=0; i<i18nCreateOpCodes.length; i++) {
  *   const opcode = i18NCreateOpCodes[i++];
  *   const index = opcode >> I18nCreateOpCode.SHIFT;
  *   const text = i18NCreateOpCodes[i];
  *   let node: Text|Comment;
  *   if (opcode & I18nCreateOpCode.COMMENT === I18nCreateOpCode.COMMENT) {
  *     node = lView[~index] = document.createComment(text);
  *   } else {
  *     node = lView[index] = document.createText(text);
  *   }
  *   if (opcode & I18nCreateOpCode.APPEND_EAGERLY !== I18nCreateOpCode.APPEND_EAGERLY) {
  *     parentNode.appendChild(node);
  *   }
  * }
  * ```
  */
@js.native
trait I18nCreateOpCodes
  extends StObject
     with Array[Double | String]
     with I18nDebug {
  
  var __brand__ : "I18nCreateOpCodes" = js.native
}
