package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedNodeOffering extends js.Object {
  /**
    * The currency code for the compute nodes offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The duration, in seconds, for which the offering will reserve the node.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved node offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The node type offered by the reserved node offering.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring charges are only in effect for heavy-utilization reserved nodes.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The offering identifier.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ReservedNodeOfferingType] = js.undefined
  /**
    * The rate you are charged for each hour the cluster that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedNodeOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    NodeType: String = null,
    OfferingType: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedNodeOfferingId: String = null,
    ReservedNodeOfferingType: ReservedNodeOfferingType = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedNodeOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedNodeOfferingId != null) __obj.updateDynamic("ReservedNodeOfferingId")(ReservedNodeOfferingId)
    if (ReservedNodeOfferingType != null) __obj.updateDynamic("ReservedNodeOfferingType")(ReservedNodeOfferingType.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedNodeOffering]
  }
}

