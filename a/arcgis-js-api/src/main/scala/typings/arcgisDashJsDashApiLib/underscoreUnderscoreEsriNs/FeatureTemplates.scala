package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplates extends Widget {
  /**
    * When `true`, displays the template [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction).  ![featureTemplatesFilter](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilter.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled)
    *
    * @default true
    */
  var filterEnabled: scala.Boolean = js.native
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction)
    */
  @JSName("filterFunction")
  var filterFunction_Original: FilterFunction = js.native
  /**
    * Text used to filter items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterText)
    */
  var filterText: java.lang.String = js.native
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
  var groupBy: java.lang.String | GroupByFunction = js.native
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) to display within the widget. The order in which these layers are set in the array dictates how they display within the widget.
    * > The widget is designed to only display layers that are enabled for editing. It will not display layers that are enabled to only edit attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#layers)
    */
  var layers: js.Array[FeatureLayer] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#viewModel)
    */
  var viewModel: FeatureTemplatesViewModel = js.native
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction)
    */
  def filterFunction(filterName: js.Any): scala.Boolean = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.FeatureTemplates")
@js.native
/**
  * The FeatureTemplates widget is part of the overall editing workflow. Its main purpose is to display [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#templates) from one or more [feature layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). In addition to displaying feature layer templates, it is also possible to [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction) and [group](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy) templates for an easier editing experience. The widget listens for an end user to select a specific template in the widget. Its [select](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#event:select) event is fired and the resulting template information is returned. This widget can be used in conjunction with [FeatureLayer.applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits) to enable an end user to update one of its feature layers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html)
  */
class FeatureTemplatesCls () extends FeatureTemplates {
  def this(properties: FeatureTemplatesProperties) = this()
}

