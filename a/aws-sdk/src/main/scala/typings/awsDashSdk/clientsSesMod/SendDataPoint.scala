package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDataPoint extends js.Object {
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.undefined
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.undefined
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.undefined
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.undefined
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsSesMod.Timestamp] = js.undefined
}

object SendDataPoint {
  @scala.inline
  def apply(
    Bounces: js.UndefOr[Counter] = js.undefined,
    Complaints: js.UndefOr[Counter] = js.undefined,
    DeliveryAttempts: js.UndefOr[Counter] = js.undefined,
    Rejects: js.UndefOr[Counter] = js.undefined,
    Timestamp: Timestamp = null
  ): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bounces)) __obj.updateDynamic("Bounces")(Bounces)
    if (!js.isUndefined(Complaints)) __obj.updateDynamic("Complaints")(Complaints)
    if (!js.isUndefined(DeliveryAttempts)) __obj.updateDynamic("DeliveryAttempts")(DeliveryAttempts)
    if (!js.isUndefined(Rejects)) __obj.updateDynamic("Rejects")(Rejects)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[SendDataPoint]
  }
}

