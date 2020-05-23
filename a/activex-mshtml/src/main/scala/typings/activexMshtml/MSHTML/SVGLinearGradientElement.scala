package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLinearGradientElement extends js.Object {
  @JSName("MSHTML.SVGLinearGradientElement_typekey")
  var MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var gradientTransform: SVGAnimatedTransformList
  var gradientUnits: SVGAnimatedEnumeration
  val href: SVGAnimatedString
  var ownerSVGElement: ISVGSVGElement
  var spreadMethod: SVGAnimatedEnumeration
  var viewportElement: ISVGElement
  var x1: SVGAnimatedLength
  var x2: SVGAnimatedLength
  var xmlbase: String
  var y1: SVGAnimatedLength
  var y2: SVGAnimatedLength
}

object SVGLinearGradientElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    x1: SVGAnimatedLength,
    x2: SVGAnimatedLength,
    xmlbase: String,
    y1: SVGAnimatedLength,
    y2: SVGAnimatedLength
  ): SVGLinearGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLinearGradientElement_typekey")(MSHTMLDotSVGLinearGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLinearGradientElement]
  }
}

