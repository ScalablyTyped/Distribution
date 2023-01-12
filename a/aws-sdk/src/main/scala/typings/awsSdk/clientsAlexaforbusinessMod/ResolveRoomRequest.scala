package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveRoomRequest extends StObject {
  
  /**
    * The ARN of the skill that was requested. Required.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
  
  /**
    * The ARN of the user. Required.
    */
  var UserId: typings.awsSdk.clientsAlexaforbusinessMod.UserId
}
object ResolveRoomRequest {
  
  inline def apply(SkillId: SkillId, UserId: UserId): ResolveRoomRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveRoomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveRoomRequest] (val x: Self) extends AnyVal {
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
