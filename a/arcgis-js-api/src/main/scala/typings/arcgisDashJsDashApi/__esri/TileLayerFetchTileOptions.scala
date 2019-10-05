package typings.arcgisDashJsDashApi.__esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerFetchTileOptions extends Object {
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Number to append to the tile request to prevent fetching the tile from the browser cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html#fetchTile)
    */
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object TileLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    signal: AbortSignal = null,
    timestamp: js.UndefOr[Boolean] = js.undefined
  ): TileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[TileLayerFetchTileOptions]
  }
}

