package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDataResult extends js.Object {
  /**
    * The short name you specified to represent this metric.
    */
  var Id: js.UndefOr[MetricId] = js.undefined
  /**
    * The human-readable label associated with the data.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
  /**
    * A list of messages with additional information about the data returned.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
  /**
    * The status of the returned data. Complete indicates that all data points in the requested time range were returned. PartialData means that an incomplete set of data points were returned. You can use the NextToken value that was returned and repeat your request to get more data points. NextToken is not returned if you are performing a math expression. InternalError indicates that an error occurred. Retry your request using NextToken, if present.
    */
  var StatusCode: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.StatusCode] = js.undefined
  /**
    * The timestamps for the data points, formatted in Unix timestamp format. The number of timestamps always matches the number of values and the value for Timestamps[x] is Values[x].
    */
  var Timestamps: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Timestamps] = js.undefined
  /**
    * The data points for the metric corresponding to Timestamps. The number of values always matches the number of timestamps and the timestamp for Values[x] is Timestamps[x].
    */
  var Values: js.UndefOr[DatapointValues] = js.undefined
}

object MetricDataResult {
  @scala.inline
  def apply(
    Id: MetricId = null,
    Label: MetricLabel = null,
    Messages: MetricDataResultMessages = null,
    StatusCode: StatusCode = null,
    Timestamps: Timestamps = null,
    Values: DatapointValues = null
  ): MetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (Timestamps != null) __obj.updateDynamic("Timestamps")(Timestamps)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[MetricDataResult]
  }
}

