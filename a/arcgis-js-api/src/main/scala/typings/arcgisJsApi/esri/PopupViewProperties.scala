package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupViewProperties extends StObject {
  
  /**
  		 * A [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#map).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#popup)
  		 */
  var popup: js.UndefOr[PopupProperties] = js.undefined
  
  /**
  		 * Controls whether the popup opens when users click on the view.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
}
object PopupViewProperties {
  
  inline def apply(): PopupViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupViewProperties] (val x: Self) extends AnyVal {
    
    inline def setPopup(value: PopupProperties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
  }
}
