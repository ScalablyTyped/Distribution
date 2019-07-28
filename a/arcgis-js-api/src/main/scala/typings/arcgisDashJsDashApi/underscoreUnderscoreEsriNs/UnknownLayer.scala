package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
/**
  * Represents a layer whose type could not be determined. For example, when loading a layer from a URL and the layer type cannot be determined, then it is represented as an instance of this class.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
  */
class UnknownLayerCls () extends UnknownLayer {
  def this(properties: UnknownLayerProperties) = this()
}

