package typings.auth0.mod

import typings.auth0.anon.Alg
import typings.auth0.anon.Cert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var addons: js.UndefOr[js.Any] = js.undefined
  
  var allowed_clients: js.UndefOr[js.Array[String]] = js.undefined
  
  var allowed_logout_urls: js.UndefOr[js.Array[String]] = js.undefined
  
  var allowed_origins: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of application this client represents.
    */
  var app_type: js.UndefOr[String] = js.undefined
  
  /**
    * The URLs that Auth0 can use to as a callback for the client.
    */
  var callbacks: js.UndefOr[js.Array[String]] = js.undefined
  
  var client_aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The id of the client.
    */
  var client_id: js.UndefOr[String] = js.undefined
  
  var client_metadata: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The client secret, it must not be public.
    */
  var client_secret: js.UndefOr[String] = js.undefined
  
  /**
    * `true` if this client can be used to make cross-origin authentication requests, `false` otherwise (default: `false`)
    */
  var cross_origin_auth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Url of the location in your site where the cross origin verification takes place for the cross-origin auth flow when performing Auth in your own domain instead of Auth0 hosted login page.
    */
  var cross_origin_loc: js.UndefOr[String] = js.undefined
  
  var custom_login_page: js.UndefOr[String] = js.undefined
  
  /**
    * `true` if the custom login page is to be used, `false` otherwise. (default: `true`)
    */
  var custom_login_page_on: js.UndefOr[Boolean] = js.undefined
  
  var custom_login_page_preview: js.UndefOr[String] = js.undefined
  
  /**
    * Free text description of the purpose of the Client. (Max character length: `140`).
    */
  var description: js.UndefOr[String] = js.undefined
  
  var encryption_key: js.UndefOr[Cert] = js.undefined
  
  var form_template: js.UndefOr[String] = js.undefined
  
  /**
    * A set of grant types that the client is authorized to use
    */
  var grant_types: js.UndefOr[js.Array[Grant]] = js.undefined
  
  var initiate_login_uri: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this client a first party client or not.
    */
  var is_first_party: js.UndefOr[Boolean] = js.undefined
  
  var jwt_configuration: js.UndefOr[Alg] = js.undefined
  
  /**
    * The URL of the client logo (recommended size: 150x150).
    */
  var logo_uri: js.UndefOr[String] = js.undefined
  
  var mobile: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The name of the client.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this client will conform to strict OIDC specifications.
    */
  var oidc_conformant: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client signing keys.
    */
  var signing_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var sso: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to disable Single Sign On, `false` otherwise (default: `false`)
    */
  var sso_disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the requested authentication method for the token endpoint. Possible values are 'none' (public client without a client secret), 'client_secret_post' (client uses HTTP POST parameters) or 'client_secret_basic' (client uses HTTP Basic) ['none' or 'client_secret_post' or 'client_secret_basic']
    */
  var token_endpoint_auth_method: js.UndefOr[String] = js.undefined
  
  var web_origins: js.UndefOr[js.Array[String]] = js.undefined
}
object Client {
  
  @scala.inline
  def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddons(value: js.Any): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonsUndefined: Self = StObject.set(x, "addons", js.undefined)
    
    @scala.inline
    def setAllowed_clients(value: js.Array[String]): Self = StObject.set(x, "allowed_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_clientsUndefined: Self = StObject.set(x, "allowed_clients", js.undefined)
    
    @scala.inline
    def setAllowed_clientsVarargs(value: String*): Self = StObject.set(x, "allowed_clients", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_logout_urls(value: js.Array[String]): Self = StObject.set(x, "allowed_logout_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_logout_urlsUndefined: Self = StObject.set(x, "allowed_logout_urls", js.undefined)
    
    @scala.inline
    def setAllowed_logout_urlsVarargs(value: String*): Self = StObject.set(x, "allowed_logout_urls", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_origins(value: js.Array[String]): Self = StObject.set(x, "allowed_origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_originsUndefined: Self = StObject.set(x, "allowed_origins", js.undefined)
    
    @scala.inline
    def setAllowed_originsVarargs(value: String*): Self = StObject.set(x, "allowed_origins", js.Array(value :_*))
    
    @scala.inline
    def setApp_type(value: String): Self = StObject.set(x, "app_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_typeUndefined: Self = StObject.set(x, "app_type", js.undefined)
    
    @scala.inline
    def setCallbacks(value: js.Array[String]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    @scala.inline
    def setCallbacksVarargs(value: String*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
    
    @scala.inline
    def setClient_aliases(value: js.Array[String]): Self = StObject.set(x, "client_aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_aliasesUndefined: Self = StObject.set(x, "client_aliases", js.undefined)
    
    @scala.inline
    def setClient_aliasesVarargs(value: String*): Self = StObject.set(x, "client_aliases", js.Array(value :_*))
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setClient_metadata(value: js.Any): Self = StObject.set(x, "client_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_metadataUndefined: Self = StObject.set(x, "client_metadata", js.undefined)
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    @scala.inline
    def setCross_origin_auth(value: Boolean): Self = StObject.set(x, "cross_origin_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross_origin_authUndefined: Self = StObject.set(x, "cross_origin_auth", js.undefined)
    
    @scala.inline
    def setCross_origin_loc(value: String): Self = StObject.set(x, "cross_origin_loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross_origin_locUndefined: Self = StObject.set(x, "cross_origin_loc", js.undefined)
    
    @scala.inline
    def setCustom_login_page(value: String): Self = StObject.set(x, "custom_login_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_login_pageUndefined: Self = StObject.set(x, "custom_login_page", js.undefined)
    
    @scala.inline
    def setCustom_login_page_on(value: Boolean): Self = StObject.set(x, "custom_login_page_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_login_page_onUndefined: Self = StObject.set(x, "custom_login_page_on", js.undefined)
    
    @scala.inline
    def setCustom_login_page_preview(value: String): Self = StObject.set(x, "custom_login_page_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_login_page_previewUndefined: Self = StObject.set(x, "custom_login_page_preview", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncryption_key(value: Cert): Self = StObject.set(x, "encryption_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption_keyUndefined: Self = StObject.set(x, "encryption_key", js.undefined)
    
    @scala.inline
    def setForm_template(value: String): Self = StObject.set(x, "form_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm_templateUndefined: Self = StObject.set(x, "form_template", js.undefined)
    
    @scala.inline
    def setGrant_types(value: js.Array[Grant]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    @scala.inline
    def setGrant_typesVarargs(value: Grant*): Self = StObject.set(x, "grant_types", js.Array(value :_*))
    
    @scala.inline
    def setInitiate_login_uri(value: String): Self = StObject.set(x, "initiate_login_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiate_login_uriUndefined: Self = StObject.set(x, "initiate_login_uri", js.undefined)
    
    @scala.inline
    def setIs_first_party(value: Boolean): Self = StObject.set(x, "is_first_party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_first_partyUndefined: Self = StObject.set(x, "is_first_party", js.undefined)
    
    @scala.inline
    def setJwt_configuration(value: Alg): Self = StObject.set(x, "jwt_configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwt_configurationUndefined: Self = StObject.set(x, "jwt_configuration", js.undefined)
    
    @scala.inline
    def setLogo_uri(value: String): Self = StObject.set(x, "logo_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo_uriUndefined: Self = StObject.set(x, "logo_uri", js.undefined)
    
    @scala.inline
    def setMobile(value: js.Any): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOidc_conformant(value: Boolean): Self = StObject.set(x, "oidc_conformant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidc_conformantUndefined: Self = StObject.set(x, "oidc_conformant", js.undefined)
    
    @scala.inline
    def setSigning_keys(value: js.Array[String]): Self = StObject.set(x, "signing_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigning_keysUndefined: Self = StObject.set(x, "signing_keys", js.undefined)
    
    @scala.inline
    def setSigning_keysVarargs(value: String*): Self = StObject.set(x, "signing_keys", js.Array(value :_*))
    
    @scala.inline
    def setSso(value: Boolean): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    @scala.inline
    def setSso_disabled(value: Boolean): Self = StObject.set(x, "sso_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSso_disabledUndefined: Self = StObject.set(x, "sso_disabled", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_method(value: String): Self = StObject.set(x, "token_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_endpoint_auth_methodUndefined: Self = StObject.set(x, "token_endpoint_auth_method", js.undefined)
    
    @scala.inline
    def setWeb_origins(value: js.Array[String]): Self = StObject.set(x, "web_origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_originsUndefined: Self = StObject.set(x, "web_origins", js.undefined)
    
    @scala.inline
    def setWeb_originsVarargs(value: String*): Self = StObject.set(x, "web_origins", js.Array(value :_*))
  }
}
