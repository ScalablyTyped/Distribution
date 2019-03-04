package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTileLayerFetchTileOptions
  extends stdLib.Object {
  /**
    * A timestamp to append to the tile url to avoid loading a cached version of the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    */
  var timestamp: js.UndefOr[scala.Boolean] = js.undefined
}

object WebTileLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    timestamp: js.UndefOr[scala.Boolean] = js.undefined
  ): WebTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[WebTileLayerFetchTileOptions]
  }
}

