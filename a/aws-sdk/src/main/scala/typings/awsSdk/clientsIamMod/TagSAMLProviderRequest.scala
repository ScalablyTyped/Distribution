package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSAMLProviderRequest extends StObject {
  
  /**
    * The ARN of the SAML identity provider in IAM to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SAMLProviderArn: arnType
  
  /**
    * The list of tags that you want to attach to the SAML identity provider in IAM. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagSAMLProviderRequest {
  
  inline def apply(SAMLProviderArn: arnType, Tags: tagListType): TagSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSAMLProviderRequest]
  }
  
  extension [Self <: TagSAMLProviderRequest](x: Self) {
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
