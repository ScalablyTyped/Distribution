package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGMarkerElement extends StObject {
  
  @JSName("MSHTML.SVGMarkerElement_typekey")
  var MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement = js.native
  
  val className: SVGAnimatedString = js.native
  
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  
  var focusable: SVGAnimatedEnumeration = js.native
  
  var markerHeight: SVGAnimatedLength = js.native
  
  var markerUnits: SVGAnimatedEnumeration = js.native
  
  var markerWidth: SVGAnimatedLength = js.native
  
  var orientAngle: SVGAnimatedAngle = js.native
  
  var orientType: SVGAnimatedEnumeration = js.native
  
  var ownerSVGElement: ISVGSVGElement = js.native
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  
  var refX: SVGAnimatedLength = js.native
  
  var refY: SVGAnimatedLength = js.native
  
  def setOrientToAngle(pSVGAngle: SVGAngle): Unit = js.native
  
  def setOrientToAuto(): Unit = js.native
  
  val viewBox: SVGAnimatedRect = js.native
  
  var viewportElement: ISVGElement = js.native
  
  var xmlbase: String = js.native
  
  var xmllang: String = js.native
  
  var xmlspace: String = js.native
}
object SVGMarkerElement {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGMarkerElementMutableBuilder[Self <: SVGMarkerElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGMarkerElement_typekey(value: SVGMarkerElement): Self = StObject.set(x, "MSHTML.SVGMarkerElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeight(value: SVGAnimatedLength): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUnits(value: SVGAnimatedEnumeration): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidth(value: SVGAnimatedLength): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientAngle(value: SVGAnimatedAngle): Self = StObject.set(x, "orientAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientType(value: SVGAnimatedEnumeration): Self = StObject.set(x, "orientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefX(value: SVGAnimatedLength): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefY(value: SVGAnimatedLength): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOrientToAngle(value: SVGAngle => Unit): Self = StObject.set(x, "setOrientToAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientToAuto(value: () => Unit): Self = StObject.set(x, "setOrientToAuto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
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
