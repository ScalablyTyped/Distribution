package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-cloud-stretch`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudStretchRenderer
  extends PointCloudRenderer
     with typings.arcgisDashJsDashApi.__esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * The name of the number field whose values are used to drive the continuous color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
    */
  var field: String = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudStretchRendererLegendOptions = js.native
  /**
    * An array of color value pairs. Points with values between the specified stops are colorized with linearly interpolated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var stops: js.Array[PointCloudStretchRendererStops] = js.native
  /**
    * The type of Renderer. For PointCloudStretchRenderer this value is always `point-cloud-stretch`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudStretchRenderer: `point-cloud-stretch` = js.native
}

@JSGlobal("__esri.PointCloudStretchRenderer")
@js.native
object PointCloudStretchRenderer extends TopLevel[PointCloudStretchRendererConstructor]

