package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the AWS Glue resource to which to add the tags. For more information about AWS Glue resource ARNs, see the AWS Glue ARN string pattern.
    */
  var ResourceArn: GlueResourceArn
  /**
    * Tags to add to this resource.
    */
  var TagsToAdd: TagsMap
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToAdd: TagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagsToAdd = TagsToAdd)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

