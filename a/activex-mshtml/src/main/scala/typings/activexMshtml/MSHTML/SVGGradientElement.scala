package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGGradientElement extends js.Object {
  @JSName("MSHTML.SVGGradientElement_typekey")
  var MSHTMLDotSVGGradientElement_typekey: SVGGradientElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var gradientTransform: SVGAnimatedTransformList
  var gradientUnits: SVGAnimatedEnumeration
  val href: SVGAnimatedString
  var ownerSVGElement: ISVGSVGElement
  var spreadMethod: SVGAnimatedEnumeration
  var viewportElement: ISVGElement
  var xmlbase: String
}

object SVGGradientElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGGradientElement_typekey: SVGGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGGradientElement_typekey")(MSHTMLDotSVGGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGGradientElement]
  }
}

