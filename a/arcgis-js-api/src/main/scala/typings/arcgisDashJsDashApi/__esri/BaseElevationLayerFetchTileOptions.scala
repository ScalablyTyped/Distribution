package typings.arcgisDashJsDashApi.__esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseElevationLayerFetchTileOptions extends Object {
  /**
    * The value representing pixels in the tile that don't contain an elevation value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. When overriding fetchTile, `signal` should be handled, for example by passing it on to [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) or by aborting pending operations. An aborted call to fetchTile should reject its returned promise with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object BaseElevationLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    noDataValue: Int | Double = null,
    signal: AbortSignal = null
  ): BaseElevationLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElevationLayerFetchTileOptions]
  }
}

