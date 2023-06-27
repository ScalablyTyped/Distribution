package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationQueryResultSampleInfo extends StObject {
  
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
  
  inline def apply(demResolution: Double, source: ElevationLayer): ElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(demResolution = demResolution.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationQueryResultSampleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationQueryResultSampleInfo] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ElevationLayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
