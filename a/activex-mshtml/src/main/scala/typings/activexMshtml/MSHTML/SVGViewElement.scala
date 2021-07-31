package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGViewElement extends StObject {
  
  @JSName("MSHTML.SVGViewElement_typekey")
  var MSHTMLDotSVGViewElement_typekey: SVGViewElement
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  var ownerSVGElement: ISVGSVGElement
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  val viewBox: SVGAnimatedRect
  
  var viewTarget: SVGStringList
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
  
  val zoomAndPan: Double
}
object SVGViewElement {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGViewElement_typekey: SVGViewElement,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    viewBox: SVGAnimatedRect,
    viewTarget: SVGStringList,
    viewportElement: ISVGElement,
    xmlbase: String,
    zoomAndPan: Double
  ): SVGViewElement = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewTarget = viewTarget.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGViewElement_typekey")(MSHTMLDotSVGViewElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGViewElement]
  }
  
  @scala.inline
  implicit class SVGViewElementMutableBuilder[Self <: SVGViewElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGViewElement_typekey(value: SVGViewElement): Self = StObject.set(x, "MSHTML.SVGViewElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTarget(value: SVGStringList): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
