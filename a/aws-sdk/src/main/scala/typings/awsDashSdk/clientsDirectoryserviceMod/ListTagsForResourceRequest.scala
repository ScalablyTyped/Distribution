package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * Reserved for future use.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * Identifier (ID) of the directory for which you want to retrieve tags.
    */
  var ResourceId: typings.awsDashSdk.clientsDirectoryserviceMod.ResourceId
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, Limit: Int | Double = null, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

