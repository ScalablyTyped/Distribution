package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListElasticsearchVersionsRequest extends js.Object {
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsEsMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEsMod.NextToken] = js.undefined
}

object ListElasticsearchVersionsRequest {
  @scala.inline
  def apply(MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListElasticsearchVersionsRequest]
  }
}

