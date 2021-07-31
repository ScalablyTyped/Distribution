package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISCachedServiceProperties extends StObject {
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
}
object ArcGISCachedServiceProperties {
  
  @scala.inline
  def apply(): ArcGISCachedServiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGISCachedServiceProperties]
  }
  
  @scala.inline
  implicit class ArcGISCachedServicePropertiesMutableBuilder[Self <: ArcGISCachedServiceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
  }
}
