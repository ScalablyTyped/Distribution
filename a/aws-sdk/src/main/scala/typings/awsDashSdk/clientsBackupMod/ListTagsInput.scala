package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsInput extends js.Object {
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBackupMod.MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the type of resource. Valid targets for ListTags are recovery points, backup plans, and backup vaults.
    */
  var ResourceArn: ARN
}

object ListTagsInput {
  @scala.inline
  def apply(ResourceArn: ARN, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: String = null): ListTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsInput]
  }
}

