package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplatesProperties extends WidgetProperties {
  
  /**
    * When `true`, displays the template [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled)
    */
  var filterEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
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
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.native
  
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget.
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
  implicit class FeatureTemplatesPropertiesMutableBuilder[Self <: FeatureTemplatesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    @scala.inline
    def setFilterFunction(value: /* filterName */ js.Any => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String | GroupByFunction): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[FeatureLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: FeatureLayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: FeatureTemplatesViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: FeatureTemplatesVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
