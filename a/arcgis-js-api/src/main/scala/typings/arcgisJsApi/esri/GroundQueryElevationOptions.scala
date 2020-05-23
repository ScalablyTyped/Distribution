package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundQueryElevationOptions extends Object {
  /**
    * The value that appears in the resulting geometry when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to return additional sample information for each sampled coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.undefined
}

object GroundQueryElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    noDataValue: js.UndefOr[Double] = js.undefined,
    returnSampleInfo: js.UndefOr[Boolean] = js.undefined
  ): GroundQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(noDataValue)) __obj.updateDynamic("noDataValue")(noDataValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSampleInfo)) __obj.updateDynamic("returnSampleInfo")(returnSampleInfo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundQueryElevationOptions]
  }
}

