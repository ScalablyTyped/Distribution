package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGSymbolElement extends js.Object {
  @JSName("MSHTML.SVGSymbolElement_typekey")
  var MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val viewBox: SVGAnimatedRect
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
}

object SVGSymbolElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGSymbolElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSymbolElement_typekey")(MSHTMLDotSVGSymbolElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSymbolElement]
  }
}

