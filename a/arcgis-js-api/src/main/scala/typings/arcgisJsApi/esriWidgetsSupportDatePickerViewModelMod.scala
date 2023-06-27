package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.DatePickerViewModel
import typings.arcgisJsApi.esri.DatePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportDatePickerViewModelMod {
  
  @JSImport("esri/widgets/support/DatePickerViewModel", JSImport.Namespace)
  @js.native
  /**
  		 * Provides the logic for the [DatePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePickerViewModel.html)
  		 */
  open class ^ ()
    extends StObject
       with DatePickerViewModel {
    def this(properties: DatePickerViewModelProperties) = this()
    
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
}
