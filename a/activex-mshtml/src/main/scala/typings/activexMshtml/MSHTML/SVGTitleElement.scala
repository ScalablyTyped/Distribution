package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTitleElement extends StObject {
  
  @JSName("MSHTML.SVGTitleElement_typekey")
  var MSHTMLDotSVGTitleElement_typekey: SVGTitleElement
  
  val className: SVGAnimatedString
  
  var focusable: SVGAnimatedEnumeration
  
  var ownerSVGElement: ISVGSVGElement
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
}
object SVGTitleElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGTitleElement_typekey: SVGTitleElement,
    className: SVGAnimatedString,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGTitleElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTitleElement_typekey")(MSHTMLDotSVGTitleElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTitleElement]
  }
  
  @scala.inline
  implicit class SVGTitleElementMutableBuilder[Self <: SVGTitleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGTitleElement_typekey(value: SVGTitleElement): Self = StObject.set(x, "MSHTML.SVGTitleElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
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
