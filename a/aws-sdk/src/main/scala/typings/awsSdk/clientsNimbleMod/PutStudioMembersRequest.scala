package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStudioMembersRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the identity store.
    */
  var identityStoreId: String
  
  /**
    * A list of members.
    */
  var members: NewStudioMemberList
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object PutStudioMembersRequest {
  
  inline def apply(identityStoreId: String, members: NewStudioMemberList, studioId: String): PutStudioMembersRequest = {
    val __obj = js.Dynamic.literal(identityStoreId = identityStoreId.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStudioMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutStudioMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setIdentityStoreId(value: String): Self = StObject.set(x, "identityStoreId", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: NewStudioMemberList): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: NewStudioMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
