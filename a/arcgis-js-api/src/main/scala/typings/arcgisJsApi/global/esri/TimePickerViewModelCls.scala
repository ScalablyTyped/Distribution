package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.TimePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TimePickerViewModel")
@js.native
/**
  * Provides the logic for the [TimePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePickerViewModel.html)
  */
open class TimePickerViewModelCls ()
  extends StObject
     with typings.arcgisJsApi.esri.TimePickerViewModel {
  def this(properties: TimePickerViewModelProperties) = this()
  
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
