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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html#open)
    */
  var open: js.UndefOr[Boolean] = js.undefined
}
object ButtonMenuViewModelProperties {
  
  @scala.inline
  def apply(): ButtonMenuViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuViewModelProperties]
  }
  
  @scala.inline
  implicit class ButtonMenuViewModelPropertiesMutableBuilder[Self <: ButtonMenuViewModelProperties] (val x: Self) extends AnyVal {
    
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
  }
}
