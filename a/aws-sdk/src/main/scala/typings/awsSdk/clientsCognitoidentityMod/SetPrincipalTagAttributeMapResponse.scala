package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetPrincipalTagAttributeMapResponse extends StObject {
  
  /**
    * The ID of the Identity Pool you want to set attribute mappings for.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * The provider name you want to use for attribute mappings.
    */
  var IdentityProviderName: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityProviderName] = js.undefined
  
  /**
    * You can use this operation to add principal tags. The PrincipalTagsoperation enables you to reference user attributes in your IAM permissions policy.
    */
  var PrincipalTags: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.PrincipalTags] = js.undefined
  
  /**
    * You can use this operation to select default (username and clientID) attribute mappings.
    */
  var UseDefaults: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.UseDefaults] = js.undefined
}
object SetPrincipalTagAttributeMapResponse {
  
  inline def apply(): SetPrincipalTagAttributeMapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetPrincipalTagAttributeMapResponse]
  }
  
  extension [Self <: SetPrincipalTagAttributeMapResponse](x: Self) {
    
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
