package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonMenuProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * When true, the widget is visually withdrawn and cannot be interacted with.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#disabled)
  		 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Adds a CSS class to the menu button's DOM node.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#items)
  		 */
  var items: js.UndefOr[js.Array[ButtonMenuItemProperties]] = js.undefined
  
  /**
  		 * Indicates if the menu content is open and visible.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#open)
  		 */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#viewModel)
  		 */
  var viewModel: js.UndefOr[ButtonMenuViewModelProperties] = js.undefined
}
object ButtonMenuProperties {
  
  inline def apply(): ButtonMenuProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonMenuProperties] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setItems(value: js.Array[ButtonMenuItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ButtonMenuItemProperties*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setViewModel(value: ButtonMenuViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
