package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKey extends StObject {
  
  var accessKey: String
  
  var accountId: String
  
  var callerId: String
  
  var cognitoIdentity: Null
  
  var principalOrgId: String
  
  var userArn: String
  
  var userId: String
}
object AccessKey {
  
  inline def apply(
    accessKey: String,
    accountId: String,
    callerId: String,
    cognitoIdentity: Null,
    principalOrgId: String,
    userArn: String,
    userId: String
  ): AccessKey = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], callerId = callerId.asInstanceOf[js.Any], cognitoIdentity = cognitoIdentity.asInstanceOf[js.Any], principalOrgId = principalOrgId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessKey] (val x: Self) extends AnyVal {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setCallerId(value: String): Self = StObject.set(x, "callerId", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentity(value: Null): Self = StObject.set(x, "cognitoIdentity", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOrgId(value: String): Self = StObject.set(x, "principalOrgId", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
