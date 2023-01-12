package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSAMLProviderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider resource object in IAM to get information about. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var SAMLProviderArn: arnType
}
object GetSAMLProviderRequest {
  
  inline def apply(SAMLProviderArn: arnType): GetSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSAMLProviderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSAMLProviderRequest] (val x: Self) extends AnyVal {
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
  }
}
