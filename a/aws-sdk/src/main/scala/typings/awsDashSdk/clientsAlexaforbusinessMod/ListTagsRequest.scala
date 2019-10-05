package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    * The ARN of the specified resource for which to list tags.
    */
  var Arn: typings.awsDashSdk.clientsAlexaforbusinessMod.Arn
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListTagsRequest {
  @scala.inline
  def apply(Arn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsRequest]
  }
}

