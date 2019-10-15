package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureProperties extends WidgetProperties {
  /**
    * Enables automatic creation of a popup template for layers that have popups enabled but no popupTemplate defined. Automatic popup templates are supported for layers that support the `createPopupTemplate` method. (Supported for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) and [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#defaultPopupTemplateEnabled)
    *
    * @default false
    */
  var defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#graphic)
    *
    * @default null
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * A reference to the [view's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). Use this property when needing to get access to the underlying layers within the map. This can then be used within [Arcade](https://developers.arcgis.com/arcade) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#map)
    *
    * @default null
    */
  var map: js.UndefOr[MapProperties] = js.undefined
  /**
    * The spatial reference used for [Arcade](https://developers.arcgis.com/arcade) operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureViewModelProperties] = js.undefined
  /**
    * The visible elements that are displayed within the widget's [graphic.popupTemplate.content](esri-PopupTemplate.html#content). This property provides the ability to turn individual elements of the widget's display on/off. See the [PopupTemplate.content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) documentation for additional information on how these elements work.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureVisibleElements] = js.undefined
}

object FeatureProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    defaultPopupTemplateEnabled: js.UndefOr[Boolean] = js.undefined,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    graphic: GraphicProperties = null,
    id: String = null,
    label: String = null,
    map: MapProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: FeatureViewModelProperties = null,
    visibleElements: FeatureVisibleElements = null
  ): FeatureProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupTemplateEnabled)) __obj.updateDynamic("defaultPopupTemplateEnabled")(defaultPopupTemplateEnabled)
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (graphic != null) __obj.updateDynamic("graphic")(graphic)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (map != null) __obj.updateDynamic("map")(map)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements)
    __obj.asInstanceOf[FeatureProperties]
  }
}

