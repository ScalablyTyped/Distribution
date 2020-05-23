package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGElement extends js.Object {
  @JSName("MSHTML.ISVGElement_typekey")
  var MSHTMLDotISVGElement_typekey: ISVGElement
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var viewportElement: ISVGElement
  var xmlbase: String
}

object ISVGElement {
  @scala.inline
  def apply(
    MSHTMLDotISVGElement_typekey: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): ISVGElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElement_typekey")(MSHTMLDotISVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElement]
  }
}

