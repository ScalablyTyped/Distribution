package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGStopElement extends js.Object {
  @JSName("MSHTML.SVGStopElement_typekey")
  var MSHTMLDotSVGStopElement_typekey: SVGStopElement
  val className: SVGAnimatedString
  var focusable: SVGAnimatedEnumeration
  var offset: SVGAnimatedNumber
  var ownerSVGElement: ISVGSVGElement
  var viewportElement: ISVGElement
  var xmlbase: String
}

object SVGStopElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGStopElement_typekey: SVGStopElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    offset: SVGAnimatedNumber,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGStopElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStopElement_typekey")(MSHTMLDotSVGStopElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStopElement]
  }
}

