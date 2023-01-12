package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsFeatureTemplatesVisibleElements extends StObject {
  
  /**
    * Indicates whether the [templates filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#visibleElements) displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var filter: js.UndefOr[Boolean] = js.undefined
}
object SupportingWidgetDefaultsFeatureTemplatesVisibleElements {
  
  inline def apply(): SupportingWidgetDefaultsFeatureTemplatesVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplatesVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportingWidgetDefaultsFeatureTemplatesVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
