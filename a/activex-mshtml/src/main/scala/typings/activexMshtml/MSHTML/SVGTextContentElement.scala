package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTextContentElement extends StObject {
  
  @JSName("MSHTML.SVGTextContentElement_typekey")
  var MSHTMLDotSVGTextContentElement_typekey: SVGTextContentElement = js.native
  
  val className: SVGAnimatedString = js.native
  
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
  
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  val systemLanguage: SVGStringList = js.native
  
  var textLength: SVGAnimatedLength = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
}
object SVGTextContentElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGTextContentElement_typekey: SVGTextContentElement,
    className: SVGAnimatedString,
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
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGTextContentElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextContentElement_typekey")(MSHTMLDotSVGTextContentElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextContentElement]
  }
  
  @scala.inline
  implicit class SVGTextContentElementMutableBuilder[Self <: SVGTextContentElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
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
    def setGetStartPositionOfChar(value: Double => SVGPoint): Self = StObject.set(x, "getStartPositionOfChar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubStringLength(value: (Double, Double) => Double): Self = StObject.set(x, "getSubStringLength", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLengthAdjust(value: SVGAnimatedEnumeration): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGTextContentElement_typekey(value: SVGTextContentElement): Self = StObject.set(x, "MSHTML.SVGTextContentElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectSubString(value: (Double, Double) => Unit): Self = StObject.set(x, "selectSubString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLength(value: SVGAnimatedLength): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
  }
}
