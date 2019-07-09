package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerFetchTileOptions
  extends stdLib.Object {
  /**
    * The value representing pixels in the tile that don't contain an elevation value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#fetchTile)
    */
  var noDataValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#fetchTile)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
}

object ElevationLayerFetchTileOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    noDataValue: scala.Int | scala.Double = null,
    signal: stdLib.AbortSignal = null
  ): ElevationLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ElevationLayerFetchTileOptions]
  }
}

