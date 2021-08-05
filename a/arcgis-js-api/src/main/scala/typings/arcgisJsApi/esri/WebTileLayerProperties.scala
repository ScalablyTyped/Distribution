package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebTileLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with PortalLayerProperties
     with BlendLayerProperties {
  
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  
  /**
    * The url template is a string that specifies the URL of the hosted tile images to load.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: js.UndefOr[String] = js.undefined
}
object WebTileLayerProperties {
  
  inline def apply(): WebTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTileLayerProperties]
  }
  
  extension [Self <: WebTileLayerProperties](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setSubDomains(value: js.Array[String]): Self = StObject.set(x, "subDomains", value.asInstanceOf[js.Any])
    
    inline def setSubDomainsUndefined: Self = StObject.set(x, "subDomains", js.undefined)
    
    inline def setSubDomainsVarargs(value: String*): Self = StObject.set(x, "subDomains", js.Array(value :_*))
    
    inline def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    inline def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
    
    inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    
    inline def setUrlTemplateUndefined: Self = StObject.set(x, "urlTemplate", js.undefined)
  }
}
