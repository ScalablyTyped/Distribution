package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-cloud-class-breaks`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudClassBreaksRenderer
  extends PointCloudRenderer
     with typings.arcgisDashJsDashApi.__esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos] = js.native
  /**
    * The name of the field that is used to drive the color visualization for the renderer. The value of this field determines which class break each point is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: String = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudClassBreaksRendererLegendOptions = js.native
  /**
    * The type of renderer. For PointCloudClassBreaksRenderer this value is always `point-cloud-class-breaks`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudClassBreaksRenderer: `point-cloud-class-breaks` = js.native
}

@JSGlobal("__esri.PointCloudClassBreaksRenderer")
@js.native
object PointCloudClassBreaksRenderer extends TopLevel[PointCloudClassBreaksRendererConstructor]

