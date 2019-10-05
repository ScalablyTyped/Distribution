package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedElasticsearchInstanceOffering extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The duration, in seconds, for which the offering will reserve the Elasticsearch instance.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * Payment option for the reserved Elasticsearch instance offering
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The Elasticsearch reserved instance offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
  /**
    * The rate you are charged for each hour the domain that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedElasticsearchInstanceOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: Int | scala.Double = null,
    ElasticsearchInstanceType: ESPartitionInstanceType = null,
    FixedPrice: Int | scala.Double = null,
    PaymentOption: ReservedElasticsearchInstancePaymentOption = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedElasticsearchInstanceOfferingId: GUID = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedElasticsearchInstanceOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (ElasticsearchInstanceType != null) __obj.updateDynamic("ElasticsearchInstanceType")(ElasticsearchInstanceType.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId)
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
  }
}

