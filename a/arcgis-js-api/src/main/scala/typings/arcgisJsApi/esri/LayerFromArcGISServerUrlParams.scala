package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerFromArcGISServerUrlParams extends StObject {
  
  /**
  		 * Set any of the layer's properties here for constructing the layer instance (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
  		 */
  var properties: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The ArcGIS Server URL used to create the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
  		 */
  var url: String
}
object LayerFromArcGISServerUrlParams {
  
  inline def apply(url: String): LayerFromArcGISServerUrlParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerFromArcGISServerUrlParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerFromArcGISServerUrlParams] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
