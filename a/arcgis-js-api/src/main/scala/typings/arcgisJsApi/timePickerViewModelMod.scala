package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimePickerViewModel
import typings.arcgisJsApi.esri.TimePickerViewModelConstructor
import typings.arcgisJsApi.esri.TimePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/TimePickerViewModel", JSImport.Namespace)
  @js.native
  val ^ : TimePickerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/TimePickerViewModel", JSImport.Namespace)
  @js.native
  class Class () extends TimePickerViewModel {
    def this(properties: TimePickerViewModelProperties) = this()
  }
  
  type _To = TimePickerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timePickerViewModelMod.foo` */
  override def _to: TimePickerViewModelConstructor = ^
}
