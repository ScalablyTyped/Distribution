package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.graphics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: GraphicsLayerElevationInfo = js.native
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer. Each graphic is a vector representation of the location of a real-world feature. Each graphic in a single GraphicsLayer may contain either a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), or [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry). In addition, each [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the collection may contain its own [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes), [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html), and [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  To add a graphic to the GraphicsLayer use [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add), or [GraphicsLayer.graphics.add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: Boolean = js.native
  /**
    * For [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) the type is `graphics`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#type)
    */
  @JSName("type")
  val type_GraphicsLayer: graphics = js.native
  /**
    * Adds a graphic to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add)
    *
    * @param graphic The graphic to add to the layer.
    *
    */
  def add(graphic: Graphic): Unit = js.native
  /**
    * Adds an array of graphics to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#addMany)
    *
    * @param graphics The graphic(s) to add to the layer.
    *
    */
  def addMany(graphics: js.Array[Graphic]): Unit = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: GraphicsLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: GraphicsLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: GraphicsLayerLayerviewDestroyEventHandler): IHandle = js.native
  /**
    * Removes a graphic from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#remove)
    *
    * @param graphic The graphic to remove from the layer.
    *
    */
  def remove(graphic: Graphic): Unit = js.native
  /**
    * Clears all the graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeAll)
    *
    *
    */
  def removeAll(): Unit = js.native
  /**
    * Removes an array of graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeMany)
    *
    * @param graphics The graphics to remove from the layer.
    *
    */
  def removeMany(graphics: js.Array[Graphic]): Unit = js.native
}

@JSGlobal("__esri.GraphicsLayer")
@js.native
/**
  * A GraphicsLayer contains one or more client-side [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). Each [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) in the GraphicsLayer is rendered in a [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) inside either a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) contain discrete vector [geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that represent real-world phenomena.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html)
  */
class GraphicsLayerCls () extends GraphicsLayer {
  def this(properties: GraphicsLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: Double = js.native
}

