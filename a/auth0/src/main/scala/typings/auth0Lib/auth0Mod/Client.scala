package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var addons: js.UndefOr[js.Any] = js.undefined
  var allowed_clients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowed_logout_urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowed_origins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The type of application this client represents.
    */
  var app_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URLs that Auth0 can use to as a callback for the client.
    */
  var callbacks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var client_aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The id of the client.
    */
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * The client secret, it must not be public.
    */
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `true` if this client can be used to make cross-origin authentication requests, `false` otherwise (default: `false`)
    */
  var cross_origin_auth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Url fo the location in your site where the cross origin verification takes place for the cross-origin auth flow when performing Auth in your own domain instead of Auth0 hosted login page.
    */
  var cross_origin_loc: js.UndefOr[java.lang.String] = js.undefined
  var custom_login_page: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `true` if the custom login page is to be used, `false` otherwise. (default: `true`)
    */
  var custom_login_page_on: js.UndefOr[scala.Boolean] = js.undefined
  var custom_login_page_preview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Free text description of the purpose of the Client. (Max character length: `140`).
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var encryption_key: js.UndefOr[auth0Lib.Anon_Cert] = js.undefined
  var form_template: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * A set of grant types that the client is authorized to use
    */
  var grant_types: js.UndefOr[js.Array[Grant]] = js.undefined
  /**
    * Whether this client a first party client or not.
    */
  var is_first_party: js.UndefOr[scala.Boolean] = js.undefined
  var jwt_configuration: js.UndefOr[auth0Lib.Anon_Alg] = js.undefined
  /**
    * The URL of the client logo (recommended size: 150x150).
    */
  var logo_uri: js.UndefOr[java.lang.String] = js.undefined
  var mobile: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of the client.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this client will conform to strict OIDC specifications.
    */
  var oidc_conformant: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Client signing keys.
    */
  var signing_keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sso: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to disable Single Sign On, `false` otherwise (default: `false`)
    */
  var sso_disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the requested authentication method for the token endpoint. Possible values are 'none' (public client without a client secret), 'client_secret_post' (client uses HTTP POST parameters) or 'client_secret_basic' (client uses HTTP Basic) ['none' or 'client_secret_post' or 'client_secret_basic']
    */
  var token_endpoint_auth_method: js.UndefOr[java.lang.String] = js.undefined
  var web_origins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Client {
  @scala.inline
  def apply(
    addons: js.Any = null,
    allowed_clients: js.Array[java.lang.String] = null,
    allowed_logout_urls: js.Array[java.lang.String] = null,
    allowed_origins: js.Array[java.lang.String] = null,
    app_type: java.lang.String = null,
    callbacks: js.Array[java.lang.String] = null,
    client_aliases: js.Array[java.lang.String] = null,
    client_id: java.lang.String = null,
    client_metadata: js.Any = null,
    client_secret: java.lang.String = null,
    cross_origin_auth: js.UndefOr[scala.Boolean] = js.undefined,
    cross_origin_loc: java.lang.String = null,
    custom_login_page: java.lang.String = null,
    custom_login_page_on: js.UndefOr[scala.Boolean] = js.undefined,
    custom_login_page_preview: java.lang.String = null,
    description: java.lang.String = null,
    encryption_key: auth0Lib.Anon_Cert = null,
    form_template: java.lang.String = null,
    grant_types: js.Array[Grant] = null,
    is_first_party: js.UndefOr[scala.Boolean] = js.undefined,
    jwt_configuration: auth0Lib.Anon_Alg = null,
    logo_uri: java.lang.String = null,
    mobile: js.Any = null,
    name: java.lang.String = null,
    oidc_conformant: js.UndefOr[scala.Boolean] = js.undefined,
    signing_keys: js.Array[java.lang.String] = null,
    sso: js.UndefOr[scala.Boolean] = js.undefined,
    sso_disabled: js.UndefOr[scala.Boolean] = js.undefined,
    token_endpoint_auth_method: java.lang.String = null,
    web_origins: js.Array[java.lang.String] = null
  ): Client = {
    val __obj = js.Dynamic.literal()
    if (addons != null) __obj.updateDynamic("addons")(addons)
    if (allowed_clients != null) __obj.updateDynamic("allowed_clients")(allowed_clients)
    if (allowed_logout_urls != null) __obj.updateDynamic("allowed_logout_urls")(allowed_logout_urls)
    if (allowed_origins != null) __obj.updateDynamic("allowed_origins")(allowed_origins)
    if (app_type != null) __obj.updateDynamic("app_type")(app_type)
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (client_aliases != null) __obj.updateDynamic("client_aliases")(client_aliases)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_metadata != null) __obj.updateDynamic("client_metadata")(client_metadata)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (!js.isUndefined(cross_origin_auth)) __obj.updateDynamic("cross_origin_auth")(cross_origin_auth)
    if (cross_origin_loc != null) __obj.updateDynamic("cross_origin_loc")(cross_origin_loc)
    if (custom_login_page != null) __obj.updateDynamic("custom_login_page")(custom_login_page)
    if (!js.isUndefined(custom_login_page_on)) __obj.updateDynamic("custom_login_page_on")(custom_login_page_on)
    if (custom_login_page_preview != null) __obj.updateDynamic("custom_login_page_preview")(custom_login_page_preview)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encryption_key != null) __obj.updateDynamic("encryption_key")(encryption_key)
    if (form_template != null) __obj.updateDynamic("form_template")(form_template)
    if (grant_types != null) __obj.updateDynamic("grant_types")(grant_types)
    if (!js.isUndefined(is_first_party)) __obj.updateDynamic("is_first_party")(is_first_party)
    if (jwt_configuration != null) __obj.updateDynamic("jwt_configuration")(jwt_configuration)
    if (logo_uri != null) __obj.updateDynamic("logo_uri")(logo_uri)
    if (mobile != null) __obj.updateDynamic("mobile")(mobile)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(oidc_conformant)) __obj.updateDynamic("oidc_conformant")(oidc_conformant)
    if (signing_keys != null) __obj.updateDynamic("signing_keys")(signing_keys)
    if (!js.isUndefined(sso)) __obj.updateDynamic("sso")(sso)
    if (!js.isUndefined(sso_disabled)) __obj.updateDynamic("sso_disabled")(sso_disabled)
    if (token_endpoint_auth_method != null) __obj.updateDynamic("token_endpoint_auth_method")(token_endpoint_auth_method)
    if (web_origins != null) __obj.updateDynamic("web_origins")(web_origins)
    __obj.asInstanceOf[Client]
  }
}

