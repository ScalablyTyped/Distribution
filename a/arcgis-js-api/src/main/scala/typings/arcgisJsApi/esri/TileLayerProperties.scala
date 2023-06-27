package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.ArcGISCachedServiceProperties because var conflicts: copyright. Inlined tileInfo
- typings.arcgisJsApi.esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ trait TileLayerProperties
  extends StObject
     with LayerProperties
     with RefreshableLayerProperties
     with ScaleRangeLayerProperties
     with PortalLayerProperties
     with BlendLayerProperties
     with CustomParametersMixinProperties
     with APIKeyMixinProperties {
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
  		 */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Resampling is enabled by default in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#resampling)
  		 */
  var resampling: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The [tiled map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Contains information about the tiling scheme for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
  		 */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  
  /**
  		 * An array of tile servers used for changing map tiles.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#tileServers)
  		 */
  var tileServers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The URL of the REST endpoint of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object TileLayerProperties {
  
  inline def apply(): TileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setResampling(value: Boolean): Self = StObject.set(x, "resampling", value.asInstanceOf[js.Any])
    
    inline def setResamplingUndefined: Self = StObject.set(x, "resampling", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    inline def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
    
    inline def setTileServers(value: js.Array[String]): Self = StObject.set(x, "tileServers", value.asInstanceOf[js.Any])
    
    inline def setTileServersUndefined: Self = StObject.set(x, "tileServers", js.undefined)
    
    inline def setTileServersVarargs(value: String*): Self = StObject.set(x, "tileServers", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
