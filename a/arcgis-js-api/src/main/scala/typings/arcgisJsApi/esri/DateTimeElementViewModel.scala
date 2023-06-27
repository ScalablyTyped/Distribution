package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeElementViewModel extends StObject {
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default ready
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#state)
  		 */
  var state: ready
  
  /**
  		 * The selected date.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#value)
  		 */
  var value: js.Date
}
object DateTimeElementViewModel {
  
  inline def apply(value: js.Date): DateTimeElementViewModel = {
    val __obj = js.Dynamic.literal(state = "ready", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeElementViewModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeElementViewModel] (val x: Self) extends AnyVal {
    
    inline def setState(value: ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
