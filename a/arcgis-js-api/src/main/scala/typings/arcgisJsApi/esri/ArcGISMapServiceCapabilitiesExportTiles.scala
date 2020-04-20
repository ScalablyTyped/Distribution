package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilitiesExportTiles extends Object {
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var maxExportTilesCount: Double
}

object ArcGISMapServiceCapabilitiesExportTiles {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxExportTilesCount: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ArcGISMapServiceCapabilitiesExportTiles = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxExportTilesCount = maxExportTilesCount.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportTiles]
  }
}

