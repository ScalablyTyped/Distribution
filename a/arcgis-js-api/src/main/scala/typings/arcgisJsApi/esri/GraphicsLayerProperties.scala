package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties {
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[GraphicsLayerElevationInfo] = js.native
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer. Each graphic is a vector representation of the location of a real-world feature. Each graphic in a single GraphicsLayer may contain either a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), or [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry). In addition, each [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the collection may contain its own [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes), [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html), and [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  To add a graphic to the GraphicsLayer use [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add), [GraphicsLayer.graphics.add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add) or [GraphicsLayer.graphics.push()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#push).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.native
}

object GraphicsLayerProperties {
  @scala.inline
  def apply(): GraphicsLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsLayerProperties]
  }
  @scala.inline
  implicit class GraphicsLayerPropertiesOps[Self <: GraphicsLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElevationInfo(value: GraphicsLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setGraphicsVarargs(value: GraphicProperties*): Self = this.set("graphics", js.Array(value :_*))
    @scala.inline
    def setGraphics(value: CollectionProperties[GraphicProperties]): Self = this.set("graphics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphics: Self = this.set("graphics", js.undefined)
    @scala.inline
    def setScreenSizePerspectiveEnabled(value: Boolean): Self = this.set("screenSizePerspectiveEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenSizePerspectiveEnabled: Self = this.set("screenSizePerspectiveEnabled", js.undefined)
  }
  
}

