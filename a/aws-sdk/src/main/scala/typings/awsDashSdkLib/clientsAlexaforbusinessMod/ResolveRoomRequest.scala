package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveRoomRequest extends js.Object {
  /**
    * The ARN of the skill that was requested. Required.
    */
  var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.SkillId
  /**
    * The ARN of the user. Required.
    */
  var UserId: awsDashSdkLib.clientsAlexaforbusinessMod.UserId
}

object ResolveRoomRequest {
  @scala.inline
  def apply(SkillId: SkillId, UserId: UserId): ResolveRoomRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId, UserId = UserId)
  
    __obj.asInstanceOf[ResolveRoomRequest]
  }
}

