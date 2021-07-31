package typings.arcgisJsApi.esri

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker
  extends StObject
     with Widget_ {
  
  /**
    * Indicates whether the date gets updated when the user changes the month in the drop-down.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#commitOnMonthChange)
    */
  var commitOnMonthChange: Boolean = js.native
  
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#value)
    */
  var value: Date = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#viewModel)
    */
  var viewModel: DatePickerViewModel = js.native
}
