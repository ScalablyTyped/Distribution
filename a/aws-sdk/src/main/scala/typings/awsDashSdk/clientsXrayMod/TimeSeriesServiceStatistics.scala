package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSeriesServiceStatistics extends js.Object {
  var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
  /**
    * The response time histogram for the selected entities.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  /**
    * Timestamp of the window for which statistics are aggregated.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Timestamp] = js.native
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
    if (EdgeSummaryStatistics != null) __obj.updateDynamic("EdgeSummaryStatistics")(EdgeSummaryStatistics.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (ServiceSummaryStatistics != null) __obj.updateDynamic("ServiceSummaryStatistics")(ServiceSummaryStatistics.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesServiceStatistics]
  }
}

