package typings.auth0.mod

import typings.auth0.anon.Alg
import typings.auth0.anon.Cert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
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
    * Url fo the location in your site where the cross origin verification takes place for the cross-origin auth flow when performing Auth in your own domain instead of Auth0 hosted login page.
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
  def apply(
    addons: js.Any = null,
    allowed_clients: js.Array[String] = null,
    allowed_logout_urls: js.Array[String] = null,
    allowed_origins: js.Array[String] = null,
    app_type: String = null,
    callbacks: js.Array[String] = null,
    client_aliases: js.Array[String] = null,
    client_id: String = null,
    client_metadata: js.Any = null,
    client_secret: String = null,
    cross_origin_auth: js.UndefOr[Boolean] = js.undefined,
    cross_origin_loc: String = null,
    custom_login_page: String = null,
    custom_login_page_on: js.UndefOr[Boolean] = js.undefined,
    custom_login_page_preview: String = null,
    description: String = null,
    encryption_key: Cert = null,
    form_template: String = null,
    grant_types: js.Array[Grant] = null,
    is_first_party: js.UndefOr[Boolean] = js.undefined,
    jwt_configuration: Alg = null,
    logo_uri: String = null,
    mobile: js.Any = null,
    name: String = null,
    oidc_conformant: js.UndefOr[Boolean] = js.undefined,
    signing_keys: js.Array[String] = null,
    sso: js.UndefOr[Boolean] = js.undefined,
    sso_disabled: js.UndefOr[Boolean] = js.undefined,
    token_endpoint_auth_method: String = null,
    web_origins: js.Array[String] = null
  ): Client = {
    val __obj = js.Dynamic.literal()
    if (addons != null) __obj.updateDynamic("addons")(addons.asInstanceOf[js.Any])
    if (allowed_clients != null) __obj.updateDynamic("allowed_clients")(allowed_clients.asInstanceOf[js.Any])
    if (allowed_logout_urls != null) __obj.updateDynamic("allowed_logout_urls")(allowed_logout_urls.asInstanceOf[js.Any])
    if (allowed_origins != null) __obj.updateDynamic("allowed_origins")(allowed_origins.asInstanceOf[js.Any])
    if (app_type != null) __obj.updateDynamic("app_type")(app_type.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (client_aliases != null) __obj.updateDynamic("client_aliases")(client_aliases.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_metadata != null) __obj.updateDynamic("client_metadata")(client_metadata.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_origin_auth)) __obj.updateDynamic("cross_origin_auth")(cross_origin_auth.get.asInstanceOf[js.Any])
    if (cross_origin_loc != null) __obj.updateDynamic("cross_origin_loc")(cross_origin_loc.asInstanceOf[js.Any])
    if (custom_login_page != null) __obj.updateDynamic("custom_login_page")(custom_login_page.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_login_page_on)) __obj.updateDynamic("custom_login_page_on")(custom_login_page_on.get.asInstanceOf[js.Any])
    if (custom_login_page_preview != null) __obj.updateDynamic("custom_login_page_preview")(custom_login_page_preview.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryption_key != null) __obj.updateDynamic("encryption_key")(encryption_key.asInstanceOf[js.Any])
    if (form_template != null) __obj.updateDynamic("form_template")(form_template.asInstanceOf[js.Any])
    if (grant_types != null) __obj.updateDynamic("grant_types")(grant_types.asInstanceOf[js.Any])
    if (!js.isUndefined(is_first_party)) __obj.updateDynamic("is_first_party")(is_first_party.get.asInstanceOf[js.Any])
    if (jwt_configuration != null) __obj.updateDynamic("jwt_configuration")(jwt_configuration.asInstanceOf[js.Any])
    if (logo_uri != null) __obj.updateDynamic("logo_uri")(logo_uri.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(oidc_conformant)) __obj.updateDynamic("oidc_conformant")(oidc_conformant.get.asInstanceOf[js.Any])
    if (signing_keys != null) __obj.updateDynamic("signing_keys")(signing_keys.asInstanceOf[js.Any])
    if (!js.isUndefined(sso)) __obj.updateDynamic("sso")(sso.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sso_disabled)) __obj.updateDynamic("sso_disabled")(sso_disabled.get.asInstanceOf[js.Any])
    if (token_endpoint_auth_method != null) __obj.updateDynamic("token_endpoint_auth_method")(token_endpoint_auth_method.asInstanceOf[js.Any])
    if (web_origins != null) __obj.updateDynamic("web_origins")(web_origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

