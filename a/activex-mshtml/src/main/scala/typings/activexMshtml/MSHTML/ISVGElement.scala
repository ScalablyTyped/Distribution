package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGElement extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGElement_typekey")
  var MSHTMLDotISVGElement_typekey: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  var ownerSVGElement: ISVGSVGElement
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object ISVGElement {
  
  inline def apply(
    MSHTMLDotISVGElement_typekey: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): ISVGElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElement_typekey")(MSHTMLDotISVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElement]
  }
  
  extension [Self <: ISVGElement](x: Self) {
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotISVGElement_typekey(value: ISVGElement): Self = StObject.set(x, "MSHTML.ISVGElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
