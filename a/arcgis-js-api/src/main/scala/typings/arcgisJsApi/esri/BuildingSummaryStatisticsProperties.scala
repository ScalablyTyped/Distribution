package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingSummaryStatisticsProperties extends LoadableProperties {
  /**
    * An array of statistics on all fields in all sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#fields)
    */
  var fields: js.UndefOr[js.Array[BuildingFieldStatistics]] = js.undefined
}

object BuildingSummaryStatisticsProperties {
  @scala.inline
  def apply(fields: js.Array[BuildingFieldStatistics] = null): BuildingSummaryStatisticsProperties = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingSummaryStatisticsProperties]
  }
}

