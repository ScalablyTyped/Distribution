package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedEntitlement extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.native
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: __string = js.native
  /**
    * The name of the entitlement.
    */
  var EntitlementName: __string = js.native
}

object ListedEntitlement {
  @scala.inline
  def apply(
    EntitlementArn: __string,
    EntitlementName: __string,
    DataTransferSubscriberFeePercent: Int | Double = null
  ): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any])
    if (DataTransferSubscriberFeePercent != null) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedEntitlement]
  }
}

