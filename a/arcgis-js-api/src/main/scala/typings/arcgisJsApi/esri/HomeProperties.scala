package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * Overwrite localized strings for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#uiStrings)
  		 */
  var uiStrings: js.UndefOr[Any] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewModel)
  		 */
  var viewModel: js.UndefOr[HomeViewModelProperties] = js.undefined
  
  /**
  		 * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint)
  		 */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}
object HomeProperties {
  
  inline def apply(): HomeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HomeProperties] (val x: Self) extends AnyVal {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setUiStrings(value: Any): Self = StObject.set(x, "uiStrings", value.asInstanceOf[js.Any])
    
    inline def setUiStringsUndefined: Self = StObject.set(x, "uiStrings", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: HomeViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    inline def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}
