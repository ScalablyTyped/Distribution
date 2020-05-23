package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGStyleElement extends js.Object {
  @JSName("MSHTML.SVGStyleElement_typekey")
  var MSHTMLDotSVGStyleElement_typekey: SVGStyleElement
  var focusable: SVGAnimatedEnumeration
  var media: String
  var ownerSVGElement: ISVGSVGElement
  var `type`: String
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
}

object SVGStyleElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGStyleElement_typekey: SVGStyleElement,
    focusable: SVGAnimatedEnumeration,
    media: String,
    ownerSVGElement: ISVGSVGElement,
    `type`: String,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGStyleElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStyleElement_typekey")(MSHTMLDotSVGStyleElement_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStyleElement]
  }
}

