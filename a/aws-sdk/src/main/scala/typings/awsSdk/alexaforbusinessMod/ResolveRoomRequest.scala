package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveRoomRequest extends StObject {
  
  /**
    * The ARN of the skill that was requested. Required.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId
  
  /**
    * The ARN of the user. Required.
    */
  var UserId: typings.awsSdk.alexaforbusinessMod.UserId
}
object ResolveRoomRequest {
  
  inline def apply(SkillId: SkillId, UserId: UserId): ResolveRoomRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveRoomRequest]
  }
  
  extension [Self <: ResolveRoomRequest](x: Self) {
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
