package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource to which you want to associate the tags. 
    */
  var ResourceArn: ComprehendArn
  /**
    * Tags being associated with a specific Amazon Comprehend resource. There can be a maximum of 50 tags (both existing and pending) associated with a specific resource. 
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ComprehendArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

