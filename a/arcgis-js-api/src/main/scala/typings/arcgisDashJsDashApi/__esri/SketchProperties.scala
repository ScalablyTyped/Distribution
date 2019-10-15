package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.horizontal
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.vertical
import typings.std.HTMLElement
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
  var availableCreateTools: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default update options set for the Sketch widget. Update options set on this property will be overwritten if the update options are changed when [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchDefaultUpdateOptions] = js.undefined
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget. The Sketch widget adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    *
    * @default horizontal
    */
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
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
    availableCreateTools: js.Array[String] = null,
    container: String | HTMLElement = null,
    defaultUpdateOptions: SketchDefaultUpdateOptions = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    layer: GraphicsLayerProperties = null,
    layout: vertical | horizontal = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: SketchViewModelProperties = null
  ): SketchProperties = {
    val __obj = js.Dynamic.literal()
    if (availableCreateTools != null) __obj.updateDynamic("availableCreateTools")(availableCreateTools)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultUpdateOptions != null) __obj.updateDynamic("defaultUpdateOptions")(defaultUpdateOptions)
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[SketchProperties]
  }
}

