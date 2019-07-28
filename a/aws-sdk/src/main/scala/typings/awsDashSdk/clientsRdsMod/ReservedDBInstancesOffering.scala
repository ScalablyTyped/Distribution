package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedDBInstancesOffering extends js.Object {
  /**
    * The currency code for the reserved DB instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The duration of the offering in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * Indicates if the offering applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  /**
    * The database engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedDBInstancesOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    DBInstanceClass: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    MultiAZ: js.UndefOr[Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedDBInstancesOfferingId: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedDBInstancesOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedDBInstancesOffering]
  }
}

