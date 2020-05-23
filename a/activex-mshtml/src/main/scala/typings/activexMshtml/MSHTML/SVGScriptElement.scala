package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGScriptElement extends js.Object {
  @JSName("MSHTML.SVGScriptElement_typekey")
  var MSHTMLDotSVGScriptElement_typekey: SVGScriptElement
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  val href: SVGAnimatedString
  var ownerSVGElement: ISVGSVGElement
  var `type`: String
  var viewportElement: ISVGElement
  var xmlbase: String
}

object SVGScriptElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGScriptElement_typekey: SVGScriptElement,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    `type`: String,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGScriptElement = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGScriptElement_typekey")(MSHTMLDotSVGScriptElement_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGScriptElement]
  }
}

