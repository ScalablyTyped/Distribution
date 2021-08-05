package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGImageElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGImageElement_typekey")
  var MSHTMLDotSVGImageElement_typekey: SVGImageElement
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getScreenCTM(): SVGMatrix
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  var height: SVGAnimatedLength
  
  val href: SVGAnimatedString
  
  val nearestViewportElement: ISVGElement
  
  var ownerSVGElement: ISVGSVGElement
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  val systemLanguage: SVGStringList
  
  val transform: SVGAnimatedTransformList
  
  val viewBox: SVGAnimatedRect
  
  var viewportElement: ISVGElement
  
  var width: SVGAnimatedLength
  
  var x: SVGAnimatedLength
  
  var xmlbase: String
  
  var y: SVGAnimatedLength
}
object SVGImageElement {
  
  inline def apply(
    MSHTMLDotSVGImageElement_typekey: SVGImageElement,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    y: SVGAnimatedLength
  ): SVGImageElement = {
    val __obj = js.Dynamic.literal(farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGImageElement_typekey")(MSHTMLDotSVGImageElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGImageElement]
  }
  
  extension [Self <: SVGImageElement](x: Self) {
    
    inline def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    inline def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    inline def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    inline def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGImageElement_typekey(value: SVGImageElement): Self = StObject.set(x, "MSHTML.SVGImageElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
