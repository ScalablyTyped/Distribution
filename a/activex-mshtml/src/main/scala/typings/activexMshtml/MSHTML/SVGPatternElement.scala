package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPatternElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPatternElement_typekey")
  var MSHTMLDotSVGPatternElement_typekey: SVGPatternElement
  
  val className: SVGAnimatedString
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  def hasExtension(`extension`: String): Boolean
  
  var height: SVGAnimatedLength
  
  val href: SVGAnimatedString
  
  var ownerSVGElement: ISVGSVGElement
  
  var patternContentUnits: SVGAnimatedEnumeration
  
  var patternTransform: SVGAnimatedTransformList
  
  var patternUnits: SVGAnimatedEnumeration
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  val systemLanguage: SVGStringList
  
  val viewBox: SVGAnimatedRect
  
  var viewportElement: ISVGElement
  
  var width: SVGAnimatedLength
  
  var x: SVGAnimatedLength
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
  
  var y: SVGAnimatedLength
}
object SVGPatternElement {
  
  inline def apply(
    MSHTMLDotSVGPatternElement_typekey: SVGPatternElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    patternContentUnits: SVGAnimatedEnumeration,
    patternTransform: SVGAnimatedTransformList,
    patternUnits: SVGAnimatedEnumeration,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGPatternElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], patternContentUnits = patternContentUnits.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], patternUnits = patternUnits.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPatternElement_typekey")(MSHTMLDotSVGPatternElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPatternElement]
  }
  
  extension [Self <: SVGPatternElement](x: Self) {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGPatternElement_typekey(value: SVGPatternElement): Self = StObject.set(x, "MSHTML.SVGPatternElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setPatternContentUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    inline def setPatternTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    inline def setPatternUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    inline def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
