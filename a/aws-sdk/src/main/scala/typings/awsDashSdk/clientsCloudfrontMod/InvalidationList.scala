package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidationList extends js.Object {
  /**
    * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more invalidation batches in the list.
    */
  var IsTruncated: Boolean
  /**
    * A complex type that contains one InvalidationSummary element for each invalidation batch created by the current AWS account.
    */
  var Items: js.UndefOr[InvalidationSummaryList] = js.undefined
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: String
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: integer
  /**
    * If IsTruncated is true, this element is present and contains the value that you can use for the Marker request parameter to continue listing your invalidation batches where they left off.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * The number of invalidation batches that were created by the current AWS account. 
    */
  var Quantity: integer
}

object InvalidationList {
  @scala.inline
  def apply(
    IsTruncated: Boolean,
    Marker: String,
    MaxItems: integer,
    Quantity: integer,
    Items: InvalidationSummaryList = null,
    NextMarker: String = null
  ): InvalidationList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, Marker = Marker, MaxItems = MaxItems, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[InvalidationList]
  }
}

