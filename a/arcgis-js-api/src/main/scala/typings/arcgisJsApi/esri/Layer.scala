package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typings.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`geo-rss`
import typings.arcgisJsApi.arcgisJsApiStrings.`georeferenced-image`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`imagery-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-of-sight`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typings.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import typings.arcgisJsApi.arcgisJsApiStrings.`subtype-group`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.csv
import typings.arcgisJsApi.arcgisJsApiStrings.dimension
import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.geojson
import typings.arcgisJsApi.arcgisJsApiStrings.graphics
import typings.arcgisJsApi.arcgisJsApiStrings.group
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.imagery
import typings.arcgisJsApi.arcgisJsApiStrings.kml
import typings.arcgisJsApi.arcgisJsApiStrings.media
import typings.arcgisJsApi.arcgisJsApiStrings.scene
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.stream
import typings.arcgisJsApi.arcgisJsApiStrings.tile
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.arcgisJsApi.arcgisJsApiStrings.unsupported
import typings.arcgisJsApi.arcgisJsApiStrings.voxel
import typings.arcgisJsApi.arcgisJsApiStrings.wcs
import typings.arcgisJsApi.arcgisJsApiStrings.wfs
import typings.arcgisJsApi.arcgisJsApiStrings.wms
import typings.arcgisJsApi.arcgisJsApiStrings.wmts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer
  extends StObject
     with Accessor
     with Loadable
     with Evented
     with Identifiable
     with IntersectItem
     with _HitTestItem {
  
  /**
    * Called by the views, such as [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), when the layer is added to the [Map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) collection and a layer view must be created for it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  def createLayerView(view: Any): js.Promise[LayerView] = js.native
  def createLayerView(view: Any, options: LayerCreateLayerViewOptions): js.Promise[LayerView] = js.native
  
  /**
    * Fetches custom attribution data for the layer when it becomes available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fetchAttributionData)
    */
  def fetchAttributionData(): js.Promise[Any] = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  
  /**
    * The unique ID assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
    */
  var id: String = js.native
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * @default "show"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
    */
  var listMode: show | hide | `hide-children` = js.native
  
  /**
    * Indicates whether the layer's resources have loaded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#loaded)
    */
  val loaded: Boolean = js.native
  
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: LayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: LayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: LayerLayerviewDestroyEventHandler): IHandle = js.native
  
  /**
    * The opacity of the layer.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
    */
  var opacity: Double = js.native
  
  /**
    * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
    */
  var title: String = js.native
  
  /**
    * The layer type provides a convenient way to check the type of the layer without the need to import specific layer modules.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#type)
    */
  val `type`: `base-dynamic` | `base-elevation` | `base-tile` | `bing-maps` | `building-scene` | csv | dimension | elevation | feature | geojson | `geo-rss` | graphics | group | imagery | `imagery-tile` | `integrated-mesh` | kml | `line-of-sight` | `map-image` | `map-notes` | media | `ogc-feature` | `open-street-map` | `point-cloud` | typings.arcgisJsApi.arcgisJsApiStrings.route | scene | `georeferenced-image` | stream | tile | unknown | unsupported | `vector-tile` | wcs | `web-tile` | wfs | wms | wmts | voxel | `subtype-group` = js.native
  
  /**
    * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
    */
  var visible: Boolean = js.native
}
