package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the given GuardDuty resource 
    */
  var ResourceArn: GuardDutyArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: GuardDutyArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

