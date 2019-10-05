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
trait KMLLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * A collection of [KMLSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#sublayers)
    */
  var sublayers: Collection[KMLSublayer] = js.native
  /**
    * The publicly accessible URL for a .kml or .kmz file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html#url)
    */
  var url: String = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: KMLLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: KMLLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: KMLLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.KMLLayer")
@js.native
object KMLLayer extends TopLevel[KMLLayerConstructor]

