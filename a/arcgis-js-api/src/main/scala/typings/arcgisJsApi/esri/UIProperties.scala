package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIProperties extends StObject {
  
  /**
  		 * The HTML Element that contains the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container)
  		 */
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  /**
  		 * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default { left: 15, top: 15, right: 15, bottom: 15 }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
  		 */
  var padding: js.UndefOr[Any | Double] = js.undefined
  
  /**
  		 * The view associated with the UI components.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object UIProperties {
  
  inline def apply(): UIProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIProperties] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setPadding(value: Any | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
