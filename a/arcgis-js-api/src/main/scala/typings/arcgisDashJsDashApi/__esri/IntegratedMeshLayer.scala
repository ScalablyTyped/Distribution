package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
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
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: IntegratedMeshLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: IntegratedMeshLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: IntegratedMeshLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.IntegratedMeshLayer")
@js.native
object IntegratedMeshLayer extends TopLevel[IntegratedMeshLayerConstructor]

