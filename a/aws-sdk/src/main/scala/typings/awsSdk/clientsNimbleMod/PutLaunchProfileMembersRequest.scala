package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLaunchProfileMembersRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the identity store.
    */
  var identityStoreId: String
  
  /**
    * The ID of the launch profile used to control access from the streaming session.
    */
  var launchProfileId: String
  
  /**
    * A list of members.
    */
  var members: NewLaunchProfileMemberList
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object PutLaunchProfileMembersRequest {
  
  inline def apply(
    identityStoreId: String,
    launchProfileId: String,
    members: NewLaunchProfileMemberList,
    studioId: String
  ): PutLaunchProfileMembersRequest = {
    val __obj = js.Dynamic.literal(identityStoreId = identityStoreId.asInstanceOf[js.Any], launchProfileId = launchProfileId.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLaunchProfileMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutLaunchProfileMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setIdentityStoreId(value: String): Self = StObject.set(x, "identityStoreId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: NewLaunchProfileMemberList): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: NewLaunchProfileMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
