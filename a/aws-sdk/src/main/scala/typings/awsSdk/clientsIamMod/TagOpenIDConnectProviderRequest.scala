package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The ARN of the OIDC identity provider in IAM to which you want to add tags. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var OpenIDConnectProviderArn: arnType
  
  /**
    * The list of tags that you want to attach to the OIDC identity provider in IAM. Each tag consists of a key name and an associated value.
    */
  var Tags: tagListType
}
object TagOpenIDConnectProviderRequest {
  
  inline def apply(OpenIDConnectProviderArn: arnType, Tags: tagListType): TagOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOpenIDConnectProviderRequest]
  }
  
  extension [Self <: TagOpenIDConnectProviderRequest](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
