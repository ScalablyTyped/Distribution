package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorTileLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with BlendLayerProperties {
  
  /**
  		 * An authorization string used to access a resource or service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#apiKey)
  		 */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
  		 * A list of custom parameters appended to the URL of all resources fetched by the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#customParameters)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The portal item from which the layer is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
  		 */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * A style JSON object of vector tiles that will be used to render the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#style)
  		 */
  var style: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The tiling scheme information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#tileInfo)
  		 */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  
  /**
  		 * The URL to the vector tile service, or the URL to the style resource of vector tiles that will be used to render the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object VectorTileLayerProperties {
  
  inline def apply(): VectorTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorTileLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorTileLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    inline def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
