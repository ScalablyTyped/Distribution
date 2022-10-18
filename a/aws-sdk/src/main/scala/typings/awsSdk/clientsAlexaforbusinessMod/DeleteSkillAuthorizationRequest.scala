package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSkillAuthorizationRequest extends StObject {
  
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object DeleteSkillAuthorizationRequest {
  
  inline def apply(SkillId: SkillId): DeleteSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSkillAuthorizationRequest]
  }
  
  extension [Self <: DeleteSkillAuthorizationRequest](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
