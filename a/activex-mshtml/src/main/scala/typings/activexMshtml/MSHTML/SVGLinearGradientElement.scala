package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGLinearGradientElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGLinearGradientElement_typekey")
  var MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement
  
  val className: SVGAnimatedString
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  var gradientTransform: SVGAnimatedTransformList
  
  var gradientUnits: SVGAnimatedEnumeration
  
  val href: SVGAnimatedString
  
  var ownerSVGElement: ISVGSVGElement
  
  var spreadMethod: SVGAnimatedEnumeration
  
  var viewportElement: ISVGElement
  
  var x1: SVGAnimatedLength
  
  var x2: SVGAnimatedLength
  
  var xmlbase: String
  
  var y1: SVGAnimatedLength
  
  var y2: SVGAnimatedLength
}
object SVGLinearGradientElement {
  
  inline def apply(
    MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    x1: SVGAnimatedLength,
    x2: SVGAnimatedLength,
    xmlbase: String,
    y1: SVGAnimatedLength,
    y2: SVGAnimatedLength
  ): SVGLinearGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLinearGradientElement_typekey")(MSHTMLDotSVGLinearGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLinearGradientElement]
  }
  
  extension [Self <: SVGLinearGradientElement](x: Self) {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setGradientTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGLinearGradientElement_typekey(value: SVGLinearGradientElement): Self = StObject.set(x, "MSHTML.SVGLinearGradientElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setSpreadMethod(value: SVGAnimatedEnumeration): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setX1(value: SVGAnimatedLength): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: SVGAnimatedLength): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setY1(value: SVGAnimatedLength): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: SVGAnimatedLength): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
