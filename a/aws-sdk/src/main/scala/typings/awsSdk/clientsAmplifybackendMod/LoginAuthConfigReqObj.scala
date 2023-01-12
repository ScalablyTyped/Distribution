package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginAuthConfigReqObj extends StObject {
  
  /**
    * The Amazon Cognito identity pool ID used for the Amplify Admin UI login authorization.
    */
  var AwsCognitoIdentityPoolId: js.UndefOr[string] = js.undefined
  
  /**
    * The AWS Region for the Amplify Admin UI login.
    */
  var AwsCognitoRegion: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Cognito user pool ID used for Amplify Admin UI login authentication.
    */
  var AwsUserPoolsId: js.UndefOr[string] = js.undefined
  
  /**
    * The web client ID for the Amazon Cognito user pools.
    */
  var AwsUserPoolsWebClientId: js.UndefOr[string] = js.undefined
}
object LoginAuthConfigReqObj {
  
  inline def apply(): LoginAuthConfigReqObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginAuthConfigReqObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginAuthConfigReqObj] (val x: Self) extends AnyVal {
    
    inline def setAwsCognitoIdentityPoolId(value: string): Self = StObject.set(x, "AwsCognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setAwsCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "AwsCognitoIdentityPoolId", js.undefined)
    
    inline def setAwsCognitoRegion(value: string): Self = StObject.set(x, "AwsCognitoRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsCognitoRegionUndefined: Self = StObject.set(x, "AwsCognitoRegion", js.undefined)
    
    inline def setAwsUserPoolsId(value: string): Self = StObject.set(x, "AwsUserPoolsId", value.asInstanceOf[js.Any])
    
    inline def setAwsUserPoolsIdUndefined: Self = StObject.set(x, "AwsUserPoolsId", js.undefined)
    
    inline def setAwsUserPoolsWebClientId(value: string): Self = StObject.set(x, "AwsUserPoolsWebClientId", value.asInstanceOf[js.Any])
    
    inline def setAwsUserPoolsWebClientIdUndefined: Self = StObject.set(x, "AwsUserPoolsWebClientId", js.undefined)
  }
}
