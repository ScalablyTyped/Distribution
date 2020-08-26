package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGElement extends js.Object {
  @JSName("MSHTML.ISVGElement_typekey")
  var MSHTMLDotISVGElement_typekey: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
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
  @scala.inline
  implicit class ISVGElementOps[Self <: ISVGElement] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGElement_typekey(value: ISVGElement): Self = this.set("MSHTML.ISVGElement_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
  }
  
}

