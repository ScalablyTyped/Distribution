package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGStopElement extends StObject {
  
  @JSName("MSHTML.SVGStopElement_typekey")
  var MSHTMLDotSVGStopElement_typekey: SVGStopElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var offset: SVGAnimatedNumber = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
}
object SVGStopElement {
  
  @scala.inline
  def apply(
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
  implicit class SVGStopElementMutableBuilder[Self <: SVGStopElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGStopElement_typekey(value: SVGStopElement): Self = StObject.set(x, "MSHTML.SVGStopElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: SVGAnimatedNumber): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
