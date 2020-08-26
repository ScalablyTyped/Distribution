package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGSymbolElement extends js.Object {
  @JSName("MSHTML.SVGSymbolElement_typekey")
  var MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
}

object SVGSymbolElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGSymbolElement_typekey: SVGSymbolElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGSymbolElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSymbolElement_typekey")(MSHTMLDotSVGSymbolElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSymbolElement]
  }
  @scala.inline
  implicit class SVGSymbolElementOps[Self <: SVGSymbolElement] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGSymbolElement_typekey(value: SVGSymbolElement): Self = this.set("MSHTML.SVGSymbolElement_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = this.set("viewBox", value.asInstanceOf[js.Any])
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

