package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSourceProperties extends StObject {
  
  /**
  		 * A unique identifying string that must match the `id` property of a feature layer in an associated map.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html#layerId)
  		 */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
  		 * A URL to a service that will be used for all queries against the layer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html#layerUrl)
  		 */
  var layerUrl: js.UndefOr[String] = js.undefined
}
object FeatureLayerSourceProperties {
  
  inline def apply(): FeatureLayerSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLayerUrl(value: String): Self = StObject.set(x, "layerUrl", value.asInstanceOf[js.Any])
    
    inline def setLayerUrlUndefined: Self = StObject.set(x, "layerUrl", js.undefined)
  }
}
