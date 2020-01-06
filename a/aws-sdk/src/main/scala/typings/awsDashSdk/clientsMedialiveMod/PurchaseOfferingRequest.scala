package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingRequest extends js.Object {
  /**
    * Number of resources
    */
  var Count: __integerMin1 = js.native
  /**
    * Name for the new reservation
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * Offering to purchase, e.g. '87654321'
    */
  var OfferingId: __string = js.native
  /**
    * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
    */
  var RequestId: js.UndefOr[__string] = js.native
  /**
    * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of the current month and one year from now. If no value is given, the default is now.
    */
  var Start: js.UndefOr[__string] = js.native
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.native
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(
    Count: __integerMin1,
    OfferingId: __string,
    Name: __string = null,
    RequestId: __string = null,
    Start: __string = null,
    Tags: Tags = null
  ): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
}

