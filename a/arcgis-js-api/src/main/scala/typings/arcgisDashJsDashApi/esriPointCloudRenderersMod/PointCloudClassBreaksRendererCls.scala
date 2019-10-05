package typings.arcgisDashJsDashApi.esriPointCloudRenderersMod

import typings.arcgisDashJsDashApi.__esri.PointCloudClassBreaksRenderer
import typings.arcgisDashJsDashApi.__esri.PointCloudClassBreaksRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/pointCloudRenderers", "PointCloudClassBreaksRenderer")
@js.native
/**
  * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute. Colors are assigned based on classes or ranges of data. Each point is assigned a symbol based on the class break in which the value of the attribute falls.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
  */
class PointCloudClassBreaksRendererCls () extends PointCloudClassBreaksRenderer {
  def this(properties: PointCloudClassBreaksRendererProperties) = this()
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

