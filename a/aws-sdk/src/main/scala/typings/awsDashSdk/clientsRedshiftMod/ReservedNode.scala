package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedNode extends js.Object {
  /**
    * The currency code for the reserved cluster.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The duration of the node reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The fixed cost Amazon Redshift charges you for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The number of reserved compute nodes.
    */
  var NodeCount: js.UndefOr[Integer] = js.undefined
  /**
    * The node type of the reserved node.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The recurring charges for the reserved node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The unique identifier for the reservation.
    */
  var ReservedNodeId: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the reserved node offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ReservedNodeOfferingType] = js.undefined
  /**
    * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of that duration.
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The state of the reserved compute node. Possible Values:   pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has not yet been confirmed.   active-This reserved node is owned by the caller and is available for use.   payment-failed-Payment failed for the purchase attempt.   retired-The reserved node is no longer available.    exchanging-The owner is exchanging the reserved node for another reserved node.  
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The hourly rate Amazon Redshift charges you for this reserved node.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedNode {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    NodeCount: js.UndefOr[Integer] = js.undefined,
    NodeType: String = null,
    OfferingType: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedNodeId: String = null,
    ReservedNodeOfferingId: String = null,
    ReservedNodeOfferingType: ReservedNodeOfferingType = null,
    StartTime: TStamp = null,
    State: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedNode = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (!js.isUndefined(NodeCount)) __obj.updateDynamic("NodeCount")(NodeCount)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedNodeId != null) __obj.updateDynamic("ReservedNodeId")(ReservedNodeId)
    if (ReservedNodeOfferingId != null) __obj.updateDynamic("ReservedNodeOfferingId")(ReservedNodeOfferingId)
    if (ReservedNodeOfferingType != null) __obj.updateDynamic("ReservedNodeOfferingType")(ReservedNodeOfferingType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedNode]
  }
}

