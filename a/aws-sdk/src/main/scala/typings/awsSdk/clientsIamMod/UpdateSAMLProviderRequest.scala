package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSAMLProviderRequest extends StObject {
  
  /**
    * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP.
    */
  var SAMLMetadataDocument: SAMLMetadataDocumentType
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider to update. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var SAMLProviderArn: arnType
}
object UpdateSAMLProviderRequest {
  
  inline def apply(SAMLMetadataDocument: SAMLMetadataDocumentType, SAMLProviderArn: arnType): UpdateSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLMetadataDocument = SAMLMetadataDocument.asInstanceOf[js.Any], SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSAMLProviderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSAMLProviderRequest] (val x: Self) extends AnyVal {
    
    inline def setSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = StObject.set(x, "SAMLMetadataDocument", value.asInstanceOf[js.Any])
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
  }
}
