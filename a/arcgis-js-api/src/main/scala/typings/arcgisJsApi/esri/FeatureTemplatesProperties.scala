package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplatesProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * When `true`, displays the template [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled)
    */
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
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
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
  
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTemplatesVisibleElements] = js.undefined
}
object FeatureTemplatesProperties {
  
  inline def apply(): FeatureTemplatesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesProperties]
  }
  
  extension [Self <: FeatureTemplatesProperties](x: Self) {
    
    inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    inline def setFilterFunction(value: /* filterName */ js.Any => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction1(value))
    
    inline def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    inline def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    inline def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    inline def setGroupBy(value: String | GroupByFunction): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setLayers(value: js.Array[FeatureLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: FeatureLayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    inline def setViewModel(value: FeatureTemplatesViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setVisibleElements(value: FeatureTemplatesVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
