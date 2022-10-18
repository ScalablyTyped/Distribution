package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.DatePickerViewModel
import typings.arcgisJsApi.esri.DatePickerViewModelConstructor
import typings.arcgisJsApi.esri.DatePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportDatePickerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/DatePickerViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DatePickerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/DatePickerViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [DatePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePickerViewModel.html)
    */
  open class Class ()
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
  
  type _To = js.Object & DatePickerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportDatePickerViewModelMod.foo` */
  override def _to: js.Object & DatePickerViewModelConstructor = ^
}
