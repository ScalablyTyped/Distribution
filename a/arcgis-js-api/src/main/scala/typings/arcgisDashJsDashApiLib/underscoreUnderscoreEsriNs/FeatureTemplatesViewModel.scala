package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplatesViewModel extends Accessor {
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  @JSName("filterFunction")
  var filterFunction_Original: FilterFunction = js.native
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
    *
    * @default layer
    */
  var groupBy: java.lang.String | GroupByFunction = js.native
  /**
    * The template items or grouped template items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#items)
    */
  val items: TemplateItem | TemplateItemGroup = js.native
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget. The order in which these layers are set in the array dictates how they display within the widget.
    * > The widget is designed to only display layers that are enabled for editing. It will not display layers that are enabled to only edit attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
    */
  var layers: js.Array[FeatureLayer] = js.native
  /**
    * The widget's state. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * ready | Dependencies are met and has valid property values.
    * loading | Layers are still loading and not ready yet.
    * disabled | No layers are available to load.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget. A custom function can be used to aid when searching for templates. It takes a function which passes in an object containing a [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label) property of the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).  ![featureTemplatesFilterFunction](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureTemplatesFilterFunction.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  def filterFunction(filterName: js.Any): scala.Boolean = js.native
  /**
    * Use this method to apply a filter on the items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#refresh)
    *
    *
    */
  def refresh(): scala.Unit = js.native
}

