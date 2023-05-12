package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "CssSelector")
@js.native
open class CssSelector () extends StObject {
  
  def addAttribute(name: String): Unit = js.native
  def addAttribute(name: String, value: String): Unit = js.native
  
  def addClassName(name: String): Unit = js.native
  
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
  
  /**
    * Escape `$` sequences from the CSS attribute selector.
    *
    * This is needed because `$` can have a special meaning in CSS selectors,
    * with this method we are escaping `$` with `\$'.
    * [MDN web link for more
    * info](https://developer.mozilla.org/en-US/docs/Web/CSS/Attribute_selectors).
    * @param attr the attribute to escape.
    * @returns the escaped string.
    */
  def escapeAttribute(attr: String): String = js.native
  
  def getAttrs(): js.Array[String] = js.native
  
  def hasElementSelector(): Boolean = js.native
  
  def isElementSelector(): Boolean = js.native
  
  var notSelectors: js.Array[CssSelector] = js.native
  
  def setElement(): Unit = js.native
  def setElement(element: String): Unit = js.native
  
  /**
    * Unescape `\$` sequences from the CSS attribute selector.
    *
    * This is needed because `$` can have a special meaning in CSS selectors,
    * but we might want to match an attribute that contains `$`.
    * [MDN web link for more
    * info](https://developer.mozilla.org/en-US/docs/Web/CSS/Attribute_selectors).
    * @param attr the attribute to unescape.
    * @returns the unescaped string.
    */
  def unescapeAttribute(attr: String): String = js.native
}
/* static members */
object CssSelector {
  
  @JSImport("@angular/compiler", "CssSelector")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(selector: String): js.Array[CssSelector] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[CssSelector]]
}
