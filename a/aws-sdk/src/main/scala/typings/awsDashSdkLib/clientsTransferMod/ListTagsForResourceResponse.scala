package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * This value is the ARN you specified to list the tags of.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * When you can get additional results from the ListTagsForResource call, a NextToken parameter is returned in the output. You can then pass in a subsequent command the NextToken parameter to continue listing additional tags.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Key-value pairs that are assigned to a resource, usually for the purpose of grouping and searching for items. Tags are metadata that you define that you can use for any purpose.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Arn: Arn = null, NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

