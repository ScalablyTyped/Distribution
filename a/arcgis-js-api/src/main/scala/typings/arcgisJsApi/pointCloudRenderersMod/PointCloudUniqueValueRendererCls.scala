package typings.arcgisJsApi.pointCloudRenderersMod

import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererProperties
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
class PointCloudUniqueValueRendererCls ()
  extends typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer {
  def this(properties: PointCloudUniqueValueRendererProperties) = this()
}

