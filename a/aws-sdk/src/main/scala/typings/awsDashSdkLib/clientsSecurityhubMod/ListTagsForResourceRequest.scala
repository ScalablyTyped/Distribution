package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the resource to retrieve tags for.
    */
  var ResourceArn: awsDashSdkLib.clientsSecurityhubMod.ResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

