package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsFeatureTemplates
  extends StObject
     with Object {
  
  /**
    * Indicates whether the [templates filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled) displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Aids in managing various template items and how they display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
}
object SupportingWidgetDefaultsFeatureTemplates {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsFeatureTemplates = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplates]
  }
  
  extension [Self <: SupportingWidgetDefaultsFeatureTemplates](x: Self) {
    
    inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    inline def setGroupBy(value: String | GroupByFunction): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByFunction1(value: /* grouping */ js.Any => String | js.Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
  }
}
