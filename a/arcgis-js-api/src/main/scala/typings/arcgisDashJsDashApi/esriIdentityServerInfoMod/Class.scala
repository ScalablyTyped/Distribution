package typings.arcgisDashJsDashApi.esriIdentityServerInfoMod

import typings.arcgisDashJsDashApi.__esri.ServerInfo
import typings.arcgisDashJsDashApi.__esri.ServerInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/identity/ServerInfo", JSImport.Namespace)
@js.native
class Class () extends ServerInfo {
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

