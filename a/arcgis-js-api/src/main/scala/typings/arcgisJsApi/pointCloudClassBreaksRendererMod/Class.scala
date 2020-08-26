package typings.arcgisJsApi.pointCloudClassBreaksRendererMod

import typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/PointCloudClassBreaksRenderer", JSImport.Namespace)
@js.native
/**
  * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute. Colors are assigned based on classes or ranges of data. Each point is assigned a symbol based on the class break in which the value of the attribute falls.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
  */
class Class () extends PointCloudClassBreaksRenderer {
  def this(properties: PointCloudClassBreaksRendererProperties) = this()
}

