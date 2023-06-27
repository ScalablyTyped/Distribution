package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElementsScaleMenus extends StObject {
  
  /**
  		 * Indicates whether the maximum scale dropdown menu is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
  		 */
  var maxScaleMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the minimum scale dropdown menu is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#VisibleElements)
  		 */
  var minScaleMenu: js.UndefOr[Boolean] = js.undefined
}
object VisibleElementsScaleMenus {
  
  inline def apply(): VisibleElementsScaleMenus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElementsScaleMenus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElementsScaleMenus] (val x: Self) extends AnyVal {
    
    inline def setMaxScaleMenu(value: Boolean): Self = StObject.set(x, "maxScaleMenu", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleMenuUndefined: Self = StObject.set(x, "maxScaleMenu", js.undefined)
    
    inline def setMinScaleMenu(value: Boolean): Self = StObject.set(x, "minScaleMenu", value.asInstanceOf[js.Any])
    
    inline def setMinScaleMenuUndefined: Self = StObject.set(x, "minScaleMenu", js.undefined)
  }
}
