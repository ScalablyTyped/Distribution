package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotDatafeedSubscription extends js.Object {
  /**
    * The Amazon S3 bucket where the Spot Instance data feed is located.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.native
  /**
    * The AWS account ID of the account.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The prefix that is prepended to data feed files.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance data feed subscription.
    */
  var State: js.UndefOr[DatafeedSubscriptionState] = js.native
}

object SpotDatafeedSubscription {
  @scala.inline
  def apply(
    Bucket: String = null,
    Fault: SpotInstanceStateFault = null,
    OwnerId: String = null,
    Prefix: String = null,
    State: DatafeedSubscriptionState = null
  ): SpotDatafeedSubscription = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Fault != null) __obj.updateDynamic("Fault")(Fault.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotDatafeedSubscription]
  }
}

