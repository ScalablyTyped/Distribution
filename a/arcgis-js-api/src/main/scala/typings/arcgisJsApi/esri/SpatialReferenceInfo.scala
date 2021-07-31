package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialReferenceInfo
  extends StObject
     with Object {
  
  /**
    * The XY tolerance of the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var tolerance: Double
  
  /**
    * Base factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitBaseFactor: Double
  
  /**
    * Unit ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitID: Double
  
  /**
    * Square derivative.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitSquareDerivative: Double
  
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#SpatialReferenceInfo)
    */
  var unitType: Double
}
object SpatialReferenceInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    tolerance: Double,
    unitBaseFactor: Double,
    unitID: Double,
    unitSquareDerivative: Double,
    unitType: Double
  ): SpatialReferenceInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tolerance = tolerance.asInstanceOf[js.Any], unitBaseFactor = unitBaseFactor.asInstanceOf[js.Any], unitID = unitID.asInstanceOf[js.Any], unitSquareDerivative = unitSquareDerivative.asInstanceOf[js.Any], unitType = unitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialReferenceInfo]
  }
  
  @scala.inline
  implicit class SpatialReferenceInfoMutableBuilder[Self <: SpatialReferenceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitBaseFactor(value: Double): Self = StObject.set(x, "unitBaseFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitID(value: Double): Self = StObject.set(x, "unitID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSquareDerivative(value: Double): Self = StObject.set(x, "unitSquareDerivative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
  }
}
