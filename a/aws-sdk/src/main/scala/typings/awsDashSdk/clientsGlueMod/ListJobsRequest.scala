package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsRequest extends js.Object {
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}

object ListJobsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: GenericString = null,
    Tags: TagsMap = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListJobsRequest]
  }
}

