package typings.angularDashSanitize.angularDashSanitizeMod.angularMod.sanitizeNs

import typings.angularDashSanitize.Anon_HtmlElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates and configures $sanitize instance.
  */
@js.native
trait ISanitizeProvider extends js.Object {
  /**
    * Extends the built-in list of valid attributes, i.e. attributes that are considered safe and are not stripped off during sanitization.
    *
    * Note: The new attributes will not be treated as URI attributes, which means their values will not be sanitized as URIs using $compileProvider's aHrefSanitizationWhitelist and imgSrcSanitizationWhitelist.
    * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#addValidAttrs
    * @param attrs A list of valid attributes.
    */
  def addValidAttrs(attrs: js.Array[String]): ISanitizeProvider = js.native
  /**
    * Extends the built-in lists of valid HTML/SVG elements, i.e. elements that are considered safe and are not stripped off during sanitization.
    *
    * You can extend the following lists of elements:
    * htmlElements: A list of elements (tag names) to extend the current list of safe HTML elements. HTML elements considered safe will not be removed during sanitization. All other elements will be stripped off.
    * htmlVoidElements: This is similar to htmlElements, but marks the elements as "void elements" (similar to HTML void elements). These elements have no end tag and cannot have content.
    * svgElements: This is similar to htmlElements, but for SVG elements. This list is only taken into account if SVG is enabled for $sanitize.
    *
    * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#addValidElements
    * @param elements A list of valid HTML elements or an object with one or more of the following properties: htmlElements, htmlVoidElements, svgElements
    */
  def addValidElements(elements: js.Array[String]): ISanitizeProvider = js.native
  def addValidElements(elements: Anon_HtmlElements): ISanitizeProvider = js.native
  def enableSvg(): Boolean | ISanitizeProvider = js.native
  def enableSvg(flag: Boolean): Boolean | ISanitizeProvider = js.native
  /**
    * Enables a subset of svg to be supported by the sanitizer.
    *
    * @see https://code.angularjs.org/1.7.0/docs/api/ngSanitize/provider/$sanitizeProvider#enableSvg
    * @param flag Enable or disable SVG support in the sanitizer.
    */
  @JSName("enableSvg")
  def enableSvg_Boolean(): Boolean = js.native
  @JSName("enableSvg")
  def enableSvg_ISanitizeProvider(flag: Boolean): ISanitizeProvider = js.native
}

