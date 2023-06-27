package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsFeatureTemplates extends StObject {
  
  /**
  		 * Aids in managing various template items and how they display within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
  		 */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
  
  var visibleElements: SupportingWidgetDefaultsFeatureTemplatesVisibleElements
}
object SupportingWidgetDefaultsFeatureTemplates {
  
  inline def apply(visibleElements: SupportingWidgetDefaultsFeatureTemplatesVisibleElements): SupportingWidgetDefaultsFeatureTemplates = {
    val __obj = js.Dynamic.literal(visibleElements = visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportingWidgetDefaultsFeatureTemplates] (val x: Self) extends AnyVal {
    
    inline def setGroupBy(value: String | GroupByFunction): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByFunction1(value: /* grouping */ Any => String | Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setVisibleElements(value: SupportingWidgetDefaultsFeatureTemplatesVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
  }
}
