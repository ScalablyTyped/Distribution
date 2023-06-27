package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Compass#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * The view in which the Compass obtains and indicates camera [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading), using a (SceneView) or rotation (MapView).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#viewModel)
  		 */
  var viewModel: js.UndefOr[CompassViewModelProperties] = js.undefined
}
object CompassProperties {
  
  inline def apply(): CompassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompassProperties] (val x: Self) extends AnyVal {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: CompassViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
