package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTileLayerFetchTileOptions
  extends stdLib.Object {
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  /**
    * Number to append to the tile request to prevent fetching the tile from the browser cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    */
  var timestamp: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseTileLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    signal: stdLib.AbortSignal = null,
    timestamp: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[BaseTileLayerFetchTileOptions]
  }
}

