package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGLinearGradientElement extends StObject {
  
  @JSName("MSHTML.SVGLinearGradientElement_typekey")
  var MSHTMLDotSVGLinearGradientElement_typekey: SVGLinearGradientElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var gradientTransform: SVGAnimatedTransformList = js.native
  
  var gradientUnits: SVGAnimatedEnumeration = js.native
  
  val href: SVGAnimatedString = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var spreadMethod: SVGAnimatedEnumeration = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var x1: SVGAnimatedLength = js.native
  
  var x2: SVGAnimatedLength = js.native
  
  var xmlbase: String = js.native
  
  var y1: SVGAnimatedLength = js.native
  
  var y2: SVGAnimatedLength = js.native
}
object SVGLinearGradientElement {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGLinearGradientElementMutableBuilder[Self <: SVGLinearGradientElement] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGLinearGradientElement_typekey(value: SVGLinearGradientElement): Self = StObject.set(x, "MSHTML.SVGLinearGradientElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethod(value: SVGAnimatedEnumeration): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: SVGAnimatedLength): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: SVGAnimatedLength): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: SVGAnimatedLength): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: SVGAnimatedLength): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
