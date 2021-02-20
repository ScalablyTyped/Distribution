package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentElementViewModel extends StObject {
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#state)
    */
  var state: ready = js.native
  
  /**
    * The selected date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#value)
    */
  var value: Date = js.native
}
object MomentElementViewModel {
  
  @scala.inline
  def apply(state: ready, value: Date): MomentElementViewModel = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentElementViewModel]
  }
  
  @scala.inline
  implicit class MomentElementViewModelMutableBuilder[Self <: MomentElementViewModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
