package typings.atAngularCompiler.srcSelectorMod

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
  var attrs: js.Array[String] = js.native
  var classNames: js.Array[String] = js.native
  var element: String | Null = js.native
  var notSelectors: js.Array[CssSelector] = js.native
  def addAttribute(name: String): Unit = js.native
  def addAttribute(name: String, value: String): Unit = js.native
  def addClassName(name: String): Unit = js.native
  def getAttrs(): js.Array[String] = js.native
  /** Gets a template string for an element that matches the selector. */
  def getMatchingElementTemplate(): String = js.native
  def hasElementSelector(): Boolean = js.native
  def isElementSelector(): Boolean = js.native
  def setElement(): Unit = js.native
  def setElement(element: String): Unit = js.native
}

/* static members */
@JSImport("@angular/compiler/src/selector", "CssSelector")
@js.native
object CssSelector extends js.Object {
  def parse(selector: String): js.Array[CssSelector] = js.native
}

