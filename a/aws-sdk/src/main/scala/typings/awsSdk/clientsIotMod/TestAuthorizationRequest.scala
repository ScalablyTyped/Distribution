package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAuthorizationRequest extends StObject {
  
  /**
    * A list of authorization info objects. Simulating authorization will create a response for each authInfo object in the list.
    */
  var authInfos: AuthInfos
  
  /**
    * The MQTT client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  
  /**
    * When testing custom authorization, the policies specified here are treated as if they are attached to the principal being authorized.
    */
  var policyNamesToAdd: js.UndefOr[PolicyNames] = js.undefined
  
  /**
    * When testing custom authorization, the policies specified here are treated as if they are not attached to the principal being authorized.
    */
  var policyNamesToSkip: js.UndefOr[PolicyNames] = js.undefined
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: js.UndefOr[Principal] = js.undefined
}
object TestAuthorizationRequest {
  
  inline def apply(authInfos: AuthInfos): TestAuthorizationRequest = {
    val __obj = js.Dynamic.literal(authInfos = authInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAuthorizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestAuthorizationRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthInfos(value: AuthInfos): Self = StObject.set(x, "authInfos", value.asInstanceOf[js.Any])
    
    inline def setAuthInfosVarargs(value: AuthInfo*): Self = StObject.set(x, "authInfos", js.Array(value*))
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "cognitoIdentityPoolId", js.undefined)
    
    inline def setPolicyNamesToAdd(value: PolicyNames): Self = StObject.set(x, "policyNamesToAdd", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesToAddUndefined: Self = StObject.set(x, "policyNamesToAdd", js.undefined)
    
    inline def setPolicyNamesToAddVarargs(value: PolicyName*): Self = StObject.set(x, "policyNamesToAdd", js.Array(value*))
    
    inline def setPolicyNamesToSkip(value: PolicyNames): Self = StObject.set(x, "policyNamesToSkip", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesToSkipUndefined: Self = StObject.set(x, "policyNamesToSkip", js.undefined)
    
    inline def setPolicyNamesToSkipVarargs(value: PolicyName*): Self = StObject.set(x, "policyNamesToSkip", js.Array(value*))
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
  }
}
