package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`locate-error`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.locating
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateViewModel
  extends StObject
     with Accessor
     with Evented
     with GeolocationPositioning
     with GoTo {
  
  /**
  		 * This function provides the ability to interrupt and cancel the process of programmatically obtaining the location of the user's device.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#cancelLocate)
  		 */
  def cancelLocate(): scala.Unit = js.native
  
  /**
  		 * Animates the view to the user's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate)
  		 */
  def locate(): js.Promise[Any] = js.native
  
  @JSName("on")
  def on_locateerror(name: `locate-error`, eventHandler: LocateViewModelLocateErrorEventHandler): IHandle = js.native
  
  /**
  		 * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) of the result graphic from the [locate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate) method.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#popupEnabled)
  		 */
  var popupEnabled: Boolean = js.native
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#state)
  		 */
  val state: disabled | ready | locating = js.native
}
