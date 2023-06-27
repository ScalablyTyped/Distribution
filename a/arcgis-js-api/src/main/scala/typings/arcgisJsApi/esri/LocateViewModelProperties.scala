package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateViewModelProperties
  extends StObject
     with GeolocationPositioningProperties
     with GoToProperties {
  
  /**
  		 * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) of the result graphic from the [locate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate) method.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
}
object LocateViewModelProperties {
  
  inline def apply(): LocateViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocateViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
  }
}
