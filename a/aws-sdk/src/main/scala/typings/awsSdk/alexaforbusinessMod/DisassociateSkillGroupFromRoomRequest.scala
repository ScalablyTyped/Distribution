package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSkillGroupFromRoomRequest extends StObject {
  
  /**
    * The ARN of the room from which the skill group is to be disassociated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the skill group to disassociate from a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}
object DisassociateSkillGroupFromRoomRequest {
  
  @scala.inline
  def apply(): DisassociateSkillGroupFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateSkillGroupFromRoomRequest]
  }
  
  @scala.inline
  implicit class DisassociateSkillGroupFromRoomRequestMutableBuilder[Self <: DisassociateSkillGroupFromRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
