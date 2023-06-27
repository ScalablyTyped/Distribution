package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTileLayerProperties
  extends StObject
     with LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with BlendLayerProperties {
  
  /**
  		 * The spatial reference of the layer.
  		 *
  		 * @default {@link module:esri/geometry/SpatialReference#WebMercator SpatialReference.WebMercator}
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The tiling scheme information for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#tileInfo)
  		 */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
}
object BaseTileLayerProperties {
  
  inline def apply(): BaseTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTileLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseTileLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setTileInfo(value: TileInfoProperties): Self = StObject.set(x, "tileInfo", value.asInstanceOf[js.Any])
    
    inline def setTileInfoUndefined: Self = StObject.set(x, "tileInfo", js.undefined)
  }
}
