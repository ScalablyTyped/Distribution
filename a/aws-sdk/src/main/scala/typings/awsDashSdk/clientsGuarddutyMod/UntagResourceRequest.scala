package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the given GuardDuty resource 
    */
  var ResourceArn: GuardDutyArn
  /**
    * The tag keys to remove from a resource.
    */
  var TagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GuardDutyArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

