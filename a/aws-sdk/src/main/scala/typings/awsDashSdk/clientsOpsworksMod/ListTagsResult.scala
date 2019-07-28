package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResult extends js.Object {
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to get the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.NextToken] = js.undefined
  /**
    * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Tags] = js.undefined
}

object ListTagsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsResult]
  }
}

