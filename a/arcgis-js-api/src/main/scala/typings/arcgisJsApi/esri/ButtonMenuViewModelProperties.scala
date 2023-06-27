package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonMenuViewModelProperties extends StObject {
  
  /**
  		 * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html#items)
  		 */
  var items: js.UndefOr[js.Array[ButtonMenuItemProperties]] = js.undefined
  
  /**
  		 * Indicates if the menu content is visible.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html#open)
  		 */
  var open: js.UndefOr[Boolean] = js.undefined
}
object ButtonMenuViewModelProperties {
  
  inline def apply(): ButtonMenuViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonMenuViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ButtonMenuItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ButtonMenuItemProperties*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
