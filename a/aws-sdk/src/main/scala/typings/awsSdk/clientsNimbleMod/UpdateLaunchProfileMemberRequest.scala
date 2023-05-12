package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchProfileMemberRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the launch profile used to control access from the streaming session.
    */
  var launchProfileId: String
  
  /**
    * The persona.
    */
  var persona: LaunchProfilePersona
  
  /**
    * The principal ID. This currently supports a IAM Identity Center UserId. 
    */
  var principalId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object UpdateLaunchProfileMemberRequest {
  
  inline def apply(launchProfileId: String, persona: LaunchProfilePersona, principalId: String, studioId: String): UpdateLaunchProfileMemberRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], persona = persona.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchProfileMemberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLaunchProfileMemberRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setPersona(value: LaunchProfilePersona): Self = StObject.set(x, "persona", value.asInstanceOf[js.Any])
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
