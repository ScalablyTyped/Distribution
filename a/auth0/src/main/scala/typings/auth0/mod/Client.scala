package typings.auth0.mod

import typings.auth0.anon.Alg
import typings.auth0.anon.Cert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  var addons: js.UndefOr[js.Any] = js.native
  
  var allowed_clients: js.UndefOr[js.Array[String]] = js.native
  
  var allowed_logout_urls: js.UndefOr[js.Array[String]] = js.native
  
  var allowed_origins: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The type of application this client represents.
    */
  var app_type: js.UndefOr[String] = js.native
  
  /**
    * The URLs that Auth0 can use to as a callback for the client.
    */
  var callbacks: js.UndefOr[js.Array[String]] = js.native
  
  var client_aliases: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The id of the client.
    */
  var client_id: js.UndefOr[String] = js.native
  
  var client_metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * The client secret, it must not be public.
    */
  var client_secret: js.UndefOr[String] = js.native
  
  /**
    * `true` if this client can be used to make cross-origin authentication requests, `false` otherwise (default: `false`)
    */
  var cross_origin_auth: js.UndefOr[Boolean] = js.native
  
  /**
    * Url of the location in your site where the cross origin verification takes place for the cross-origin auth flow when performing Auth in your own domain instead of Auth0 hosted login page.
    */
  var cross_origin_loc: js.UndefOr[String] = js.native
  
  var custom_login_page: js.UndefOr[String] = js.native
  
  /**
    * `true` if the custom login page is to be used, `false` otherwise. (default: `true`)
    */
  var custom_login_page_on: js.UndefOr[Boolean] = js.native
  
  var custom_login_page_preview: js.UndefOr[String] = js.native
  
  /**
    * Free text description of the purpose of the Client. (Max character length: `140`).
    */
  var description: js.UndefOr[String] = js.native
  
  var encryption_key: js.UndefOr[Cert] = js.native
  
  var form_template: js.UndefOr[String] = js.native
  
  /**
    * A set of grant types that the client is authorized to use
    */
  var grant_types: js.UndefOr[js.Array[Grant]] = js.native
  
  var initiate_login_uri: js.UndefOr[String] = js.native
  
  /**
    * Whether this client a first party client or not.
    */
  var is_first_party: js.UndefOr[Boolean] = js.native
  
  var jwt_configuration: js.UndefOr[Alg] = js.native
  
  /**
    * The URL of the client logo (recommended size: 150x150).
    */
  var logo_uri: js.UndefOr[String] = js.native
  
  var mobile: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the client.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether this client will conform to strict OIDC specifications.
    */
  var oidc_conformant: js.UndefOr[Boolean] = js.native
  
  /**
    * Client signing keys.
    */
  var signing_keys: js.UndefOr[js.Array[String]] = js.native
  
  var sso: js.UndefOr[Boolean] = js.native
  
  /**
    * `true` to disable Single Sign On, `false` otherwise (default: `false`)
    */
  var sso_disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the requested authentication method for the token endpoint. Possible values are 'none' (public client without a client secret), 'client_secret_post' (client uses HTTP POST parameters) or 'client_secret_basic' (client uses HTTP Basic) ['none' or 'client_secret_post' or 'client_secret_basic']
    */
  var token_endpoint_auth_method: js.UndefOr[String] = js.native
  
  var web_origins: js.UndefOr[js.Array[String]] = js.native
}
object Client {
  
  @scala.inline
  def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddons(value: js.Any): Self = this.set("addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddons: Self = this.set("addons", js.undefined)
    
    @scala.inline
    def setAllowed_clientsVarargs(value: String*): Self = this.set("allowed_clients", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_clients(value: js.Array[String]): Self = this.set("allowed_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_clients: Self = this.set("allowed_clients", js.undefined)
    
    @scala.inline
    def setAllowed_logout_urlsVarargs(value: String*): Self = this.set("allowed_logout_urls", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_logout_urls(value: js.Array[String]): Self = this.set("allowed_logout_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_logout_urls: Self = this.set("allowed_logout_urls", js.undefined)
    
    @scala.inline
    def setAllowed_originsVarargs(value: String*): Self = this.set("allowed_origins", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_origins(value: js.Array[String]): Self = this.set("allowed_origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_origins: Self = this.set("allowed_origins", js.undefined)
    
    @scala.inline
    def setApp_type(value: String): Self = this.set("app_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_type: Self = this.set("app_type", js.undefined)
    
    @scala.inline
    def setCallbacksVarargs(value: String*): Self = this.set("callbacks", js.Array(value :_*))
    
    @scala.inline
    def setCallbacks(value: js.Array[String]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setClient_aliasesVarargs(value: String*): Self = this.set("client_aliases", js.Array(value :_*))
    
    @scala.inline
    def setClient_aliases(value: js.Array[String]): Self = this.set("client_aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_aliases: Self = this.set("client_aliases", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    
    @scala.inline
    def setClient_metadata(value: js.Any): Self = this.set("client_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_metadata: Self = this.set("client_metadata", js.undefined)
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
    
    @scala.inline
    def setCross_origin_auth(value: Boolean): Self = this.set("cross_origin_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCross_origin_auth: Self = this.set("cross_origin_auth", js.undefined)
    
    @scala.inline
    def setCross_origin_loc(value: String): Self = this.set("cross_origin_loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCross_origin_loc: Self = this.set("cross_origin_loc", js.undefined)
    
    @scala.inline
    def setCustom_login_page(value: String): Self = this.set("custom_login_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_login_page: Self = this.set("custom_login_page", js.undefined)
    
    @scala.inline
    def setCustom_login_page_on(value: Boolean): Self = this.set("custom_login_page_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_login_page_on: Self = this.set("custom_login_page_on", js.undefined)
    
    @scala.inline
    def setCustom_login_page_preview(value: String): Self = this.set("custom_login_page_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_login_page_preview: Self = this.set("custom_login_page_preview", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEncryption_key(value: Cert): Self = this.set("encryption_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption_key: Self = this.set("encryption_key", js.undefined)
    
    @scala.inline
    def setForm_template(value: String): Self = this.set("form_template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm_template: Self = this.set("form_template", js.undefined)
    
    @scala.inline
    def setGrant_typesVarargs(value: Grant*): Self = this.set("grant_types", js.Array(value :_*))
    
    @scala.inline
    def setGrant_types(value: js.Array[Grant]): Self = this.set("grant_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrant_types: Self = this.set("grant_types", js.undefined)
    
    @scala.inline
    def setInitiate_login_uri(value: String): Self = this.set("initiate_login_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiate_login_uri: Self = this.set("initiate_login_uri", js.undefined)
    
    @scala.inline
    def setIs_first_party(value: Boolean): Self = this.set("is_first_party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_first_party: Self = this.set("is_first_party", js.undefined)
    
    @scala.inline
    def setJwt_configuration(value: Alg): Self = this.set("jwt_configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwt_configuration: Self = this.set("jwt_configuration", js.undefined)
    
    @scala.inline
    def setLogo_uri(value: String): Self = this.set("logo_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo_uri: Self = this.set("logo_uri", js.undefined)
    
    @scala.inline
    def setMobile(value: js.Any): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOidc_conformant(value: Boolean): Self = this.set("oidc_conformant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOidc_conformant: Self = this.set("oidc_conformant", js.undefined)
    
    @scala.inline
    def setSigning_keysVarargs(value: String*): Self = this.set("signing_keys", js.Array(value :_*))
    
    @scala.inline
    def setSigning_keys(value: js.Array[String]): Self = this.set("signing_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigning_keys: Self = this.set("signing_keys", js.undefined)
    
    @scala.inline
    def setSso(value: Boolean): Self = this.set("sso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSso: Self = this.set("sso", js.undefined)
    
    @scala.inline
    def setSso_disabled(value: Boolean): Self = this.set("sso_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSso_disabled: Self = this.set("sso_disabled", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_method(value: String): Self = this.set("token_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_endpoint_auth_method: Self = this.set("token_endpoint_auth_method", js.undefined)
    
    @scala.inline
    def setWeb_originsVarargs(value: String*): Self = this.set("web_origins", js.Array(value :_*))
    
    @scala.inline
    def setWeb_origins(value: js.Array[String]): Self = this.set("web_origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb_origins: Self = this.set("web_origins", js.undefined)
  }
}
