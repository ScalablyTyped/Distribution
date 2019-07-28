package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceStatistics extends js.Object {
  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  var ErrorStatistics: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ErrorStatistics] = js.undefined
  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  var FaultStatistics: js.UndefOr[typings.awsDashSdk.clientsXrayMod.FaultStatistics] = js.undefined
  /**
    * The number of requests that completed with a 2xx Success status code.
    */
  var OkCount: js.UndefOr[NullableLong] = js.undefined
  /**
    * The total number of completed requests.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
  /**
    * The aggregate response time of completed requests.
    */
  var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
}

object ServiceStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: ErrorStatistics = null,
    FaultStatistics: FaultStatistics = null,
    OkCount: js.UndefOr[NullableLong] = js.undefined,
    TotalCount: js.UndefOr[NullableLong] = js.undefined,
    TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  ): ServiceStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics)
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics)
    if (!js.isUndefined(OkCount)) __obj.updateDynamic("OkCount")(OkCount)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    if (!js.isUndefined(TotalResponseTime)) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime)
    __obj.asInstanceOf[ServiceStatistics]
  }
}

