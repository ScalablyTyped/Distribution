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
    * @default pan
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
  
  inline def apply(): NavigationToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationToggleViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationToggleViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setNavigationMode(value: pan | rotate): Self = StObject.set(x, "navigationMode", value.asInstanceOf[js.Any])
    
    inline def setNavigationModeUndefined: Self = StObject.set(x, "navigationMode", js.undefined)
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
