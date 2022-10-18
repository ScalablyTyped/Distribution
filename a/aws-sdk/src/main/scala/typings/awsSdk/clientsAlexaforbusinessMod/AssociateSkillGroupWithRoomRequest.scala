package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSkillGroupWithRoomRequest extends StObject {
  
  /**
    * The ARN of the room with which to associate the skill group. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the skill group to associate with a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}
object AssociateSkillGroupWithRoomRequest {
  
  inline def apply(): AssociateSkillGroupWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
  }
  
  extension [Self <: AssociateSkillGroupWithRoomRequest](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSkillGroupArn(value: Arn): Self = StObject.set(x, "SkillGroupArn", value.asInstanceOf[js.Any])
    
    inline def setSkillGroupArnUndefined: Self = StObject.set(x, "SkillGroupArn", js.undefined)
  }
}
