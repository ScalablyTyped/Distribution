package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedDBInstance extends js.Object {
  /**
    * The currency code for the reserved DB instance.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The number of reserved DB instances.
    */
  var DBInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The fixed price charged for this reserved DB instance.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The unique identifier for the lease associated with the reserved DB instance.  AWS Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the reservation applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  /**
    * The offering type of this reserved DB instance.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The description of the reserved DB instance.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the reserved DB instance.
    */
  var ReservedDBInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier for the reservation.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The state of the reserved DB instance.
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The hourly price charged for this reserved DB instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedDBInstance {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    DBInstanceClass: String = null,
    DBInstanceCount: js.UndefOr[Integer] = js.undefined,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    LeaseId: String = null,
    MultiAZ: js.UndefOr[Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedDBInstanceArn: String = null,
    ReservedDBInstanceId: String = null,
    ReservedDBInstancesOfferingId: String = null,
    StartTime: TStamp = null,
    State: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedDBInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (!js.isUndefined(DBInstanceCount)) __obj.updateDynamic("DBInstanceCount")(DBInstanceCount)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (LeaseId != null) __obj.updateDynamic("LeaseId")(LeaseId)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedDBInstanceArn != null) __obj.updateDynamic("ReservedDBInstanceArn")(ReservedDBInstanceArn)
    if (ReservedDBInstanceId != null) __obj.updateDynamic("ReservedDBInstanceId")(ReservedDBInstanceId)
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedDBInstance]
  }
}

