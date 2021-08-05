package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGMarkerElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGMarkerElement_typekey")
  var MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement
  
  val className: SVGAnimatedString
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  var focusable: SVGAnimatedEnumeration
  
  var markerHeight: SVGAnimatedLength
  
  var markerUnits: SVGAnimatedEnumeration
  
  var markerWidth: SVGAnimatedLength
  
  var orientAngle: SVGAnimatedAngle
  
  var orientType: SVGAnimatedEnumeration
  
  var ownerSVGElement: ISVGSVGElement
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  var refX: SVGAnimatedLength
  
  var refY: SVGAnimatedLength
  
  def setOrientToAngle(pSVGAngle: SVGAngle): Unit
  
  def setOrientToAuto(): Unit
  
  val viewBox: SVGAnimatedRect
  
  var viewportElement: ISVGElement
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
}
object SVGMarkerElement {
  
  inline def apply(
    MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    markerHeight: SVGAnimatedLength,
    markerUnits: SVGAnimatedEnumeration,
    markerWidth: SVGAnimatedLength,
    orientAngle: SVGAnimatedAngle,
    orientType: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    refX: SVGAnimatedLength,
    refY: SVGAnimatedLength,
    setOrientToAngle: SVGAngle => Unit,
    setOrientToAuto: () => Unit,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGMarkerElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerUnits = markerUnits.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], orientAngle = orientAngle.asInstanceOf[js.Any], orientType = orientType.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], refX = refX.asInstanceOf[js.Any], refY = refY.asInstanceOf[js.Any], setOrientToAngle = js.Any.fromFunction1(setOrientToAngle), setOrientToAuto = js.Any.fromFunction0(setOrientToAuto), viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMarkerElement_typekey")(MSHTMLDotSVGMarkerElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMarkerElement]
  }
  
  extension [Self <: SVGMarkerElement](x: Self) {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGMarkerElement_typekey(value: SVGMarkerElement): Self = StObject.set(x, "MSHTML.SVGMarkerElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setMarkerHeight(value: SVGAnimatedLength): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    inline def setMarkerUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    inline def setMarkerWidth(value: SVGAnimatedLength): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    inline def setOrientAngle(value: SVGAnimatedAngle): Self = StObject.set(x, "orientAngle", value.asInstanceOf[js.Any])
    
    inline def setOrientType(value: SVGAnimatedEnumeration): Self = StObject.set(x, "orientType", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setRefX(value: SVGAnimatedLength): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    inline def setRefY(value: SVGAnimatedLength): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    inline def setSetOrientToAngle(value: SVGAngle => Unit): Self = StObject.set(x, "setOrientToAngle", js.Any.fromFunction1(value))
    
    inline def setSetOrientToAuto(value: () => Unit): Self = StObject.set(x, "setOrientToAuto", js.Any.fromFunction0(value))
    
    inline def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
  }
}
