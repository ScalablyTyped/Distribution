package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGStyleElement extends js.Object {
  @JSName("MSHTML.SVGStyleElement_typekey")
  var MSHTMLDotSVGStyleElement_typekey: SVGStyleElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var media: String = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var `type`: String = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
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
  @scala.inline
  implicit class SVGStyleElementOps[Self <: SVGStyleElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotSVGStyleElement_typekey(value: SVGStyleElement): Self = this.set("MSHTML.SVGStyleElement_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmllang(value: String): Self = this.set("xmllang", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlspace(value: String): Self = this.set("xmlspace", value.asInstanceOf[js.Any])
  }
  
}

