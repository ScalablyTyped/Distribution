package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource to apply the tags to.
    */
  var ResourceArn: awsDashSdkLib.clientsSecurityhubMod.ResourceArn
  /**
    * The tags to add to the resource.
    */
  var Tags: TagMap
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

