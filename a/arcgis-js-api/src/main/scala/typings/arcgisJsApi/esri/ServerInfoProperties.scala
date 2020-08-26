package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfoProperties extends js.Object {
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[String] = js.native
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasPortal)
    */
  var hasPortal: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is an [ArcGIS Server](https://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasServer)
    */
  var hasServer: js.UndefOr[Boolean] = js.native
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[String] = js.native
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[Double] = js.native
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[String] = js.native
}

object ServerInfoProperties {
  @scala.inline
  def apply(): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerInfoProperties]
  }
  @scala.inline
  implicit class ServerInfoPropertiesOps[Self <: ServerInfoProperties] (val x: Self) extends AnyVal {
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
    def setAdminTokenServiceUrl(value: String): Self = this.set("adminTokenServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminTokenServiceUrl: Self = this.set("adminTokenServiceUrl", js.undefined)
    @scala.inline
    def setCurrentVersion(value: Double): Self = this.set("currentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersion: Self = this.set("currentVersion", js.undefined)
    @scala.inline
    def setHasPortal(value: Boolean): Self = this.set("hasPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPortal: Self = this.set("hasPortal", js.undefined)
    @scala.inline
    def setHasServer(value: Boolean): Self = this.set("hasServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasServer: Self = this.set("hasServer", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setShortLivedTokenValidity(value: Double): Self = this.set("shortLivedTokenValidity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortLivedTokenValidity: Self = this.set("shortLivedTokenValidity", js.undefined)
    @scala.inline
    def setTokenServiceUrl(value: String): Self = this.set("tokenServiceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenServiceUrl: Self = this.set("tokenServiceUrl", js.undefined)
  }
  
}

