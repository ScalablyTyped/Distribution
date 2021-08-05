package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentElementViewModel extends StObject {
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#state)
    */
  var state: ready
  
  /**
    * The selected date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#value)
    */
  var value: Date
}
object MomentElementViewModel {
  
  inline def apply(value: Date): MomentElementViewModel = {
    val __obj = js.Dynamic.literal(state = "ready", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentElementViewModel]
  }
  
  extension [Self <: MomentElementViewModel](x: Self) {
    
    inline def setState(value: ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
