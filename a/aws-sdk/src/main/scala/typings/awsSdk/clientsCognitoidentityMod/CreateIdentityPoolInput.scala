package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIdentityPoolInput extends StObject {
  
  /**
    * Enables or disables the Basic (Classic) authentication flow. For more information, see Identity Pools (Federated Identities) Authentication Flow in the Amazon Cognito Developer Guide.
    */
  var AllowClassicFlow: js.UndefOr[ClassicFlow] = js.undefined
  
  /**
    * TRUE if the identity pool supports unauthenticated logins.
    */
  var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
  
  /**
    * An array of Amazon Cognito user pools and their client IDs.
    */
  var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined
  
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-). Once you have set a developer provider name, you cannot change it. Please take care in setting this parameter.
    */
  var DeveloperProviderName: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.DeveloperProviderName] = js.undefined
  
  /**
    * A string that you provide.
    */
  var IdentityPoolName: typings.awsSdk.clientsCognitoidentityMod.IdentityPoolName
  
  /**
    * Tags to assign to the identity pool. A tag is a label that you can apply to identity pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the OpenID Connect providers.
    */
  var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
  
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity pool.
    */
  var SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined
  
  /**
    * Optional key:value pairs mapping provider names to provider app IDs.
    */
  var SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
}
object CreateIdentityPoolInput {
  
  inline def apply(AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated, IdentityPoolName: IdentityPoolName): CreateIdentityPoolInput = {
    val __obj = js.Dynamic.literal(AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities.asInstanceOf[js.Any], IdentityPoolName = IdentityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityPoolInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIdentityPoolInput] (val x: Self) extends AnyVal {
    
    inline def setAllowClassicFlow(value: ClassicFlow): Self = StObject.set(x, "AllowClassicFlow", value.asInstanceOf[js.Any])
    
    inline def setAllowClassicFlowUndefined: Self = StObject.set(x, "AllowClassicFlow", js.undefined)
    
    inline def setAllowUnauthenticatedIdentities(value: IdentityPoolUnauthenticated): Self = StObject.set(x, "AllowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentityProviders(value: CognitoIdentityProviderList): Self = StObject.set(x, "CognitoIdentityProviders", value.asInstanceOf[js.Any])
    
    inline def setCognitoIdentityProvidersUndefined: Self = StObject.set(x, "CognitoIdentityProviders", js.undefined)
    
    inline def setCognitoIdentityProvidersVarargs(value: CognitoIdentityProvider*): Self = StObject.set(x, "CognitoIdentityProviders", js.Array(value*))
    
    inline def setDeveloperProviderName(value: DeveloperProviderName): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    inline def setIdentityPoolName(value: IdentityPoolName): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolTags(value: IdentityPoolTagsType): Self = StObject.set(x, "IdentityPoolTags", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolTagsUndefined: Self = StObject.set(x, "IdentityPoolTags", js.undefined)
    
    inline def setOpenIdConnectProviderARNs(value: OIDCProviderList): Self = StObject.set(x, "OpenIdConnectProviderARNs", value.asInstanceOf[js.Any])
    
    inline def setOpenIdConnectProviderARNsUndefined: Self = StObject.set(x, "OpenIdConnectProviderARNs", js.undefined)
    
    inline def setOpenIdConnectProviderARNsVarargs(value: ARNString*): Self = StObject.set(x, "OpenIdConnectProviderARNs", js.Array(value*))
    
    inline def setSamlProviderARNs(value: SAMLProviderList): Self = StObject.set(x, "SamlProviderARNs", value.asInstanceOf[js.Any])
    
    inline def setSamlProviderARNsUndefined: Self = StObject.set(x, "SamlProviderARNs", js.undefined)
    
    inline def setSamlProviderARNsVarargs(value: ARNString*): Self = StObject.set(x, "SamlProviderARNs", js.Array(value*))
    
    inline def setSupportedLoginProviders(value: IdentityProviders): Self = StObject.set(x, "SupportedLoginProviders", value.asInstanceOf[js.Any])
    
    inline def setSupportedLoginProvidersUndefined: Self = StObject.set(x, "SupportedLoginProviders", js.undefined)
  }
}
