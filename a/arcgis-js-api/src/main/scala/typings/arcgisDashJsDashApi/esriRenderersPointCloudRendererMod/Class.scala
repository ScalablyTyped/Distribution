package typings.arcgisDashJsDashApi.esriRenderersPointCloudRendererMod

import typings.arcgisDashJsDashApi.__esri.PointCloudRenderer
import typings.arcgisDashJsDashApi.__esri.PointCloudRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/PointCloudRenderer", JSImport.Namespace)
@js.native
class Class () extends PointCloudRenderer {
  def this(properties: PointCloudRendererProperties) = this()
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

