package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTextPositioningElement extends js.Object {
  
  @JSName("MSHTML.SVGTextPositioningElement_typekey")
  var MSHTMLDotSVGTextPositioningElement_typekey: SVGTextPositioningElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  var dx: SVGAnimatedLengthList = js.native
  
  var dy: SVGAnimatedLengthList = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  def getCharNumAtPosition(point: SVGPoint): Double = js.native
  
  def getComputedTextLength(): Double = js.native
  
  def getEndPositionOfChar(charnum: Double): SVGPoint = js.native
  
  def getExtentOfChar(charnum: Double): SVGRect = js.native
  
  def getNumberOfChars(): Double = js.native
  
  def getRotationOfChar(charnum: Double): Double = js.native
  
  def getStartPositionOfChar(charnum: Double): SVGPoint = js.native
  
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  def hasExtension(extension: String): Boolean = js.native
  
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  var rotate: SVGAnimatedNumberList = js.native
  
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  var textLength: SVGAnimatedLength = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var x: SVGAnimatedLengthList = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
  
  var y: SVGAnimatedLengthList = js.native
}
object SVGTextPositioningElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGTextPositioningElement_typekey: SVGTextPositioningElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTextPositioningElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextPositioningElement_typekey")(MSHTMLDotSVGTextPositioningElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextPositioningElement]
  }
  
  @scala.inline
  implicit class SVGTextPositioningElementOps[Self <: SVGTextPositioningElement] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGTextPositioningElement_typekey(value: SVGTextPositioningElement): Self = this.set("MSHTML.SVGTextPositioningElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: SVGAnimatedLengthList): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: SVGAnimatedLengthList): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCharNumAtPosition(value: SVGPoint => Double): Self = this.set("getCharNumAtPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComputedTextLength(value: () => Double): Self = this.set("getComputedTextLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndPositionOfChar(value: Double => SVGPoint): Self = this.set("getEndPositionOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExtentOfChar(value: Double => SVGRect): Self = this.set("getExtentOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberOfChars(value: () => Double): Self = this.set("getNumberOfChars", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRotationOfChar(value: Double => Double): Self = this.set("getRotationOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStartPositionOfChar(value: Double => SVGPoint): Self = this.set("getStartPositionOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubStringLength(value: (Double, Double) => Double): Self = this.set("getSubStringLength", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = this.set("hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLengthAdjust(value: SVGAnimatedEnumeration): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = this.set("ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: SVGAnimatedNumberList): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSubString(value: (Double, Double) => Unit): Self = this.set("selectSubString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLength(value: SVGAnimatedLength): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLengthList): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = this.set("xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = this.set("xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = this.set("xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLengthList): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
