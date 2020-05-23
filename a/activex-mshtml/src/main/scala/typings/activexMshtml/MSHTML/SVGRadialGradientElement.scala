package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGRadialGradientElement extends js.Object {
  @JSName("MSHTML.SVGRadialGradientElement_typekey")
  var MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement
  val className: SVGAnimatedString
  var cx: SVGAnimatedLength
  var cy: SVGAnimatedLength
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var fx: SVGAnimatedLength
  var fy: SVGAnimatedLength
  var gradientTransform: SVGAnimatedTransformList
  var gradientUnits: SVGAnimatedEnumeration
  val href: SVGAnimatedString
  var ownerSVGElement: ISVGSVGElement
  var r: SVGAnimatedLength
  var spreadMethod: SVGAnimatedEnumeration
  var viewportElement: ISVGElement
  var xmlbase: String
}

object SVGRadialGradientElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement,
    className: SVGAnimatedString,
    cx: SVGAnimatedLength,
    cy: SVGAnimatedLength,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    fx: SVGAnimatedLength,
    fy: SVGAnimatedLength,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    r: SVGAnimatedLength,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGRadialGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRadialGradientElement_typekey")(MSHTMLDotSVGRadialGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRadialGradientElement]
  }
}

