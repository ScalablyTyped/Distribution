package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMarkerElement extends js.Object {
  @JSName("MSHTML.SVGMarkerElement_typekey")
  var MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var markerHeight: SVGAnimatedLength = js.native
  var markerUnits: SVGAnimatedEnumeration = js.native
  var markerWidth: SVGAnimatedLength = js.native
  var orientAngle: SVGAnimatedAngle = js.native
  var orientType: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  var refX: SVGAnimatedLength = js.native
  var refY: SVGAnimatedLength = js.native
  val viewBox: SVGAnimatedRect = js.native
  var viewportElement: ISVGElement = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  def setOrientToAngle(pSVGAngle: SVGAngle): Unit = js.native
  def setOrientToAuto(): Unit = js.native
}

object SVGMarkerElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    markerHeight: SVGAnimatedLength,
    markerUnits: SVGAnimatedEnumeration,
    markerWidth: SVGAnimatedLength,
    orientAngle: SVGAnimatedAngle,
    orientType: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    refX: SVGAnimatedLength,
    refY: SVGAnimatedLength,
    setOrientToAngle: SVGAngle => Unit,
    setOrientToAuto: () => Unit,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGMarkerElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerUnits = markerUnits.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], orientAngle = orientAngle.asInstanceOf[js.Any], orientType = orientType.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], refX = refX.asInstanceOf[js.Any], refY = refY.asInstanceOf[js.Any], setOrientToAngle = js.Any.fromFunction1(setOrientToAngle), setOrientToAuto = js.Any.fromFunction0(setOrientToAuto), viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMarkerElement_typekey")(MSHTMLDotSVGMarkerElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMarkerElement]
  }
  @scala.inline
  implicit class SVGMarkerElementOps[Self <: SVGMarkerElement] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGMarkerElement_typekey(value: SVGMarkerElement): Self = this.set("MSHTML.SVGMarkerElement_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerHeight(value: SVGAnimatedLength): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerUnits(value: SVGAnimatedEnumeration): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerWidth(value: SVGAnimatedLength): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientAngle(value: SVGAnimatedAngle): Self = this.set("orientAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientType(value: SVGAnimatedEnumeration): Self = this.set("orientType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefX(value: SVGAnimatedLength): Self = this.set("refX", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefY(value: SVGAnimatedLength): Self = this.set("refY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetOrientToAngle(value: SVGAngle => Unit): Self = this.set("setOrientToAngle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOrientToAuto(value: () => Unit): Self = this.set("setOrientToAuto", js.Any.fromFunction0(value))
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

