package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.GeoJSONLayerPropertiestyp
import typings.arcgisJsApi.anon.SceneLayerPropertiestypes
import typings.arcgisJsApi.anon.SubtypeGroupLayerProperti
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
  		 * @default layer
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#groupBy)
  		 */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
  
  /**
  		 * An array of [Featurelayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that are associated with the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html#layers)
  		 */
  var layers: js.UndefOr[
    js.Array[
      FeatureLayerPropertiestyp | GeoJSONLayerPropertiestyp | SceneLayerPropertiestypes | typings.arcgisJsApi.anon.SubtypeSublayerProperties | SubtypeGroupLayerProperti
    ]
  ] = js.undefined
}
object FeatureTemplatesViewModelProperties {
  
  inline def apply(): FeatureTemplatesViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTemplatesViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setFilterFunction(value: /* filterName */ Any => Boolean): Self = StObject.set(x, "filterFunction", js.Any.fromFunction1(value))
    
    inline def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
    
    inline def setGroupBy(value: String | GroupByFunction): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByFunction1(value: /* grouping */ Any => String | Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setLayers(
      value: js.Array[
          FeatureLayerPropertiestyp | GeoJSONLayerPropertiestyp | SceneLayerPropertiestypes | typings.arcgisJsApi.anon.SubtypeSublayerProperties | SubtypeGroupLayerProperti
        ]
    ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(
      value: (FeatureLayerPropertiestyp | GeoJSONLayerPropertiestyp | SceneLayerPropertiestypes | typings.arcgisJsApi.anon.SubtypeSublayerProperties | SubtypeGroupLayerProperti)*
    ): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
