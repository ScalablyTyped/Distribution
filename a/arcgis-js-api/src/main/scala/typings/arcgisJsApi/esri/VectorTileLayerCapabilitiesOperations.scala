package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileLayerCapabilitiesOperations extends Object {
  
  /**
    * Indicates if the tiles from the service can be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsExportTiles: Boolean = js.native
  
  /**
    * Indicates if the service exposes a tile map that describes the presence of tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsTileMap: Boolean = js.native
}
object VectorTileLayerCapabilitiesOperations {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsExportTiles: Boolean,
    supportsTileMap: Boolean
  ): VectorTileLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsExportTiles = supportsExportTiles.asInstanceOf[js.Any], supportsTileMap = supportsTileMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit class VectorTileLayerCapabilitiesOperationsMutableBuilder[Self <: VectorTileLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportsExportTiles(value: Boolean): Self = StObject.set(x, "supportsExportTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTileMap(value: Boolean): Self = StObject.set(x, "supportsTileMap", value.asInstanceOf[js.Any])
  }
}
