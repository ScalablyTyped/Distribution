package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoolUsageRequest extends js.Object {
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.undefined
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListIdentityPoolUsageRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: String = null): ListIdentityPoolUsageRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityPoolUsageRequest]
  }
}

