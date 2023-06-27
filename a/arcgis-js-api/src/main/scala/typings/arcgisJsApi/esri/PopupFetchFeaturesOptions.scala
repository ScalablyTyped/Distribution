package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupFetchFeaturesOptions extends StObject {
  
  /**
  		 * The `click` event for either the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchFeaturesOptions)
  		 */
  var event: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#FetchFeaturesOptions)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PopupFetchFeaturesOptions {
  
  inline def apply(): PopupFetchFeaturesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupFetchFeaturesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupFetchFeaturesOptions] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
