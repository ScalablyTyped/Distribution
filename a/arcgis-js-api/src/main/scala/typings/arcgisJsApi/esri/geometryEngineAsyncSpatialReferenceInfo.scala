package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geometryEngineAsyncSpatialReferenceInfo extends Object {
  
  /**
    * The XY tolerance of the spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#SpatialReferenceInfo)
    */
  var tolerance: Double = js.native
  
  /**
    * Base factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#SpatialReferenceInfo)
    */
  var unitBaseFactor: Double = js.native
  
  /**
    * Unit ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#SpatialReferenceInfo)
    */
  var unitID: Double = js.native
  
  /**
    * Square derivative.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#SpatialReferenceInfo)
    */
  var unitSquareDerivative: Double = js.native
  
  /**
    * Unit type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#SpatialReferenceInfo)
    */
  var unitType: Double = js.native
}
object geometryEngineAsyncSpatialReferenceInfo {
  
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
  ): geometryEngineAsyncSpatialReferenceInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tolerance = tolerance.asInstanceOf[js.Any], unitBaseFactor = unitBaseFactor.asInstanceOf[js.Any], unitID = unitID.asInstanceOf[js.Any], unitSquareDerivative = unitSquareDerivative.asInstanceOf[js.Any], unitType = unitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[geometryEngineAsyncSpatialReferenceInfo]
  }
  
  @scala.inline
  implicit class geometryEngineAsyncSpatialReferenceInfoMutableBuilder[Self <: geometryEngineAsyncSpatialReferenceInfo] (val x: Self) extends AnyVal {
    
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
