package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFenceParametersProperties extends StObject {
  
  /**
  		 * An optional buffer distance to apply to fence features in meters.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#bufferDistance)
  		 */
  var bufferDistance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An object defining the source for a feature layer to be used as fences.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#fenceSource)
  		 */
  var fenceSource: js.UndefOr[FeatureLayerSourceProperties] = js.undefined
  
  /**
  		 * An optional filter to reduce the features used for the parameters.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html#filter)
  		 */
  var filter: js.UndefOr[geotriggersInfoFeatureFilterProperties] = js.undefined
}
object FeatureFenceParametersProperties {
  
  inline def apply(): FeatureFenceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFenceParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureFenceParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setBufferDistance(value: Double): Self = StObject.set(x, "bufferDistance", value.asInstanceOf[js.Any])
    
    inline def setBufferDistanceUndefined: Self = StObject.set(x, "bufferDistance", js.undefined)
    
    inline def setFenceSource(value: FeatureLayerSourceProperties): Self = StObject.set(x, "fenceSource", value.asInstanceOf[js.Any])
    
    inline def setFenceSourceUndefined: Self = StObject.set(x, "fenceSource", js.undefined)
    
    inline def setFilter(value: geotriggersInfoFeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
