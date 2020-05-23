package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGViewElement extends js.Object {
  @JSName("MSHTML.SVGViewElement_typekey")
  var MSHTMLDotSVGViewElement_typekey: SVGViewElement
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val viewBox: SVGAnimatedRect
  var viewTarget: SVGStringList
  var viewportElement: ISVGElement
  var xmlbase: String
  val zoomAndPan: Double
}

object SVGViewElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGViewElement_typekey: SVGViewElement,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewTarget: SVGStringList,
    viewportElement: ISVGElement,
    xmlbase: String,
    zoomAndPan: Double
  ): SVGViewElement = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewTarget = viewTarget.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGViewElement_typekey")(MSHTMLDotSVGViewElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGViewElement]
  }
}

