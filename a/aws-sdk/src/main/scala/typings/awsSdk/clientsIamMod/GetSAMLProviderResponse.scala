package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSAMLProviderResponse extends StObject {
  
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined
  
  /**
    * A list of tags that are attached to the specified IAM SAML provider. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.undefined
}
object GetSAMLProviderResponse {
  
  inline def apply(): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSAMLProviderResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = StObject.set(x, "SAMLMetadataDocument", value.asInstanceOf[js.Any])
    
    inline def setSAMLMetadataDocumentUndefined: Self = StObject.set(x, "SAMLMetadataDocument", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
