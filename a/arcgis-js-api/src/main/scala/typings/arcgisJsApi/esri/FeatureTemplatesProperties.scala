package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplatesProperties extends WidgetProperties {
  /**
    * When `true`, displays the template [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction).  ![featureTemplatesFilter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilter.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled)
    *
    * @default true
    */
  var filterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction)
    */
  var filterFunction: js.UndefOr[FilterFunction] = js.native
  /**
    * Text used to filter items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterText)
    */
  var filterText: js.UndefOr[String] = js.native
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
  var groupBy: js.UndefOr[String | GroupByFunction] = js.native
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) to display within the widget. The order in which these layers are set in the array dictates how they display within the widget.
    * > The widget is designed to only display layers that are enabled for editing. It will not display layers that are enabled to only edit attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTemplatesVisibleElements] = js.native
}

object FeatureTemplatesProperties {
  @scala.inline
  def apply(): FeatureTemplatesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesProperties]
  }
  @scala.inline
  implicit class FeatureTemplatesPropertiesOps[Self <: FeatureTemplatesProperties] (val x: Self) extends AnyVal {
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
    def setFilterEnabled(value: Boolean): Self = this.set("filterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterEnabled: Self = this.set("filterEnabled", js.undefined)
    @scala.inline
    def setFilterFunction(value: /* filterName */ js.Any => Boolean): Self = this.set("filterFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilterFunction: Self = this.set("filterFunction", js.undefined)
    @scala.inline
    def setFilterText(value: String): Self = this.set("filterText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterText: Self = this.set("filterText", js.undefined)
    @scala.inline
    def setGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = this.set("groupBy", js.Any.fromFunction1(value))
    @scala.inline
    def setGroupBy(value: String | GroupByFunction): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setLayersVarargs(value: FeatureLayerProperties*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[FeatureLayerProperties]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setViewModel(value: FeatureTemplatesViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisibleElements(value: FeatureTemplatesVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}

