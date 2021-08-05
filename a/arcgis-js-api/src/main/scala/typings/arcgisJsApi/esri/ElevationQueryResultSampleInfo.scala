package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationQueryResultSampleInfo
  extends StObject
     with Object {
  
  /**
    * The resolution at which the z-value was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var demResolution: Double
  
  /**
    * The elevation source from which the data for the corresponding coordinate was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var source: ElevationLayer
}
object ElevationQueryResultSampleInfo {
  
  inline def apply(
    constructor: js.Function,
    demResolution: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    source: ElevationLayer
  ): ElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], demResolution = demResolution.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationQueryResultSampleInfo]
  }
  
  extension [Self <: ElevationQueryResultSampleInfo](x: Self) {
    
    inline def setDemResolution(value: Double): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ElevationLayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
