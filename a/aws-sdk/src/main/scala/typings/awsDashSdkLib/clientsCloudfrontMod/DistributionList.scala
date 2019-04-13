package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionList extends js.Object {
  /**
    * A flag that indicates whether more distributions remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more distributions in the list.
    */
  var IsTruncated: scala.Boolean
  /**
    * A complex type that contains one DistributionSummary element for each distribution that was created by the current AWS account.
    */
  var Items: js.UndefOr[DistributionSummaryList] = js.undefined
  /**
    * The value you provided for the Marker request parameter.
    */
  var Marker: java.lang.String
  /**
    * The value you provided for the MaxItems request parameter.
    */
  var MaxItems: integer
  /**
    * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your distributions where they left off. 
    */
  var NextMarker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of distributions that were created by the current AWS account. 
    */
  var Quantity: integer
}

object DistributionList {
  @scala.inline
  def apply(
    IsTruncated: scala.Boolean,
    Marker: java.lang.String,
    MaxItems: integer,
    Quantity: integer,
    Items: DistributionSummaryList = null,
    NextMarker: java.lang.String = null
  ): DistributionList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated, Marker = Marker, MaxItems = MaxItems, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DistributionList]
  }
}

