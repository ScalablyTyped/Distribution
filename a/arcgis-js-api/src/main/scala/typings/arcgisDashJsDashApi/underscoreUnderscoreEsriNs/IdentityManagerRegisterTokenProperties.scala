package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerRegisterTokenProperties extends Object {
  /**
    * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    *
    * [Read more...](properties.html)
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest. For ArcGIS Server this is similar to https://www.example.com/arcgis/rest/services.
    *
    * [Read more...](properties.html)
    */
  var server: String
  /**
    * Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    *
    * [Read more...](properties.html)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  /**
    * The access token.
    *
    * [Read more...](properties.html)
    */
  var token: String
  /**
    * The id of the user who owns the access token.
    *
    * [Read more...](properties.html)
    */
  var userId: js.UndefOr[String] = js.undefined
}

object IdentityManagerRegisterTokenProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    server: String,
    token: String,
    expires: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    userId: String = null
  ): IdentityManagerRegisterTokenProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), server = server, token = token)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[IdentityManagerRegisterTokenProperties]
  }
}

