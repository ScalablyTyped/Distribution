package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstancesOffering extends js.Object {
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard currency codes. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  /**
    * The duration of the Reserved Instance, in seconds.
    */
  var Duration: js.UndefOr[Long] = js.undefined
  /**
    * The purchase price of the Reserved Instance.
    */
  var FixedPrice: js.UndefOr[Float] = js.undefined
  /**
    * The tenancy of the instance.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
  /**
    * The instance type on which the Reserved Instance can be used.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceType] = js.undefined
  /**
    * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace offering, this is true.
    */
  var Marketplace: js.UndefOr[Boolean] = js.undefined
  /**
    * If convertible it can be exchanged for Reserved Instances of the same or higher monetary value, with different configurations. If standard, it is not possible to perform an exchange.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.undefined
  /**
    * The Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined
  /**
    * The pricing details of the Reserved Instance offering.
    */
  var PricingDetails: js.UndefOr[PricingDetailsList] = js.undefined
  /**
    * The Reserved Instance product platform description.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.undefined
  /**
    * The recurring charge tag assigned to the resource.
    */
  var RecurringCharges: js.UndefOr[RecurringChargesList] = js.undefined
  /**
    * The ID of the Reserved Instance offering. This is the offering ID used in GetReservedInstancesExchangeQuote to confirm that an exchange can be made.
    */
  var ReservedInstancesOfferingId: js.UndefOr[String] = js.undefined
  /**
    * Whether the Reserved Instance is applied to instances in a Region or an Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.undefined
  /**
    * The usage price of the Reserved Instance, per hour.
    */
  var UsagePrice: js.UndefOr[Float] = js.undefined
}

object ReservedInstancesOffering {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    CurrencyCode: CurrencyCodeValues = null,
    Duration: Int | scala.Double = null,
    FixedPrice: Int | scala.Double = null,
    InstanceTenancy: Tenancy = null,
    InstanceType: InstanceType = null,
    Marketplace: js.UndefOr[scala.Boolean] = js.undefined,
    OfferingClass: OfferingClassType = null,
    OfferingType: OfferingTypeValues = null,
    PricingDetails: PricingDetailsList = null,
    ProductDescription: RIProductDescription = null,
    RecurringCharges: RecurringChargesList = null,
    ReservedInstancesOfferingId: String = null,
    Scope: scope = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedInstancesOffering = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Marketplace)) __obj.updateDynamic("Marketplace")(Marketplace)
    if (OfferingClass != null) __obj.updateDynamic("OfferingClass")(OfferingClass.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (PricingDetails != null) __obj.updateDynamic("PricingDetails")(PricingDetails)
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedInstancesOfferingId != null) __obj.updateDynamic("ReservedInstancesOfferingId")(ReservedInstancesOfferingId)
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstancesOffering]
  }
}

