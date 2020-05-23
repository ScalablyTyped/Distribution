package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTitleElement extends js.Object {
  @JSName("MSHTML.SVGTitleElement_typekey")
  var MSHTMLDotSVGTitleElement_typekey: SVGTitleElement
  val className: SVGAnimatedString
  var focusable: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
}

object SVGTitleElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGTitleElement_typekey: SVGTitleElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGTitleElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTitleElement_typekey")(MSHTMLDotSVGTitleElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTitleElement]
  }
}

