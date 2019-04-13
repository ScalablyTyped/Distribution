package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReservationResponse extends js.Object {
  /**
    * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * Number of reserved resources
    */
  var Count: js.UndefOr[__integer] = js.undefined
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[__string] = js.undefined
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[__integer] = js.undefined
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
  /**
    * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
    */
  var End: js.UndefOr[__string] = js.undefined
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[__double] = js.undefined
  /**
    * User specified reservation name
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[__string] = js.undefined
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[__string] = js.undefined
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[OfferingType] = js.undefined
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[__string] = js.undefined
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: js.UndefOr[__string] = js.undefined
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
  /**
    * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
    */
  var Start: js.UndefOr[__string] = js.undefined
  /**
    * Current state of reservation, e.g. 'ACTIVE'
    */
  var State: js.UndefOr[ReservationState] = js.undefined
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[__double] = js.undefined
}

object DeleteReservationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Count: js.UndefOr[__integer] = js.undefined,
    CurrencyCode: __string = null,
    Duration: js.UndefOr[__integer] = js.undefined,
    DurationUnits: OfferingDurationUnits = null,
    End: __string = null,
    FixedPrice: js.UndefOr[__double] = js.undefined,
    Name: __string = null,
    OfferingDescription: __string = null,
    OfferingId: __string = null,
    OfferingType: OfferingType = null,
    Region: __string = null,
    ReservationId: __string = null,
    ResourceSpecification: ReservationResourceSpecification = null,
    Start: __string = null,
    State: ReservationState = null,
    Tags: Tags = null,
    UsagePrice: js.UndefOr[__double] = js.undefined
  ): DeleteReservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (DurationUnits != null) __obj.updateDynamic("DurationUnits")(DurationUnits.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End)
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OfferingDescription != null) __obj.updateDynamic("OfferingDescription")(OfferingDescription)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ReservationId != null) __obj.updateDynamic("ReservationId")(ReservationId)
    if (ResourceSpecification != null) __obj.updateDynamic("ResourceSpecification")(ResourceSpecification)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[DeleteReservationResponse]
  }
}

