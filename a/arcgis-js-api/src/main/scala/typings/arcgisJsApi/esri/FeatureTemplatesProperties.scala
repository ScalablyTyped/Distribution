package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplatesProperties extends WidgetProperties {
  /**
    * When `true`, displays the template [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction).  ![featureTemplatesFilter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilter.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled)
    *
    * @default true
    */
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction)
    */
  var filterFunction: js.UndefOr[FilterFunction] = js.undefined
  /**
    * Text used to filter items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterText)
    */
  var filterText: js.UndefOr[String] = js.undefined
  /**
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html). This can aid in managing various template items and how they display within the widget. The values are discussed below.
    *
    * Type | Description | Example
    * ----- | ----------- | -------
    * layer | This is the *default* grouping. Groups template items by layers. | ![featureTemplatesGroupByLayer](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByLayers.png)
    * geometry | Groups template items by geometry type. | ![FeatureTemplatesGroupByGeometry](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByGeometry.png)
    * none | The widget displays everything in one list with no grouping. | ![featureTemplatesGroupByLayer](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupByNone.png)
    * [GroupByFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#GroupByFunction) | Custom function that takes an object containing a [FeatureTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) and [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). | ![FeatureTemplatesGroupByCustomGroupFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/groupCustomGroup.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy)
    *
    * @default layer
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) to display within the widget. The order in which these layers are set in the array dictates how they display within the widget.
    * > The widget is designed to only display layers that are enabled for editing. It will not display layers that are enabled to only edit attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.undefined
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTemplatesVisibleElements] = js.undefined
}

object FeatureTemplatesProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    filterEnabled: js.UndefOr[Boolean] = js.undefined,
    filterFunction: /* filterName */ js.Any => Boolean = null,
    filterText: String = null,
    groupBy: String | GroupByFunction = null,
    id: String = null,
    label: String = null,
    layers: js.Array[FeatureLayerProperties] = null,
    viewModel: FeatureTemplatesViewModelProperties = null,
    visibleElements: FeatureTemplatesVisibleElements = null
  ): FeatureTemplatesProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filterEnabled)) __obj.updateDynamic("filterEnabled")(filterEnabled.get.asInstanceOf[js.Any])
    if (filterFunction != null) __obj.updateDynamic("filterFunction")(js.Any.fromFunction1(filterFunction))
    if (filterText != null) __obj.updateDynamic("filterText")(filterText.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesProperties]
  }
}

