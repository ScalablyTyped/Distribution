package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrincipalTagAttributeMapResponse extends StObject {
  
  /**
    * You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * You can use this operation to get the provider name.
    */
  var IdentityProviderName: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityProviderName] = js.undefined
  
  /**
    * You can use this operation to add principal tags. The PrincipalTagsoperation enables you to reference user attributes in your IAM permissions policy.
    */
  var PrincipalTags: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.PrincipalTags] = js.undefined
  
  /**
    * You can use this operation to list 
    */
  var UseDefaults: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.UseDefaults] = js.undefined
}
object GetPrincipalTagAttributeMapResponse {
  
  inline def apply(): GetPrincipalTagAttributeMapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrincipalTagAttributeMapResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPrincipalTagAttributeMapResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIdentityProviderName(value: IdentityProviderName): Self = StObject.set(x, "IdentityProviderName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNameUndefined: Self = StObject.set(x, "IdentityProviderName", js.undefined)
    
    inline def setPrincipalTags(value: PrincipalTags): Self = StObject.set(x, "PrincipalTags", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTagsUndefined: Self = StObject.set(x, "PrincipalTags", js.undefined)
    
    inline def setUseDefaults(value: UseDefaults): Self = StObject.set(x, "UseDefaults", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultsUndefined: Self = StObject.set(x, "UseDefaults", js.undefined)
  }
}
