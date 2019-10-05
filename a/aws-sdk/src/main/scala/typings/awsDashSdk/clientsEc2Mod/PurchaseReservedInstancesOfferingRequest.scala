package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseReservedInstancesOfferingRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of Reserved Instances to purchase.
    */
  var InstanceCount: Integer
  /**
    * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved Instances are not purchased at unexpected prices.
    */
  var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.undefined
  /**
    * The time at which to purchase the Reserved Instance.
    */
  var PurchaseTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID of the Reserved Instance offering to purchase.
    */
  var ReservedInstancesOfferingId: String
}

object PurchaseReservedInstancesOfferingRequest {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    ReservedInstancesOfferingId: String,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LimitPrice: ReservedInstanceLimitPrice = null,
    PurchaseTime: DateTime = null
  ): PurchaseReservedInstancesOfferingRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, ReservedInstancesOfferingId = ReservedInstancesOfferingId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LimitPrice != null) __obj.updateDynamic("LimitPrice")(LimitPrice)
    if (PurchaseTime != null) __obj.updateDynamic("PurchaseTime")(PurchaseTime)
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingRequest]
  }
}

