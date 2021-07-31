package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentElementViewModelProperties extends StObject {
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#state)
    */
  var state: js.UndefOr[ready] = js.undefined
  
  /**
    * The selected date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.undefined
}
object MomentElementViewModelProperties {
  
  @scala.inline
  def apply(): MomentElementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentElementViewModelProperties]
  }
  
  @scala.inline
  implicit class MomentElementViewModelPropertiesMutableBuilder[Self <: MomentElementViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setValue(value: DateProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
