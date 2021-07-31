package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonMenuProperties
  extends StObject
     with WidgetProperties {
  
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
    * Indicates if the menu content is visible.
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
  
  @scala.inline
  def apply(): ButtonMenuProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuProperties]
  }
  
  @scala.inline
  implicit class ButtonMenuPropertiesMutableBuilder[Self <: ButtonMenuProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ButtonMenuItemProperties]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ButtonMenuItemProperties*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setViewModel(value: ButtonMenuViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
