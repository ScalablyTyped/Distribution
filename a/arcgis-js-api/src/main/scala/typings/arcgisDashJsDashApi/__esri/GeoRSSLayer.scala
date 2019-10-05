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
trait GeoRSSLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: SimpleLineSymbol = js.native
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: PictureMarkerSymbol = js.native
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol = js.native
  /**
    * The URL pointing to a GeoRSS file. This must be publicly available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: String = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: GeoRSSLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: GeoRSSLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: GeoRSSLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.GeoRSSLayer")
@js.native
object GeoRSSLayer extends TopLevel[GeoRSSLayerConstructor]

