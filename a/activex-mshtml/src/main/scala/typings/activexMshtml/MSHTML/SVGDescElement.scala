package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGDescElement extends js.Object {
  @JSName("MSHTML.SVGDescElement_typekey")
  var MSHTMLDotSVGDescElement_typekey: SVGDescElement
  val className: SVGAnimatedString
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
}

object SVGDescElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGDescElement_typekey: SVGDescElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGDescElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGDescElement_typekey")(MSHTMLDotSVGDescElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGDescElement]
  }
}

