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
trait UnknownLayer extends Layer {
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: UnknownLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: UnknownLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: UnknownLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.UnknownLayer")
@js.native
object UnknownLayer extends TopLevel[UnknownLayerConstructor]

