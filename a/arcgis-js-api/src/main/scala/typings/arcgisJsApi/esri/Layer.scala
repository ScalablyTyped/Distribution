package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typings.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`geo-rss`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typings.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.csv
import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.geojson
import typings.arcgisJsApi.arcgisJsApiStrings.graphics
import typings.arcgisJsApi.arcgisJsApiStrings.group
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.imagery
import typings.arcgisJsApi.arcgisJsApiStrings.kml
import typings.arcgisJsApi.arcgisJsApiStrings.scene
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.stream
import typings.arcgisJsApi.arcgisJsApiStrings.tile
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.arcgisJsApi.arcgisJsApiStrings.unsupported
import typings.arcgisJsApi.arcgisJsApiStrings.wms
import typings.arcgisJsApi.arcgisJsApiStrings.wmts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer
  extends Accessor
     with Loadable
     with Evented
     with IntersectItem {
  /**
    * The full extent of the layer. By default, this is worldwide. This property may be used to set the extent of the view to match a layer's extent so that its features appear to fill the view. See the sample snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  /**
    * The unique ID assigned to the layer. If not set by the developer, it is automatically generated when the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
    */
  var id: String = js.native
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. The possible values are listed below.
    *
    * Value | Description
    * ------|------------
    *  show | The layer is visible in the table of contents.
    *  hide | The layer is hidden in the table of contents.
    *  hide-children | If the layer is a [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html), [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html), [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html), [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) or [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html), hide the children layers from the table of contents.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
    *
    * @default show
    */
  var listMode: show | hide | `hide-children` = js.native
  /**
    * Indicates whether the layer's resources have loaded. When `true`, all the properties of the object can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#loaded)
    *
    * @default false
    */
  val loaded: Boolean = js.native
  /**
    * The opacity of the layer. This value can range between `1` and `0`, where `0` is 100 percent transparent and `1` is completely opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
    *
    * @default 1
    */
  var opacity: Double = js.native
  /**
    * The title of the layer used to identify it in places such as the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
    */
  var title: String = js.native
  /**
    * The layer type provides a convenient way to check the type of the layer without the need to import specific layer modules.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#type)
    */
  val `type`: `base-dynamic` | `base-elevation` | `base-tile` | `bing-maps` | `building-scene` | csv | elevation | feature | geojson | `geo-rss` | graphics | group | imagery | `integrated-mesh` | kml | `map-image` | `map-notes` | `open-street-map` | `point-cloud` | scene | stream | tile | unknown | unsupported | `vector-tile` | `web-tile` | wms | wmts = js.native
  /**
    * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). When `false`, the layer may still be added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) instance that is referenced in a view, but its features will not be visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
  /**
    * Called by the views, such as [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), when the layer is added to the [Map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) collection and a layer view must be created for it. **This method is used internally and there is no use case for invoking it directly**.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    *
    * @param view The parent view.
    * @param options An object specifying additional options. See the object specification table below for the required properties of this object.
    * @param options.signal A signal to abort the creation of the layerview.
    *
    */
  def createLayerView(view: js.Any): js.Promise[LayerView] = js.native
  def createLayerView(view: js.Any, options: LayerCreateLayerViewOptions): js.Promise[LayerView] = js.native
  /**
    * Fetches custom attribution data for the layer when it becomes available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fetchAttributionData)
    *
    *
    */
  def fetchAttributionData(): js.Promise[_] = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: LayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: LayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: LayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.Layer")
@js.native
object Layer extends TopLevel[LayerConstructor]

