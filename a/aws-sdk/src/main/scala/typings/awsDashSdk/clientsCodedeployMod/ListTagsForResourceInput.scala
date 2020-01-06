package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * An identifier returned from the previous ListTagsForResource call. It can be used to return the next set of applications in the list.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodedeployMod.NextToken] = js.native
  /**
    *  The ARN of a CodeDeploy resource. ListTagsForResource returns all the tags associated with the resource that is identified by the ResourceArn. 
    */
  var ResourceArn: Arn = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceArn: Arn, NextToken: NextToken = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

