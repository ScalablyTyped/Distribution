package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGMetadataElement extends js.Object {
  @JSName("MSHTML.SVGMetadataElement_typekey")
  var MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var viewportElement: ISVGElement
  var xmlbase: String
}

object SVGMetadataElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGMetadataElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMetadataElement_typekey")(MSHTMLDotSVGMetadataElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMetadataElement]
  }
}

