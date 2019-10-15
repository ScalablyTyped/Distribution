package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`integrated-mesh`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegratedMeshLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * Specifies how the mesh is placed on the vertical axis (z). This property only affects [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) when using the `absolute-height` mode. Integrated mesh layers always render in front of the ground surface, so setting negative offset values will not render them below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: IntegratedMeshLayerElevationInfo = js.native
  @JSName("type")
  val type_IntegratedMeshLayer: `integrated-mesh` = js.native
}

@JSGlobal("__esri.IntegratedMeshLayer")
@js.native
object IntegratedMeshLayer extends TopLevel[IntegratedMeshLayerConstructor]

