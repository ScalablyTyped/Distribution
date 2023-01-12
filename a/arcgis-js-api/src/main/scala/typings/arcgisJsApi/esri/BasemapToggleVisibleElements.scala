package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasemapToggleVisibleElements extends StObject {
  
  /**
    * Indicates whether to the title will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#VisibleElements)
    */
  var title: js.UndefOr[Boolean] = js.undefined
}
object BasemapToggleVisibleElements {
  
  inline def apply(): BasemapToggleVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasemapToggleVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
