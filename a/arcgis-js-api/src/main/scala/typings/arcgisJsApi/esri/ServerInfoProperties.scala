package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfoProperties extends js.Object {
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[Double] = js.undefined
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[String] = js.undefined
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[Double] = js.undefined
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[String] = js.undefined
}

object ServerInfoProperties {
  @scala.inline
  def apply(
    adminTokenServiceUrl: String = null,
    currentVersion: Int | Double = null,
    server: String = null,
    shortLivedTokenValidity: Int | Double = null,
    tokenServiceUrl: String = null
  ): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (adminTokenServiceUrl != null) __obj.updateDynamic("adminTokenServiceUrl")(adminTokenServiceUrl.asInstanceOf[js.Any])
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (shortLivedTokenValidity != null) __obj.updateDynamic("shortLivedTokenValidity")(shortLivedTokenValidity.asInstanceOf[js.Any])
    if (tokenServiceUrl != null) __obj.updateDynamic("tokenServiceUrl")(tokenServiceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfoProperties]
  }
}

