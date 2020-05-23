package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait summaryStatisticsForAge extends js.Object {
  /**
    * Returns an object containing various statistics describing an age value (e.g. the difference between a given end time from a start time) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate age statistics for the given `startTime` and `endTime`.
    * @param params.startTime The start time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `endTime` parameter must be a field name.
    * @param params.endTime The end time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `startTime` parameter must be a field name.
    * @param params.unit The desired units of the age result.  **Possible Values:** years | months | days | hours | minutes | seconds
    * @param params.view The view in which features will be rendered.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def summaryStatisticsForAge(params: summaryStatisticsForAgeSummaryStatisticsForAgeParams): js.Promise[SummaryStatisticsResult]
}

object summaryStatisticsForAge {
  @scala.inline
  def apply(
    summaryStatisticsForAge: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]
  ): summaryStatisticsForAge = {
    val __obj = js.Dynamic.literal(summaryStatisticsForAge = js.Any.fromFunction1(summaryStatisticsForAge))
    __obj.asInstanceOf[summaryStatisticsForAge]
  }
}

