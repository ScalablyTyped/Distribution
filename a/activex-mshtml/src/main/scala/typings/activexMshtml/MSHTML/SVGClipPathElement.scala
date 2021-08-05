package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGClipPathElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGClipPathElement_typekey")
  var MSHTMLDotSVGClipPathElement_typekey: SVGClipPathElement
  
  val className: SVGAnimatedString
  
  var clipPathUnits: SVGAnimatedEnumeration
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getScreenCTM(): SVGMatrix
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  val nearestViewportElement: ISVGElement
  
  var ownerSVGElement: ISVGSVGElement
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  val systemLanguage: SVGStringList
  
  val transform: SVGAnimatedTransformList
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
}
object SVGClipPathElement {
  
  inline def apply(
    MSHTMLDotSVGClipPathElement_typekey: SVGClipPathElement,
    className: SVGAnimatedString,
    clipPathUnits: SVGAnimatedEnumeration,
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
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGClipPathElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], clipPathUnits = clipPathUnits.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGClipPathElement_typekey")(MSHTMLDotSVGClipPathElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGClipPathElement]
  }
  
  extension [Self <: SVGClipPathElement](x: Self) {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClipPathUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setGetBBox(value: () => SVGRect): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
    
    inline def setGetCTM(value: () => SVGMatrix): Self = StObject.set(x, "getCTM", js.Any.fromFunction0(value))
    
    inline def setGetScreenCTM(value: () => SVGMatrix): Self = StObject.set(x, "getScreenCTM", js.Any.fromFunction0(value))
    
    inline def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotSVGClipPathElement_typekey(value: SVGClipPathElement): Self = StObject.set(x, "MSHTML.SVGClipPathElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
  }
}
