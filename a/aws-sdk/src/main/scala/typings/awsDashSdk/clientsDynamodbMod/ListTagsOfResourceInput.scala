package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOfResourceInput extends js.Object {
  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  /**
    * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
    */
  var ResourceArn: ResourceArnString
}

object ListTagsOfResourceInput {
  @scala.inline
  def apply(ResourceArn: ResourceArnString, NextToken: NextTokenString = null): ListTagsOfResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsOfResourceInput]
  }
}

