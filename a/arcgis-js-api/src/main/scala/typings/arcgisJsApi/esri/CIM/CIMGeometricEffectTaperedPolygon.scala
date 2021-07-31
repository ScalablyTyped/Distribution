package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectTaperedPolygon
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The width at the start of the line to be used to generate a polygon.
    */
  var fromWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance along the line to be used to generate the polygon.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The width at the end of the line to be used to generate the polygon.
    */
  var toWidth: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectTaperedPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectTaperedPolygon
}
object CIMGeometricEffectTaperedPolygon {
  
  @scala.inline
  def apply(): CIMGeometricEffectTaperedPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectTaperedPolygon")
    __obj.asInstanceOf[CIMGeometricEffectTaperedPolygon]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectTaperedPolygonMutableBuilder[Self <: CIMGeometricEffectTaperedPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromWidth(value: Double): Self = StObject.set(x, "fromWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromWidthUndefined: Self = StObject.set(x, "fromWidth", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setToWidth(value: Double): Self = StObject.set(x, "toWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToWidthUndefined: Self = StObject.set(x, "toWidth", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectTaperedPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
