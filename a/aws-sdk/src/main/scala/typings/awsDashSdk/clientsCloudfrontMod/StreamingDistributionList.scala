package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingDistributionList extends js.Object {
  /**
    * A flag that indicates whether more streaming distributions remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more distributions in the list. 
    */
  var IsTruncated: Boolean = js.native
  /**
    * A complex type that contains one StreamingDistributionSummary element for each distribution that was created by the current AWS account.
    */
  var Items: js.UndefOr[StreamingDistributionSummaryList] = js.native
  /**
    * The value you provided for the Marker request parameter. 
    */
  var Marker: String = js.native
  /**
    * The value you provided for the MaxItems request parameter. 
    */
  var MaxItems: integer = js.native
  /**
    * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your RTMP distributions where they left off. 
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of streaming distributions that were created by the current AWS account. 
    */
  var Quantity: integer = js.native
}

object StreamingDistributionList {
  @scala.inline
  def apply(
    IsTruncated: Boolean,
    Marker: String,
    MaxItems: integer,
    Quantity: integer,
    Items: StreamingDistributionSummaryList = null,
    NextMarker: String = null
  ): StreamingDistributionList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionList]
  }
}

