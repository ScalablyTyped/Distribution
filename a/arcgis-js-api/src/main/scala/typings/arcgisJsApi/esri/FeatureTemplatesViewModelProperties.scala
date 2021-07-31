package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplatesViewModelProperties extends StObject {
  
  /**
    * [Function](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#FilterFunction) can be defined to help filter [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#filterFunction)
    */
  var filterFunction: js.UndefOr[FilterFunction] = js.undefined
  
  /**
    * It is possible to group [template items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
  
  /**
    * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
    */
  var layers: js.UndefOr[js.Array[FeatureLayerProperties]] = js.undefined
}
object FeatureTemplatesViewModelProperties {
  
  @scala.inline
  def apply(): FeatureTemplatesViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesViewModelProperties]
  }
  
  @scala.inline
  implicit class FeatureTemplatesViewModelPropertiesMutableBuilder[Self <: FeatureTemplatesViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFunction(value: /* filterName */ js.Any => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
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
  }
}
