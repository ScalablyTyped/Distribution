package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typings.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`geo-rss`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`imagery-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typings.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typings.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.csv
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.geojson
import typings.arcgisJsApi.arcgisJsApiStrings.graphics
import typings.arcgisJsApi.arcgisJsApiStrings.group
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.imagery
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.kml
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.route
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.scene
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.stream
import typings.arcgisJsApi.arcgisJsApiStrings.tile
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.arcgisJsApi.arcgisJsApiStrings.unsupported
import typings.arcgisJsApi.arcgisJsApiStrings.wms
import typings.arcgisJsApi.arcgisJsApiStrings.wmts
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer
  extends Accessor
     with Loadable
     with Evented
     with IntersectItem
     with _HitTestItem {
  /**
    * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer. Unlike the method of using [transparency](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity) which can result in a washed-out top layer, blend modes can create a variety of very vibrant and intriguing results by blending a layer with the layer(s) below it.  When blending layers, a `top layer` is a layer that has a blend mode applied. All layers underneath the top layer are `background layers`. The default blending mode is `normal` where the top layer is simply displayed over the background layer. While this default behavior is perfectly acceptable, the use of blend modes on layers open up a world of endless possibilities to generate creative maps.  The layers in a [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html) are blended together in isolation from the rest of the map.  In the following screenshots, the [vintage shaded relief](https://www.arcgis.com/home/item.html?id=a8588e0401e246469260f03ee44d69f1) layer is displayed over a [firefly world imagery](http://www.arcgis.com/home/item.html?id=a66bfb7dd3b14228bf7ba42b138fe2ea) layer. The `color` blend mode is applied to the vintage shaded relief and the result looks a new layer.  <img src="../../assets/img/apiref/layers/blendMode/color-blend.png" alt="color-blend" style="width:800px;"/>
    * > **Known Limitations**
    *   * The blendMode is not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * The blendMode is not supported in [printing](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html) and in [legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    *
    * The following factors will affect the blend result:
    *   * Order of all layers
    *   * Layer opacity
    *   * Opacity of features in layers
    *   * Visibility of layers
    *   * By default, the very bottom layer in a map is drawn on a transparent background. You can change the [MapView's background](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#background) color.
    *
    *
    * >>> esri-read-more
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * normal | The top layer is displayed over the background layer. The data of the top layer block the data of background layer where they overlap.
    * average | Takes the mathematical average of top and background layers. Result of `average` blend mode is often similar to the effect of setting the layer's opacity to 50%.
    *
    * **Lighten blend modes:**
    *
    * The following blend modes create lighter results than all layers. In lighten blend modes, pure black colors in the top layer become transparent allowing the background layer to show through.
    * White in the top layer will stay unchanged. Any color that is lighter than pure black is going lighten colors in the top layer to varying degrees all way to pure white.
    *
    * Lighten blend modes can be useful when lightening dark colors of the top layer or removing black colors from the result.
    * The `add`, `lighten` and `screen` modes can be used to brighten layers that have faded or dark colors on a dark background.
    *
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * lighten | Compares top and background layers and retains the lighter color in the top layer. Colors in the top layer become transparent if they are darker than the overlapping colors in the background layer allowing the background layer to show through completely. Can be thought of as the opposite of `darken` blend mode.
    * lighter | Colors in top and background layers are multiplied by their alphas (layer [opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity) and layer's [data opacity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html). Then the resulting colors are added together. All overlapping midrange colors are lightened in the top layer. The opacity of layer and layer's data will affect the blend result.
    * plus | Colors in top and background layers are added together. All overlapping midrange colors are lightened in the top layer. This mode is also known as `add` or `linear-dodge`.
    * screen | Inverts colors of the background layer and multiplies with colors of the top layer. The resulting colors will be lighter than the original color with less contrast. Screen can produce many different levels of brightening depending on the luminosity values of the top layer. Can be thought of as the opposite of the `multiply` mode.
    * color-dodge | Creates a brighter effect by decreasing the contrast between the top and background layers, resulting in saturated mid-tones and bright highlights.
    *
    * **Darken blend modes:**
    *
    * The following blend modes create darker results than all layers. In darken blend modes, pure white in the top layer will become transparent allowing the background layer to show through.
    * Black in the top layer will stay unchanged. Any color that is darker than pure white is going to darken a top layer to varying degrees all the way to pure black.
    *
    * The `multiply` blend mode is often used to highlight shadows, show contrast, or accentuate an aspect of a map. For example, you can use `multiply` blend mode on a topographic map
    * displayed over hillshade when you want to have your elevation show through the topographic layer. See the [intro to layer blending](https://developers.arcgis.com/javascript/latest/sample-code/intro-blendmode-layer/index.html) sample.
    *
    * The `multiply` and `darken` modes can be used to have dark labels of the basemap to show through top layers. See the [darken blending sample](https://developers.arcgis.com/javascript/latest/sample-code/blendmode-darkening/index.html).
    *
    * The `color-burn` mode works well with colorful top and background layers since increases saturation in mid-tones. It increases the contrast by tinting pixels in overlapping areas in
    * top and bottom layers more towards the top layer color. Use this blend mode, when you want an effect with more contrast than `multiply` or `darken`.
    *
    * The following screenshots show how the `multiply` blend mode used for creating a physical map of the world that shows both boundaries and elevation.
    * <img src="../../assets/img/apiref/layers/blendMode/multiply-blend.png" alt="multiply-blend" style="width:800px;"/>
    *
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * darken | Emphasizes the darkest parts of overlapping layers. Colors in the top layer become transparent if they are lighter than the overlapping colors in the background layer, allowing the background layer to show through completely.
    * multiply | Emphasizes the darkest parts of overlapping layers by multiplying colors of the top layer and the background layer. Midrange colors from top and background layers are mixed together more evenly.
    * color-burn | Intensifies the dark areas in all layers. It increases the contrast between top and background layers, by tinting colors in overlapping area towards the top color. To do this it inverts colors of the background layer, divides the result by colors of the top layer, then inverts the results.
    *
    * **Contrast blend modes:**
    *
    * The following blend modes create contrast by both lightening the lighter areas and darkening the darker areas in the top layer by using lightening or darkening blend modes to create the blend.
    * The contrast blend modes will lighten the colors lighter than 50% gray ([128,128,128]), and darken the colors darker than 50% gray. 50% gray will be transparent in the top layer.
    * Each mode can create a variety of results depending on the colors of top and background layers being blended together.
    * The `overlay` blend mode makes its calculations based on the brightness of the colors in the background layer while all of the other contrast blend modes make their calculations based on the brightness of the top layer.
    * Some of these modes are designed to simulate the effect of shining a light through the top layer, effectively projecting upon the layers beneath it.
    *
    * Contrast blend modes can be used to increase the contrast and saturation to have more vibrant colors and give a punch to your layers.
    * For example, you can duplicate a layer and set `overlay` blend mode on the top layer to increase the contrast and tones of your layer.
    * You can also add a polygon layer with a white fill symbol over a dark imagery layer and apply `soft-light` blend mode to increase the brightness in the imagery layer.
    *
    * The following screenshots show an effect of the `overlay` blend mode on a GraphicsLayer. The left image shows when the buffer graphics layer has the `normal` blend mode.
    * As you can see, the gray color for the buffer polygon is blocking the intersecting census tracts. The right image shows when the `overlay` blend mode is applied to the buffer graphics layer.
    * The `overlay` blend mode darkens or lightens the gray buffer polygon depending on the colors of the background layer while the census tracts layer is shining through.
    * See [this in action](https://developers.arcgis.com/javascript/latest/sample-code/featurelayerview-query-geometry/index.html).
    *
    *
    * Normal blend mode | Overlay blend mode |
    * ----------------- | ------------------ |
    * <img src="../../assets/img/apiref/layers/blendMode/noblendMode.gif" alt="no-blendmode" style="width:400px;"/>|<img src="../../assets/img/apiref/layers/blendMode/overlay-blendMode.gif" alt="overlay-blend" style="width:400px;"/>
    *
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * overlay | Uses a combination of `multiply` and `screen` modes to darken and lighten colors in the top layer with the background layer always shining through. The result is darker color values in the background layer intensify the top layer, while lighter colors in the background layer wash out overlapping areas in the top layer.
    * soft-light | Applies a half strength `screen` mode to lighter areas and and half strength `multiply` mode to darken areas of the top layer. You can think of the `soft-light` as a softer version of the `overlay` mode.
    * hard-light | Multiplies or screens the colors, depending on colors of the top layer. The effect is similar to shining a harsh spotlight on the top layer.
    * vivid-light | Uses a combination of `color-burn` or `color-dodge` by increasing or decreasing the contrast, depending on colors in the top layer.
    *
    * **Component blend modes:**
    *
    * The following blend modes use primary color components, which are hue, saturation and luminosity to blend top and background layers.
    * You can add a feature layer with a simple renderer over any layer and set `hue`, `saturation`, `color` or `luminosity` blend mode on this layer. With this technique, you create a brand new looking map.
    *
    * The following screenshots show where the [topo layer](https://services.arcgisonline.com/ArcGIS/rest/services/World_Topo_Map/MapServer) is blended with
    * [world hillshade layer](https://services.arcgisonline.com/arcgis/rest/services/Elevation/World_Hillshade/MapServer) with `luminosity` blend mode.
    * The result is a drastically different looking map which preserves the brightness of the topo layer while adapting the hue and saturation of the hillshade layer.
    *
    * <img src="../../assets/img/apiref/layers/blendMode/lumonisity-blend.png" alt="color-blend" style="width:800px;"/>
    *
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * hue | Creates an effect with the hue of the top layer and the luminosity and saturation of the background layer.
    * saturation | Creates an effect with the saturation of the top layer and the hue and luminosity of the background layer. 50% gray with no saturation in the background layer will not produce any change.
    * luminosity | Creates effect with the luminosity of the top layer and the hue and saturation of the background layer. Can be thought of as the opposite of `color` blend mode.
    * color | Creates an effect with the hue and saturation of the top layer and the luminosity of the background layer. Can be thought of as the opposite of `luminosity` blend mode.
    *
    * **Composite blend modes:**
    *
    * The following blend modes can be used to mask the contents of top, background or both layers.
    *
    *   * `Destination` modes are used to mask the data of the top layer with the data of the background layer.
    *   * `Source` modes are used to mask the data of the background layer with the data of the top layer.
    *
    *
    *
    *
    *
    *
    *
    *
    * The `destination-in` blend mode can be used to show areas of focus such as earthquakes, animal migration, or point-source pollution by revealing the underlying map, providing a bird’s eye view of the phenomenon. Check out [multiple blending](https://developers.arcgis.com/javascript/latest/sample-code/blendmode-multiple-layers/index.html) and [groupLayer blending](https://developers.arcgis.com/javascript/latest/sample-code/blendmode-grouplayer/index.html) samples to see composite blend modes in action. The following screenshots show feature and imagery layers on the left side on their own in the order they are drawn in the view. The imagery layer that contains land cover classification rasters. The feature layer contains 2007 county crops data. The right image shows the result of layer blending where `destination-in` blendMode is set on the imagery layer. As you can see, the effect is very different from the original layers. The blended result shows areas of cultivated crops only (where both imagery and feature layers overlap). <img src="../../assets/img/apiref/layers/blendMode/destination-in-blend-grouplayer.png" alt="destination-in" style="width:800px;"/>
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * destination-over | Destination/background layer covers the top layer. The top layer is drawn underneath the destination layer. You'll see the top layer peek through wherever the background layer is transparent or has no data.
    * destination-atop | Destination/background layer is drawn only where it overlaps the top layer. The top layer is drawn underneath the background layer. You'll see the top layer peek through wherever the background layer is transparent or has no data.
    * destination-in |  Destination/background layer is drawn only where it overlaps with the top layer. Everything else is made transparent.
    * destination-out | Destination/background layer is drawn where it doesn't overlap the top layer.  Everything else is made transparent.
    * source-atop | Source/top layer is drawn only where it overlaps the background layer. You will see the background layer peek through where the source layer is transparent or has no data.
    * source-in | Source/top layer is drawn only where it overlaps with the background layer. Everything else is made transparent.
    * source-out | Source/top layer is drawn where it doesn't overlap the background layer. Everything else is made transparent.
    * xor | Top and background layers are made transparent where they overlap. Both layers are drawn normal everywhere else.
    *
    * **Invert blend modes:**
    *
    * The following blend modes either invert or cancel out colors depending on colors of the background layer.
    * These blend modes look for variations between top and background layers.
    * For example, you can use `difference` or `exclusion` blend modes on two imagery layers of forest covers to visualize how forest covers changed from one year to another.
    *
    * The `invert` blend mode can be used to turn any light basemap into a dark basemap to accommodate those who work in low-light conditions. The following screenshots show
    * how setting the `invert` blend mode set on a feature layer with a simple renderer turns the [world terrain basemap](https://www.arcgis.com/home/item.html?id=53a353b739994e4c95d333911d07d8ef)
    * into a dark themed basemap in no time.
    *
    * <img src="../../assets/img/apiref/layers/blendMode/invert-blendmode.png" alt="color-blend" style="width:800px;"/>
    *
    *
    * Blend mode | Description |
    * ---------- | ----------- |
    * difference | Subtracts the darker of the overlapping colors from the lighter color. When two pixels with the same value are subtracted, the result is black. Blending with black produces no change. Blending with white inverts the colors. This blending mode is useful for aligning layers with similar content.
    * exclusion | Similar to the `difference` blend mode, except that the resulting image is lighter overall. Overlapping areas with lighter color values are lightened, while darker overlapping color values become transparent.
    * minus | Subtracts colors of the top layer from colors of the background layer making the blend result darker. In the case of negative values, black is displayed.
    * invert | Inverts the background colors wherever the top and background layers overlap. The invert blend mode inverts the layer similar to a photographic negative.
    * reflect | This blend mode creates effects as if you added shiny objects or areas of light in the layer. Black pixels in the background layer are ignored as if they were transparent.
    *
    * >>>
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#blendMode)
    *
    * @default normal
    */
  var blendMode: average | `color-burn` | `color-dodge` | typings.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
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
  val `type`: `base-dynamic` | `base-elevation` | `base-tile` | `bing-maps` | `building-scene` | csv | elevation | feature | geojson | `geo-rss` | graphics | group | imagery | `imagery-tile` | `integrated-mesh` | kml | `map-image` | `map-notes` | `ogc-feature` | `open-street-map` | `point-cloud` | route | scene | stream | tile | unknown | unsupported | `vector-tile` | `web-tile` | wms | wmts = js.native
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

