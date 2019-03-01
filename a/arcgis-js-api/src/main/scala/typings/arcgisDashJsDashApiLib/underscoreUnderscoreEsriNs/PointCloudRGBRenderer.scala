package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudRGBRenderer
  extends PointCloudRenderer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.pointCloudRenderersNs.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * The name of the field containing RGB values used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * The type of Renderer. For PointCloudRGBRenderer this value is always `point-cloud-rgb`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudRGBRenderer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`point-cloud-rgb` = js.native
}

