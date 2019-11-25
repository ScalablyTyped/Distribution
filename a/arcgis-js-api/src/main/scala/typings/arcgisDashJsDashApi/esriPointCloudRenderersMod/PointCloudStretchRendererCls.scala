package typings.arcgisDashJsDashApi.esriPointCloudRenderersMod

import typings.arcgisDashJsDashApi.__esri.PointCloudStretchRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/pointCloudRenderers", "PointCloudStretchRenderer")
@js.native
/**
  * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute. It allows you to easily map continuous color ramps to minimum and maximum data values of one of the layer's numeric attribute fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
  */
class PointCloudStretchRendererCls ()
  extends typings.arcgisDashJsDashApi.__esri.PointCloudStretchRenderer {
  def this(properties: PointCloudStretchRendererProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

