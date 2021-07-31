package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLayerElevationQueryResult
  extends StObject
     with Object {
  
  /**
    * The geometry with sampled z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var geometry: Point | Multipoint | Polyline
  
  /**
    * The value used when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var noDataValue: Double
  
  /**
    * Contains additional information about how the geometry was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var sampleInfo: js.UndefOr[js.Array[ElevationLayerElevationQueryResultSampleInfo]] = js.undefined
}
object ElevationLayerElevationQueryResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Point | Multipoint | Polyline,
    hasOwnProperty: PropertyKey => Boolean,
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerElevationQueryResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), noDataValue = noDataValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationLayerElevationQueryResult]
  }
  
  @scala.inline
  implicit class ElevationLayerElevationQueryResultMutableBuilder[Self <: ElevationLayerElevationQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: Point | Multipoint | Polyline): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleInfo(value: js.Array[ElevationLayerElevationQueryResultSampleInfo]): Self = StObject.set(x, "sampleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleInfoUndefined: Self = StObject.set(x, "sampleInfo", js.undefined)
    
    @scala.inline
    def setSampleInfoVarargs(value: ElevationLayerElevationQueryResultSampleInfo*): Self = StObject.set(x, "sampleInfo", js.Array(value :_*))
  }
}
