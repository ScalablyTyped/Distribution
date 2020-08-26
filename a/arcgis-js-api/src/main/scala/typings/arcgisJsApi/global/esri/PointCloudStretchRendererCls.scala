package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudStretchRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.PointCloudStretchRenderer")
@js.native
/**
  * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute. It allows you to easily map continuous color ramps to minimum and maximum data values of one of the layer's numeric attribute fields.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
  */
class PointCloudStretchRendererCls ()
  extends typings.arcgisJsApi.esri.PointCloudStretchRenderer {
  def this(properties: PointCloudStretchRendererProperties) = this()
}

