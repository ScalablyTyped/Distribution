package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProtectionsRequest extends js.Object {
  /**
    * The maximum number of Protection objects to be returned. If this is left blank the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of Protection objects returned could be less than MaxResults, even if there are still more Protection objects yet to return. If there are more Protection objects to return, AWS WAF will always also return a NextToken.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsShieldMod.MaxResults] = js.native
  /**
    * The ListProtectionsRequest.NextToken value from a previous call to ListProtections. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListProtectionsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: Token = null): ListProtectionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectionsRequest]
  }
}

