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
    Duration: Int | scala.Double = null,
    FixedPrice: Int | scala.Double = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedDBInstancesOfferingId: String = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedDBInstancesOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription)
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId)
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedDBInstancesOffering]
  }
}

