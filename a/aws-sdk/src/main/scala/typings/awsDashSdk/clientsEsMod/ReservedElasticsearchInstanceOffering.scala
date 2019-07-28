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
    Duration: js.UndefOr[Integer] = js.undefined,
    ElasticsearchInstanceType: ESPartitionInstanceType = null,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    PaymentOption: ReservedElasticsearchInstancePaymentOption = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedElasticsearchInstanceOfferingId: GUID = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedElasticsearchInstanceOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (ElasticsearchInstanceType != null) __obj.updateDynamic("ElasticsearchInstanceType")(ElasticsearchInstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
  }
}

