package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
  		 * The view associated with the widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint)
  		 */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}
object HomeViewModelProperties {
  
  inline def apply(): HomeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomeViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
