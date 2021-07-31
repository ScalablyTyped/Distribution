package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.pan
import typings.arcgisJsApi.arcgisJsApiStrings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationToggleViewModelProperties extends StObject {
  
  /**
    * The navigation mode of the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#navigationMode)
    */
  var navigationMode: js.UndefOr[pan | rotate] = js.undefined
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-NavigationToggle-NavigationToggleViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}
object NavigationToggleViewModelProperties {
  
  @scala.inline
  def apply(): NavigationToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationToggleViewModelProperties]
  }
  
  @scala.inline
  implicit class NavigationToggleViewModelPropertiesMutableBuilder[Self <: NavigationToggleViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigationMode(value: pan | rotate): Self = StObject.set(x, "navigationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationModeUndefined: Self = StObject.set(x, "navigationMode", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
