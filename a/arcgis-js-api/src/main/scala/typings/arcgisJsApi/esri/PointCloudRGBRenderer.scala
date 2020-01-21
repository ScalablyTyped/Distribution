package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-rgb`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudRGBRenderer
  extends PointCloudRenderer
     with typings.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * The name of the field containing RGB values used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#field)
    */
  var field: String = js.native
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudRGBRenderer: `point-cloud-rgb` = js.native
}

@JSGlobal("__esri.PointCloudRGBRenderer")
@js.native
object PointCloudRGBRenderer extends TopLevel[PointCloudRGBRendererConstructor]

