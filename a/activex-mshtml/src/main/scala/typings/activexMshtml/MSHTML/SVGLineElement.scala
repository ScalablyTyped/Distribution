package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGLineElement extends js.Object {
  @JSName("MSHTML.SVGLineElement_typekey")
  var MSHTMLDotSVGLineElement_typekey: SVGLineElement = js.native
  val className: SVGAnimatedString = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  val systemLanguage: SVGStringList = js.native
  val transform: SVGAnimatedTransformList = js.native
  var viewportElement: ISVGElement = js.native
  var x1: SVGAnimatedLength = js.native
  var x2: SVGAnimatedLength = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y1: SVGAnimatedLength = js.native
  var y2: SVGAnimatedLength = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: String): Boolean = js.native
}

object SVGLineElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGLineElement_typekey: SVGLineElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    x1: SVGAnimatedLength,
    x2: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y1: SVGAnimatedLength,
    y2: SVGAnimatedLength
  ): SVGLineElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLineElement_typekey")(MSHTMLDotSVGLineElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLineElement]
  }
  @scala.inline
  implicit class SVGLineElementOps[Self <: SVGLineElement] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGLineElement_typekey(value: SVGLineElement): Self = this.set("MSHTML.SVGLineElement_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setFarthestViewportElement(value: ISVGElement): Self = this.set("farthestViewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = this.set("getBBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = this.set("getCTM", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = this.set("getScreenCTM", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = this.set("getTransformToElement", js.Any.fromFunction1(value))
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = this.set("hasExtension", js.Any.fromFunction1(value))
    @scala.inline
    def setNearestViewportElement(value: ISVGElement): Self = this.set("nearestViewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: SVGAnimatedTransformList): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: SVGAnimatedLength): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: SVGAnimatedLength): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmllang(value: String): Self = this.set("xmllang", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlspace(value: String): Self = this.set("xmlspace", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: SVGAnimatedLength): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: SVGAnimatedLength): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

