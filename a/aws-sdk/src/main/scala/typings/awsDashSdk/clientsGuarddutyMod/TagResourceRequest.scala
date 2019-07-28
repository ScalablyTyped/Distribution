package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the given GuardDuty resource 
    */
  var ResourceArn: GuardDutyArn
  /**
    * The tags to be added to a resource.
    */
  var Tags: TagMap
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GuardDutyArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

