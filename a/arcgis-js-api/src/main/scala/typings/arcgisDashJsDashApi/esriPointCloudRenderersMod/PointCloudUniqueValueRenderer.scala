package typings.arcgisDashJsDashApi.esriPointCloudRenderersMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PointCloudUniqueValueRenderer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.PointCloudUniqueValueRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/pointCloudRenderers", "PointCloudUniqueValueRenderer")
@js.native
/**
  * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value. This is done by assigning unique colors to represent points with equal attribute values. This renderer is used to visualize points of the same type, not interpolate colors along a continuous ramp mapped to numbers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
  */
class PointCloudUniqueValueRendererCls () extends PointCloudUniqueValueRenderer {
  def this(properties: PointCloudUniqueValueRendererProperties) = this()
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

