package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeriesServiceStatistics extends js.Object {
  var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
  /**
    * The response time histogram for the selected entities.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
  var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
  /**
    * Timestamp of the window for which statistics are aggregated.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Timestamp] = js.undefined
}

object TimeSeriesServiceStatistics {
  @scala.inline
  def apply(
    EdgeSummaryStatistics: EdgeStatistics = null,
    ResponseTimeHistogram: Histogram = null,
    ServiceSummaryStatistics: ServiceStatistics = null,
    Timestamp: Timestamp = null
  ): TimeSeriesServiceStatistics = {
    val __obj = js.Dynamic.literal()
    if (EdgeSummaryStatistics != null) __obj.updateDynamic("EdgeSummaryStatistics")(EdgeSummaryStatistics)
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram)
    if (ServiceSummaryStatistics != null) __obj.updateDynamic("ServiceSummaryStatistics")(ServiceSummaryStatistics)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[TimeSeriesServiceStatistics]
  }
}

