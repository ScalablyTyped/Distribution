package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIdentityProviderConfigResponse extends StObject {
  
  /**
    * The tags for the resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  var update: js.UndefOr[Update] = js.undefined
}
object AssociateIdentityProviderConfigResponse {
  
  inline def apply(): AssociateIdentityProviderConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateIdentityProviderConfigResponse]
  }
  
  extension [Self <: AssociateIdentityProviderConfigResponse](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
