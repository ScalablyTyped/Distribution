package typings.angularCore.propertyNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type that describes a property name with an obtainable text. */
/* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreStrings.isInJSDocNamespace
  - typings.angularCore.angularCoreStrings.escapedText
  - typings.angularCore.angularCoreStrings.text
  - typings.angularCore.angularCoreStrings.originalKeywordKind
*/
trait PropertyNameWithText extends js.Object

object PropertyNameWithText {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def escapedText: typings.angularCore.angularCoreStrings.escapedText = this.cast("escapedText")
  @scala.inline
  def isInJSDocNamespace: typings.angularCore.angularCoreStrings.isInJSDocNamespace = this.cast("isInJSDocNamespace")
  @scala.inline
  def originalKeywordKind: typings.angularCore.angularCoreStrings.originalKeywordKind = this.cast("originalKeywordKind")
  @scala.inline
  def text: typings.angularCore.angularCoreStrings.text = this.cast("text")
}

