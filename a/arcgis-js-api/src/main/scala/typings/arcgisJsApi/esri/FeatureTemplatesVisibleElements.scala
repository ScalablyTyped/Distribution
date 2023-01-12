package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplatesVisibleElements extends StObject {
  
  /**
    * Indicates whether to the filter will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#VisibleElements)
    */
  var filter: js.UndefOr[Boolean] = js.undefined
}
object FeatureTemplatesVisibleElements {
  
  inline def apply(): FeatureTemplatesVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplatesVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTemplatesVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
