package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCapabilitiesOperations
  extends stdLib.Object {
  /**
    * Indicates if the tiles from the service can be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsExportTiles: scala.Boolean
  /**
    * Indicates if the service exposes a tile map that describes the presence of tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var supportsTileMap: scala.Boolean
}

object VectorTileLayerCapabilitiesOperations {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    supportsExportTiles: scala.Boolean,
    supportsTileMap: scala.Boolean
  ): VectorTileLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, supportsExportTiles = supportsExportTiles, supportsTileMap = supportsTileMap)
  
    __obj.asInstanceOf[VectorTileLayerCapabilitiesOperations]
  }
}

