package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupView extends StObject {
  
  /**
  		 * Closes the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#closePopup)
  		 */
  def closePopup(): scala.Unit = js.native
  
  /**
  		 * Opens the popup at the given location with content defined either explicitly with `content` or driven from the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) of input features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#openPopup)
  		 */
  def openPopup(): js.Promise[Any] = js.native
  def openPopup(options: PopupViewOpenPopupOptions): js.Promise[Any] = js.native
  
  /**
  		 * A [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#map).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#popup)
  		 */
  var popup: Popup = js.native
  
  /**
  		 * Controls whether the popup opens when users click on the view.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-PopupView.html#popupEnabled)
  		 */
  var popupEnabled: Boolean = js.native
}
