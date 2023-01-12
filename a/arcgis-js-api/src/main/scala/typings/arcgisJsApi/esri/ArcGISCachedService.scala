package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISCachedService extends StObject {
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: String
  
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  val spatialReference: SpatialReference
  
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: TileInfo
}
object ArcGISCachedService {
  
  inline def apply(copyright: String, spatialReference: SpatialReference, tileInfo: TileInfo): ArcGISCachedService = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], tileInfo = tileInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISCachedService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISCachedService] (val x: Self) extends AnyVal {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setTileInfo(value: TileInfo): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
  }
}
