package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID of the resource that you want to retrieve tags for. 
    */
  var ResourceId: TaggableResourceId
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: TaggableResourceId, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

