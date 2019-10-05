package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsInput extends js.Object {
  /**
    * Maximum number of tags to return.
    */
  var MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined
  /**
    *  If the response to the previous ListTags request is truncated, Amazon SageMaker returns this token. To retrieve the next set of tags, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
    */
  var ResourceArn: typings.awsDashSdk.clientsSagemakerMod.ResourceArn
}

object ListTagsInput {
  @scala.inline
  def apply(ResourceArn: ResourceArn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsInput]
  }
}

