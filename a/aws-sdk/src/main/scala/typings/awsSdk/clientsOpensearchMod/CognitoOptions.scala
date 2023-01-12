package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoOptions extends StObject {
  
  /**
    * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.IdentityPoolId] = js.undefined
  
  /**
    * The AmazonOpenSearchServiceCognitoAccess role that allows OpenSearch Service to configure your user pool and identity pool.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsOpensearchMod.RoleArn] = js.undefined
  
  /**
    * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch Dashboards authentication.
    */
  var UserPoolId: js.UndefOr[typings.awsSdk.clientsOpensearchMod.UserPoolId] = js.undefined
}
object CognitoOptions {
  
  inline def apply(): CognitoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CognitoOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUserPoolId(value: UserPoolId): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
