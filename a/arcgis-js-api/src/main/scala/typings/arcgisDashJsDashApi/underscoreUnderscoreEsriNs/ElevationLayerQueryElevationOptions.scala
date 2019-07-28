package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerQueryElevationOptions extends Object {
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See the table below for more details on the different settings.
    *
    * demResolution          | Description
    * -----------------------|-------------
    * `auto`                 | Automatically chooses an appropriate resolution for each coordinate of the input geometry. The current implementation will try to use the finest available resolution given that the total required number of tile requests does not exceed a certain maximum amount (currently 20). Note that this may result in values being sampled from different resolutions.
    * `finest-contiguous`    | Sample elevation from the finest available resolution (cell size) across the entire geometry.
    * `{number}`             | Sample elevation from the resolution closest to the specified resolution (in meters).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to return additional sample information for each coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object ElevationLayerQueryElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    demResolution: Double | String = null,
    noDataValue: Int | Double = null,
    returnSampleInfo: js.UndefOr[Boolean] = js.undefined,
    signal: AbortSignal = null
  ): ElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (demResolution != null) __obj.updateDynamic("demResolution")(demResolution.asInstanceOf[js.Any])
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSampleInfo)) __obj.updateDynamic("returnSampleInfo")(returnSampleInfo)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ElevationLayerQueryElevationOptions]
  }
}

