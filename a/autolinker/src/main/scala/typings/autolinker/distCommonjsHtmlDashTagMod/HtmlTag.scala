package typings.autolinker.distCommonjsHtmlDashTagMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/html-tag", "HtmlTag")
@js.native
/**
  * @method constructor
  * @param {Object} [cfg] The configuration properties for this class, in an Object (map)
  */
class HtmlTag () extends js.Object {
  def this(cfg: HtmlTagCfg) = this()
  /**
    * @cfg {Object.<String, String>} attrs
    *
    * An key/value Object (map) of attributes to create the tag with. The keys are the attribute names, and the
    * values are the attribute values.
    */
  var attrs: js.Any = js.native
  /**
    * @cfg {String} innerHTML
    *
    * The inner HTML for the tag.
    */
  var innerHTML: js.Any = js.native
  /**
    * @cfg {String} tagName
    *
    * The tag name. Ex: 'a', 'button', etc.
    *
    * Not required at instantiation time, but should be set using {@link #setTagName} before {@link #toAnchorString}
    * is executed.
    */
  var tagName: js.Any = js.native
  /**
    * @protected
    * @property {RegExp} whitespaceRegex
    *
    * Regular expression used to match whitespace in a string of CSS classes.
    */
  var whitespaceRegex: RegExp = js.native
  /**
    * Convenience method to add one or more CSS classes to the HtmlTag. Will not add duplicate CSS classes.
    *
    * @param {String} cssClass One or more space-separated CSS classes to add.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def addClass(cssClass: String): this.type = js.native
  /**
    * Support method for {@link #toAnchorString}, returns the string space-separated key="value" pairs, used to populate
    * the stringified HtmlTag.
    *
    * @protected
    * @return {String} Example return: `attr1="value1" attr2="value2"`
    */
  /* protected */ def buildAttrsStr(): String = js.native
  /**
    * Retrieves an attribute from the HtmlTag. If the attribute does not exist, returns `undefined`.
    *
    * @param {String} attrName The attribute name to retrieve.
    * @return {String} The attribute's value, or `undefined` if it does not exist on the HtmlTag.
    */
  def getAttr(attrName: String): String = js.native
  /**
    * Retrieves the attributes Object (map) for the HtmlTag.
    *
    * @return {Object.<String, String>} A key/value object of the attributes for the HtmlTag.
    */
  def getAttrs(): StringDictionary[String] = js.native
  /**
    * Retrieves the inner HTML for the tag.
    *
    * @return {String}
    */
  def getInnerHTML(): String = js.native
  /**
    * Backward compatibility method name.
    *
    * @return {String}
    */
  def getInnerHtml(): String = js.native
  /**
    * Retrieves the tag name.
    *
    * @return {String}
    */
  def getTagName(): String = js.native
  /**
    * Convenience method to check if the tag has a CSS class or not.
    *
    * @param {String} cssClass The CSS class to check for.
    * @return {Boolean} `true` if the HtmlTag has the CSS class, `false` otherwise.
    */
  def hasClass(cssClass: String): Boolean = js.native
  /**
    * Convenience method to remove one or more CSS classes from the HtmlTag.
    *
    * @param {String} cssClass One or more space-separated CSS classes to remove.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def removeClass(cssClass: String): this.type = js.native
  /**
    * Sets an attribute on the HtmlTag.
    *
    * @param {String} attrName The attribute name to set.
    * @param {String} attrValue The attribute value to set.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setAttr(attrName: String, attrValue: String): this.type = js.native
  /**
    * Sets one or more attributes on the HtmlTag.
    *
    * @param {Object.<String, String>} attrs A key/value Object (map) of the attributes to set.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setAttrs(attrs: StringDictionary[String]): this.type = js.native
  /**
    * Sets the provided `cssClass`, overwriting any current CSS classes on the HtmlTag.
    *
    * @param {String} cssClass One or more space-separated CSS classes to set (overwrite).
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setClass(cssClass: String): this.type = js.native
  /**
    * Sets the inner HTML for the tag.
    *
    * @param {String} html The inner HTML to set.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setInnerHTML(html: String): this.type = js.native
  /**
    * Backwards compatibility method name.
    *
    * @param {String} html The inner HTML to set.
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setInnerHtml(html: String): this.type = js.native
  /**
    * Sets the tag name that will be used to generate the tag with.
    *
    * @param {String} tagName
    * @return {Autolinker.HtmlTag} This HtmlTag instance, so that method calls may be chained.
    */
  def setTagName(tagName: String): this.type = js.native
  /**
    * Override of superclass method used to generate the HTML string for the tag.
    *
    * @return {String}
    */
  def toAnchorString(): String = js.native
}

