package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * An identifier returned from the previous ListTagsForResource call. It can be used to return the next set of applications in the list.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  The ARN of a CodeDeploy resource. ListTagsForResource returns all the tags associated with the resource that is identified by the ResourceArn. 
    */
  var ResourceArn: Arn
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceArn: Arn, NextToken: NextToken = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

