package typings
package atAngularCompilerLib.srcSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/selector", "CssSelector")
@js.native
class CssSelector () extends js.Object {
  /**
       * The selectors are encoded in pairs where:
       * - even locations are attribute names
       * - odd locations are attribute values.
       *
       * Example:
       * Selector: `[key1=value1][key2]` would parse to:
       * ```
       * ['key1', 'value1', 'key2', '']
       * ```
       */
  var attrs: js.Array[java.lang.String] = js.native
  var classNames: js.Array[java.lang.String] = js.native
  var element: java.lang.String | scala.Null = js.native
  var notSelectors: js.Array[CssSelector] = js.native
  def addAttribute(name: java.lang.String): scala.Unit = js.native
  def addAttribute(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addClassName(name: java.lang.String): scala.Unit = js.native
  def getAttrs(): js.Array[java.lang.String] = js.native
  /** Gets a template string for an element that matches the selector. */
  def getMatchingElementTemplate(): java.lang.String = js.native
  def hasElementSelector(): scala.Boolean = js.native
  def isElementSelector(): scala.Boolean = js.native
  def setElement(): scala.Unit = js.native
  def setElement(element: java.lang.String): scala.Unit = js.native
}

@JSImport("@angular/compiler/src/selector", "CssSelector")
@js.native
object CssSelector extends js.Object {
  def parse(selector: java.lang.String): js.Array[atAngularCompilerLib.srcSelectorMod.CssSelector] = js.native
}

