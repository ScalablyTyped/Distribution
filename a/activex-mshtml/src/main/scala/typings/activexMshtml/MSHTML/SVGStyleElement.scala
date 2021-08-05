package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGStyleElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGStyleElement_typekey")
  var MSHTMLDotSVGStyleElement_typekey: SVGStyleElement
  
  var focusable: SVGAnimatedEnumeration
  
  var media: String
  
  var ownerSVGElement: ISVGSVGElement
  
  var `type`: String
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
}
object SVGStyleElement {
  
  inline def apply(
    MSHTMLDotSVGStyleElement_typekey: SVGStyleElement,
    focusable: SVGAnimatedEnumeration,
    media: String,
    ownerSVGElement: ISVGSVGElement,
    `type`: String,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGStyleElement = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStyleElement_typekey")(MSHTMLDotSVGStyleElement_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStyleElement]
  }
  
  extension [Self <: SVGStyleElement](x: Self) {
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGStyleElement_typekey(value: SVGStyleElement): Self = StObject.set(x, "MSHTML.SVGStyleElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
  }
}
