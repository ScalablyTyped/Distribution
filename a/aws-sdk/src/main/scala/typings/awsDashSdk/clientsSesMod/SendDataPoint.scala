package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDataPoint extends js.Object {
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.native
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.native
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.native
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.native
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsSesMod.Timestamp] = js.native
}

object SendDataPoint {
  @scala.inline
  def apply(
    Bounces: Int | Double = null,
    Complaints: Int | Double = null,
    DeliveryAttempts: Int | Double = null,
    Rejects: Int | Double = null,
    Timestamp: Timestamp = null
  ): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    if (Bounces != null) __obj.updateDynamic("Bounces")(Bounces.asInstanceOf[js.Any])
    if (Complaints != null) __obj.updateDynamic("Complaints")(Complaints.asInstanceOf[js.Any])
    if (DeliveryAttempts != null) __obj.updateDynamic("DeliveryAttempts")(DeliveryAttempts.asInstanceOf[js.Any])
    if (Rejects != null) __obj.updateDynamic("Rejects")(Rejects.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDataPoint]
  }
}

