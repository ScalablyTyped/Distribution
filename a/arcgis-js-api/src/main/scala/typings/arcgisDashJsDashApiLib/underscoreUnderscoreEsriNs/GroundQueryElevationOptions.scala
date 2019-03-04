package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundQueryElevationOptions
  extends stdLib.Object {
  /**
    * The value that appears in the resulting geometry when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to return additional sample information for each sampled coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[scala.Boolean] = js.undefined
}

object GroundQueryElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataValue: scala.Int | scala.Double = null,
    returnSampleInfo: js.UndefOr[scala.Boolean] = js.undefined
  ): GroundQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSampleInfo)) __obj.updateDynamic("returnSampleInfo")(returnSampleInfo)
    __obj.asInstanceOf[GroundQueryElevationOptions]
  }
}

