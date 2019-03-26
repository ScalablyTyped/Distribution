package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo
  extends Accessor
     with JSONSupport {
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: java.lang.String = js.native
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: scala.Double = js.native
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: java.lang.String = js.native
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: scala.Double = js.native
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: java.lang.String = js.native
}

@JSGlobal("__esri.ServerInfo")
@js.native
class ServerInfoCls () extends ServerInfo {
  def this(properties: ServerInfoProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

