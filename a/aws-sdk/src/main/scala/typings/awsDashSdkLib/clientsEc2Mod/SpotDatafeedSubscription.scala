package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotDatafeedSubscription extends js.Object {
  /**
    * The Amazon S3 bucket where the Spot Instance data feed is located.
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * The fault codes for the Spot Instance request, if any.
    */
  var Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined
  /**
    * The AWS account ID of the account.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The prefix that is prepended to data feed files.
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * The state of the Spot Instance data feed subscription.
    */
  var State: js.UndefOr[DatafeedSubscriptionState] = js.undefined
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
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Fault != null) __obj.updateDynamic("Fault")(Fault)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotDatafeedSubscription]
  }
}

