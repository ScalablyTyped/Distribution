package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchProperties extends WidgetProperties {
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    *
    * @default ["point", "polyline", "polygon", "rectangle", "circle"]
    */
  var availableCreateTools: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget. The Sketch widget adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  /**
    * Determines the layout/orientation of the Sketch widget.  **Possible Values:** vertical | horizontal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the Sketch widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for the Sketch widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) class to access all properties and methods on the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: js.UndefOr[SketchViewModelProperties] = js.undefined
}

object SketchProperties {
  @scala.inline
  def apply(
    availableCreateTools: js.Array[java.lang.String] = null,
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    iconClass: java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    layer: GraphicsLayerProperties = null,
    layout: java.lang.String = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: SketchViewModelProperties = null
  ): SketchProperties = {
    val __obj = js.Dynamic.literal()
    if (availableCreateTools != null) __obj.updateDynamic("availableCreateTools")(availableCreateTools)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[SketchProperties]
  }
}

