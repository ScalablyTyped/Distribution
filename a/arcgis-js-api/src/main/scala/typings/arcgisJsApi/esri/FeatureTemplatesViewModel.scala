package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplatesViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
  		 * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
  		 */
  def filterFunction(filterName: Any): Boolean = js.native
  /**
  		 * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
  		 */
  @JSName("filterFunction")
  var filterFunction_Original: FilterFunction = js.native
  
  /**
  		 * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
  		 *
  		 * @default layer
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
  		 */
  var groupBy: String | GroupByFunction = js.native
  
  /**
  		 * The template items or grouped template items.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#items)
  		 */
  val items: js.Array[TemplateItem | TemplateItemGroup] = js.native
  
  /**
  		 * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
  		 */
  var layers: js.Array[FeatureLayer | GeoJSONLayer | SceneLayer | SubtypeSublayer | SubtypeGroupLayer] = js.native
  
  @JSName("on")
  def on_select(name: select, eventHandler: FeatureTemplatesViewModelSelectEventHandler): IHandle = js.native
  
  /**
  		 * This method updates the [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) with the provided filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#refresh)
  		 */
  def refresh(): scala.Unit = js.native
  
  /**
  		 * Selects the [template item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#select)
  		 */
  def select(item: TemplateItem): scala.Unit = js.native
  
  /**
  		 * The widget's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#state)
  		 */
  val state: ready | loading | disabled = js.native
}
