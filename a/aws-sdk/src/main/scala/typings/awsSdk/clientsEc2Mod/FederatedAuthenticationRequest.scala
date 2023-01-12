package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedAuthenticationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SAMLProviderArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
    */
  var SelfServiceSAMLProviderArn: js.UndefOr[String] = js.undefined
}
object FederatedAuthenticationRequest {
  
  inline def apply(): FederatedAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedAuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FederatedAuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setSAMLProviderArn(value: String): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setSAMLProviderArnUndefined: Self = StObject.set(x, "SAMLProviderArn", js.undefined)
    
    inline def setSelfServiceSAMLProviderArn(value: String): Self = StObject.set(x, "SelfServiceSAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setSelfServiceSAMLProviderArnUndefined: Self = StObject.set(x, "SelfServiceSAMLProviderArn", js.undefined)
  }
}
