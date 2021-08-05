package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGMetadataElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGMetadataElement_typekey")
  var MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement
  
  var focusable: SVGAnimatedEnumeration
  
  var ownerSVGElement: ISVGSVGElement
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGMetadataElement {
  
  inline def apply(
    MSHTMLDotSVGMetadataElement_typekey: SVGMetadataElement,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGMetadataElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMetadataElement_typekey")(MSHTMLDotSVGMetadataElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMetadataElement]
  }
  
  extension [Self <: SVGMetadataElement](x: Self) {
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGMetadataElement_typekey(value: SVGMetadataElement): Self = StObject.set(x, "MSHTML.SVGMetadataElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
