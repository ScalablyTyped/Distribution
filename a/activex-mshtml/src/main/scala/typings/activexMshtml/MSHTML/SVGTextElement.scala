package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTextElement extends StObject {
  
  @JSName("MSHTML.SVGTextElement_typekey")
  var MSHTMLDotSVGTextElement_typekey: SVGTextElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  var dx: SVGAnimatedLengthList = js.native
  
  var dy: SVGAnimatedLengthList = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  val farthestViewportElement: ISVGElement = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  def getBBox(): SVGRect = js.native
  
  def getCTM(): SVGMatrix = js.native
  
  def getCharNumAtPosition(point: SVGPoint): Double = js.native
  
  def getComputedTextLength(): Double = js.native
  
  def getEndPositionOfChar(charnum: Double): SVGPoint = js.native
  
  def getExtentOfChar(charnum: Double): SVGRect = js.native
  
  def getNumberOfChars(): Double = js.native
  
  def getRotationOfChar(charnum: Double): Double = js.native
  
  def getScreenCTM(): SVGMatrix = js.native
  
  def getStartPositionOfChar(charnum: Double): SVGPoint = js.native
  
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  
  def hasExtension(extension: String): Boolean = js.native
  
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  
  val nearestViewportElement: ISVGElement = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  val requiredExtensions: SVGStringList = js.native
  
  val requiredFeatures: SVGStringList = js.native
  
  var rotate: SVGAnimatedNumberList = js.native
  
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  var textLength: SVGAnimatedLength = js.native
  
  val transform: SVGAnimatedTransformList = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var x: SVGAnimatedLengthList = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
  
  var y: SVGAnimatedLengthList = js.native
}
object SVGTextElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGTextElement_typekey: SVGTextElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getScreenCTM: () => SVGMatrix,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTextElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextElement_typekey")(MSHTMLDotSVGTextElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextElement]
  }
  
  @scala.inline
  implicit class SVGTextElementMutableBuilder[Self <: SVGTextElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: SVGAnimatedLengthList): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: SVGAnimatedLengthList): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCharNumAtPosition(value: SVGPoint => Double): Self = StObject.set(x, "getCharNumAtPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComputedTextLength(value: () => Double): Self = StObject.set(x, "getComputedTextLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndPositionOfChar(value: Double => SVGPoint): Self = StObject.set(x, "getEndPositionOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExtentOfChar(value: Double => SVGRect): Self = StObject.set(x, "getExtentOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumberOfChars(value: () => Double): Self = StObject.set(x, "getNumberOfChars", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRotationOfChar(value: Double => Double): Self = StObject.set(x, "getRotationOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartPositionOfChar(value: Double => SVGPoint): Self = StObject.set(x, "getStartPositionOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubStringLength(value: (Double, Double) => Double): Self = StObject.set(x, "getSubStringLength", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLengthAdjust(value: SVGAnimatedEnumeration): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGTextElement_typekey(value: SVGTextElement): Self = StObject.set(x, "MSHTML.SVGTextElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: SVGAnimatedNumberList): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSubString(value: (Double, Double) => Unit): Self = StObject.set(x, "selectSubString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLength(value: SVGAnimatedLength): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLengthList): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLengthList): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
