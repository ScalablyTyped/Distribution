package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSkillAuthorizationRequest extends StObject {
  
  /**
    * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult map to establish the authorization.
    */
  var AuthorizationResult: typings.awsSdk.clientsAlexaforbusinessMod.AuthorizationResult
  
  /**
    * The room that the skill is authorized for.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The unique identifier of a skill.
    */
  var SkillId: typings.awsSdk.clientsAlexaforbusinessMod.SkillId
}
object PutSkillAuthorizationRequest {
  
  inline def apply(AuthorizationResult: AuthorizationResult, SkillId: SkillId): PutSkillAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizationResult = AuthorizationResult.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSkillAuthorizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSkillAuthorizationRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationResult(value: AuthorizationResult): Self = StObject.set(x, "AuthorizationResult", value.asInstanceOf[js.Any])
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    inline def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    inline def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
