package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLayer
  extends Layer
     with LayersMixin
     with PortalLayer {
  /**
    * Indicates how to manage the visibility of the children layers. Possible values are described in the table below.
    *
    * Value | Description
    * ------|------------
    * independent | Each child layer manages its visibility independent from other layers.
    * inherited | Each child layer's visibility matches the [GroupLayer’s visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visible).
    * exclusive | Only one child layer is visible at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: String = js.native
  /**
    * Loads all the externally loadable resources associated with the group layer. For the group layer this will load all the layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#loadAll)
    *
    *
    */
  def loadAll(): IPromise[GroupLayer] = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: GroupLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: GroupLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: GroupLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.GroupLayer")
@js.native
object GroupLayer extends TopLevel[GroupLayerConstructor]

