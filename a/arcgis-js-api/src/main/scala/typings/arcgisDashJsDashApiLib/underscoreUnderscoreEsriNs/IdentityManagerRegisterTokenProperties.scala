package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerRegisterTokenProperties
  extends stdLib.Object {
  /**
    * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    *
    * [Read more...](properties.html)
    */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /**
    * For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest. For ArcGIS Server this is similar to https://www.example.com/arcgis/rest/services.
    *
    * [Read more...](properties.html)
    */
  var server: java.lang.String
  /**
    * Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    *
    * [Read more...](properties.html)
    */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The access token.
    *
    * [Read more...](properties.html)
    */
  var token: java.lang.String
  /**
    * The id of the user who owns the access token.
    *
    * [Read more...](properties.html)
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object IdentityManagerRegisterTokenProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    server: java.lang.String,
    token: java.lang.String,
    expires: scala.Int | scala.Double = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    userId: java.lang.String = null
  ): IdentityManagerRegisterTokenProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, server = server, token = token)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[IdentityManagerRegisterTokenProperties]
  }
}

