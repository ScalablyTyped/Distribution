package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DateTimeElementViewModel")
@js.native
open class DateTimeElementViewModel ()
  extends StObject
     with typings.arcgisJsApi.esri.DateTimeElementViewModel {
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default ready
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#state)
  		 */
  /* CompleteClass */
  var state: ready = js.native
  
  /**
  		 * The selected date.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#value)
  		 */
  /* CompleteClass */
  var value: js.Date = js.native
}
