package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapToggleViewModelProperties extends StObject {
  
  /**
    * The next basemap for toggling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object BasemapToggleViewModelProperties {
  
  @scala.inline
  def apply(): BasemapToggleViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleViewModelProperties]
  }
  
  @scala.inline
  implicit class BasemapToggleViewModelPropertiesMutableBuilder[Self <: BasemapToggleViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextBasemap(value: BasemapProperties | String): Self = StObject.set(x, "nextBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBasemapUndefined: Self = StObject.set(x, "nextBasemap", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
