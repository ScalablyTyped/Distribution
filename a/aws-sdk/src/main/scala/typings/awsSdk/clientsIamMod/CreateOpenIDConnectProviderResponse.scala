package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpenIDConnectProviderResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
    */
  var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.undefined
  
  /**
    * A list of tags that are attached to the new IAM OIDC provider. The returned list of tags is sorted by tag key. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object CreateOpenIDConnectProviderResponse {
  
  inline def apply(): CreateOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
  }
  
  extension [Self <: CreateOpenIDConnectProviderResponse](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    
    inline def setOpenIDConnectProviderArnUndefined: Self = StObject.set(x, "OpenIDConnectProviderArn", js.undefined)
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
