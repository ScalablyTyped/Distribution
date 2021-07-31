package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGGradientElement extends StObject {
  
  @JSName("MSHTML.SVGGradientElement_typekey")
  var MSHTMLDotSVGGradientElement_typekey: SVGGradientElement
  
  val className: SVGAnimatedString
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  var gradientTransform: SVGAnimatedTransformList
  
  var gradientUnits: SVGAnimatedEnumeration
  
  val href: SVGAnimatedString
  
  var ownerSVGElement: ISVGSVGElement
  
  var spreadMethod: SVGAnimatedEnumeration
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGGradientElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGGradientElement_typekey: SVGGradientElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGGradientElement_typekey")(MSHTMLDotSVGGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGGradientElement]
  }
  
  @scala.inline
  implicit class SVGGradientElementMutableBuilder[Self <: SVGGradientElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGGradientElement_typekey(value: SVGGradientElement): Self = StObject.set(x, "MSHTML.SVGGradientElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethod(value: SVGAnimatedEnumeration): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
