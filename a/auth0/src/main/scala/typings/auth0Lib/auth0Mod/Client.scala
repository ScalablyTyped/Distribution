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
  var encryption_key: js.UndefOr[js.Any] = js.undefined
  var form_template: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Whether this client a first party client or not.
     */
  var is_first_party: js.UndefOr[scala.Boolean] = js.undefined
  var jwt_configuration: js.UndefOr[js.Any] = js.undefined
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

