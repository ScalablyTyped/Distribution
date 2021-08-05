package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectRegularPolygon
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The amount of rotation for the polygon.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of sides for the polygon. Specifying a value less than 3 produces a circle.
    */
  var edges: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance from the center of the polygon.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectRegularPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon
}
object CIMGeometricEffectRegularPolygon {
  
  inline def apply(): CIMGeometricEffectRegularPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectRegularPolygon")
    __obj.asInstanceOf[CIMGeometricEffectRegularPolygon]
  }
  
  extension [Self <: CIMGeometricEffectRegularPolygon](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setEdges(value: Double): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectRegularPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
