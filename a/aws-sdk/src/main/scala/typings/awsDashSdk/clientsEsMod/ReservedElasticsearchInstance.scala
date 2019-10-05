package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedElasticsearchInstance extends js.Object {
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  /**
    * The duration, in seconds, for which the Elasticsearch instance is reserved.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The number of Elasticsearch instances that have been reserved.
    */
  var ElasticsearchInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined
  /**
    * The upfront fixed charge you will paid to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  /**
    * The payment option as defined in the reserved Elasticsearch instance offering.
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  /**
    * The customer-specified identifier to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  /**
    * The unique identifier for the reservation.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
  /**
    * The offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.undefined
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[UpdateTimestamp] = js.undefined
  /**
    * The state of the reserved Elasticsearch instance.
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The rate you are charged for each hour for the domain that is using this reserved instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}

object ReservedElasticsearchInstance {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: Int | scala.Double = null,
    ElasticsearchInstanceCount: Int | scala.Double = null,
    ElasticsearchInstanceType: ESPartitionInstanceType = null,
    FixedPrice: Int | scala.Double = null,
    PaymentOption: ReservedElasticsearchInstancePaymentOption = null,
    RecurringCharges: RecurringChargeList = null,
    ReservationName: ReservationToken = null,
    ReservedElasticsearchInstanceId: GUID = null,
    ReservedElasticsearchInstanceOfferingId: String = null,
    StartTime: UpdateTimestamp = null,
    State: String = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedElasticsearchInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (ElasticsearchInstanceCount != null) __obj.updateDynamic("ElasticsearchInstanceCount")(ElasticsearchInstanceCount.asInstanceOf[js.Any])
    if (ElasticsearchInstanceType != null) __obj.updateDynamic("ElasticsearchInstanceType")(ElasticsearchInstanceType.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (PaymentOption != null) __obj.updateDynamic("PaymentOption")(PaymentOption.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges)
    if (ReservationName != null) __obj.updateDynamic("ReservationName")(ReservationName)
    if (ReservedElasticsearchInstanceId != null) __obj.updateDynamic("ReservedElasticsearchInstanceId")(ReservedElasticsearchInstanceId)
    if (ReservedElasticsearchInstanceOfferingId != null) __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(ReservedElasticsearchInstanceOfferingId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State)
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedElasticsearchInstance]
  }
}

