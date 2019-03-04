package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseElevationLayerFetchTileOptions
  extends stdLib.Object {
  /**
    * The value representing pixels in the tile that don't contain an elevation value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
    */
  var noDataValue: js.UndefOr[scala.Double] = js.undefined
}

object BaseElevationLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataValue: scala.Int | scala.Double = null
  ): BaseElevationLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElevationLayerFetchTileOptions]
  }
}

