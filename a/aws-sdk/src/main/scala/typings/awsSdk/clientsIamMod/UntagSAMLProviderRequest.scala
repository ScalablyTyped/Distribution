package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagSAMLProviderRequest extends StObject {
  
  /**
    * The ARN of the SAML identity provider in IAM from which you want to remove tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SAMLProviderArn: arnType
  
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified SAML identity provider.
    */
  var TagKeys: tagKeyListType
}
object UntagSAMLProviderRequest {
  
  inline def apply(SAMLProviderArn: arnType, TagKeys: tagKeyListType): UntagSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagSAMLProviderRequest]
  }
  
  extension [Self <: UntagSAMLProviderRequest](x: Self) {
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: tagKeyListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: tagKeyType*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
