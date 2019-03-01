package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfoProperties extends js.Object {
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ServerInfoProperties {
  @scala.inline
  def apply(
    adminTokenServiceUrl: java.lang.String = null,
    currentVersion: scala.Int | scala.Double = null,
    server: java.lang.String = null,
    shortLivedTokenValidity: scala.Int | scala.Double = null,
    tokenServiceUrl: java.lang.String = null
  ): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (adminTokenServiceUrl != null) __obj.updateDynamic("adminTokenServiceUrl")(adminTokenServiceUrl)
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server)
    if (shortLivedTokenValidity != null) __obj.updateDynamic("shortLivedTokenValidity")(shortLivedTokenValidity.asInstanceOf[js.Any])
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl)
    __obj.asInstanceOf[ServerInfoProperties]
  }
}

