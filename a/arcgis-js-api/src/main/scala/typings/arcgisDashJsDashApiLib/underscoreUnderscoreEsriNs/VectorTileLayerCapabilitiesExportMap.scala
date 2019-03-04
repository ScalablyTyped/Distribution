package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCapabilitiesExportMap
  extends stdLib.Object {
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var maxExportTilesCount: scala.Double
}

object VectorTileLayerCapabilitiesExportMap {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxExportTilesCount: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): VectorTileLayerCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, maxExportTilesCount = maxExportTilesCount, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[VectorTileLayerCapabilitiesExportMap]
  }
}

