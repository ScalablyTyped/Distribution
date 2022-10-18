package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSAMLProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider that was updated.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.undefined
}
object UpdateSAMLProviderResponse {
  
  inline def apply(): UpdateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSAMLProviderResponse]
  }
  
  extension [Self <: UpdateSAMLProviderResponse](x: Self) {
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setSAMLProviderArnUndefined: Self = StObject.set(x, "SAMLProviderArn", js.undefined)
  }
}
