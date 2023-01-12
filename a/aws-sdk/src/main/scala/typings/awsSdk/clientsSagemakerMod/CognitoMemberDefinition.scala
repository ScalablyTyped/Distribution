package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoMemberDefinition extends StObject {
  
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: typings.awsSdk.clientsSagemakerMod.ClientId
  
  /**
    * An identifier for a user group.
    */
  var UserGroup: CognitoUserGroup
  
  /**
    * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
    */
  var UserPool: CognitoUserPool
}
object CognitoMemberDefinition {
  
  inline def apply(ClientId: ClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CognitoMemberDefinition] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setUserGroup(value: CognitoUserGroup): Self = StObject.set(x, "UserGroup", value.asInstanceOf[js.Any])
    
    inline def setUserPool(value: CognitoUserPool): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
  }
}
