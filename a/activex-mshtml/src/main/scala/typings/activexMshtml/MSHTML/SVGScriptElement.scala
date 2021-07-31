package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGScriptElement extends StObject {
  
  @JSName("MSHTML.SVGScriptElement_typekey")
  var MSHTMLDotSVGScriptElement_typekey: SVGScriptElement
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  val href: SVGAnimatedString
  
  var ownerSVGElement: ISVGSVGElement
  
  var `type`: String
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGScriptElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGScriptElement_typekey: SVGScriptElement,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    `type`: String,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGScriptElement = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGScriptElement_typekey")(MSHTMLDotSVGScriptElement_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGScriptElement]
  }
  
  @scala.inline
  implicit class SVGScriptElementMutableBuilder[Self <: SVGScriptElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGScriptElement_typekey(value: SVGScriptElement): Self = StObject.set(x, "MSHTML.SVGScriptElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
