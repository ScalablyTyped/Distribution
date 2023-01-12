package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeElementViewModelProperties extends StObject {
  
  /**
    * The current state of the widget.
    *
    * @default ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#state)
    */
  var state: js.UndefOr[ready] = js.undefined
  
  /**
    * The selected date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.undefined
}
object DateTimeElementViewModelProperties {
  
  inline def apply(): DateTimeElementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeElementViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeElementViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setState(value: ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setValue(value: DateProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
