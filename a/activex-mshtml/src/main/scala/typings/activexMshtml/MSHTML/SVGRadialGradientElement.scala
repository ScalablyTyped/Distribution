package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRadialGradientElement extends StObject {
  
  @JSName("MSHTML.SVGRadialGradientElement_typekey")
  var MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement
  
  val className: SVGAnimatedString
  
  var cx: SVGAnimatedLength
  
  var cy: SVGAnimatedLength
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  var fx: SVGAnimatedLength
  
  var fy: SVGAnimatedLength
  
  var gradientTransform: SVGAnimatedTransformList
  
  var gradientUnits: SVGAnimatedEnumeration
  
  val href: SVGAnimatedString
  
  var ownerSVGElement: ISVGSVGElement
  
  var r: SVGAnimatedLength
  
  var spreadMethod: SVGAnimatedEnumeration
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
}
object SVGRadialGradientElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGRadialGradientElement_typekey: SVGRadialGradientElement,
    className: SVGAnimatedString,
    cx: SVGAnimatedLength,
    cy: SVGAnimatedLength,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    fx: SVGAnimatedLength,
    fy: SVGAnimatedLength,
    gradientTransform: SVGAnimatedTransformList,
    gradientUnits: SVGAnimatedEnumeration,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    r: SVGAnimatedLength,
    spreadMethod: SVGAnimatedEnumeration,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGRadialGradientElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], spreadMethod = spreadMethod.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRadialGradientElement_typekey")(MSHTMLDotSVGRadialGradientElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRadialGradientElement]
  }
  
  @scala.inline
  implicit class SVGRadialGradientElementMutableBuilder[Self <: SVGRadialGradientElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCx(value: SVGAnimatedLength): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCy(value: SVGAnimatedLength): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFx(value: SVGAnimatedLength): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFy(value: SVGAnimatedLength): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGRadialGradientElement_typekey(value: SVGRadialGradientElement): Self = StObject.set(x, "MSHTML.SVGRadialGradientElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: SVGAnimatedLength): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethod(value: SVGAnimatedEnumeration): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
  }
}
