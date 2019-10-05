package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    * Do not use. A validation exception occurs if you add a MaxResults parameter to a ListTagsRequest call. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.MaxResults] = js.undefined
  /**
    * Do not use. A validation exception occurs if you add a NextToken parameter to a ListTagsRequest call. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.NextToken] = js.undefined
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsDashSdk.clientsOpsworksMod.ResourceArn
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsRequest]
  }
}

