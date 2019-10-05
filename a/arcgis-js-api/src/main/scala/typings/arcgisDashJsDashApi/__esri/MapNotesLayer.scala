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
trait MapNotesLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer {
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: MapNotesLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: MapNotesLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: MapNotesLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.MapNotesLayer")
@js.native
object MapNotesLayer extends TopLevel[MapNotesLayerConstructor]

