package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGStopElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGStopElement_typekey")
  var MSHTMLDotSVGStopElement_typekey: SVGStopElement
  
  val className: SVGAnimatedString
  
  var focusable: SVGAnimatedEnumeration
  
  var offset: SVGAnimatedNumber
  
  var ownerSVGElement: ISVGSVGElement
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGStopElement {
  
  inline def apply(
    MSHTMLDotSVGStopElement_typekey: SVGStopElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    offset: SVGAnimatedNumber,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGStopElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGStopElement_typekey")(MSHTMLDotSVGStopElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStopElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGStopElement] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGStopElement_typekey(value: SVGStopElement): Self = StObject.set(x, "MSHTML.SVGStopElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: SVGAnimatedNumber): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
