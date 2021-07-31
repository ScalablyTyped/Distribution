package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.DatePickerViewModelProperties
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.DatePickerViewModel")
@js.native
class DatePickerViewModelCls ()
  extends StObject
     with typings.arcgisJsApi.esri.DatePickerViewModel {
  def this(properties: DatePickerViewModelProperties) = this()
  
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#state)
    */
  /* CompleteClass */
  var state: ready = js.native
  
  /**
    * The selected date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-MomentElementViewModel.html#value)
    */
  /* CompleteClass */
  var value: Date = js.native
}
