package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListedEntitlement extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: __string
  /**
    * The name of the entitlement.
    */
  var EntitlementName: __string
}

object ListedEntitlement {
  @scala.inline
  def apply(
    EntitlementArn: __string,
    EntitlementName: __string,
    DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined
  ): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn, EntitlementName = EntitlementName)
    if (!js.isUndefined(DataTransferSubscriberFeePercent)) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent)
    __obj.asInstanceOf[ListedEntitlement]
  }
}

