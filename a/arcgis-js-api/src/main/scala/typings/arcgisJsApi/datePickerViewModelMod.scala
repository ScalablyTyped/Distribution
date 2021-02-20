package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DatePickerViewModel
import typings.arcgisJsApi.esri.DatePickerViewModelConstructor
import typings.arcgisJsApi.esri.DatePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/DatePickerViewModel", JSImport.Namespace)
  @js.native
  val ^ : DatePickerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/DatePickerViewModel", JSImport.Namespace)
  @js.native
  class Class () extends DatePickerViewModel {
    def this(properties: DatePickerViewModelProperties) = this()
  }
  
  type _To = DatePickerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `datePickerViewModelMod.foo` */
  override def _to: DatePickerViewModelConstructor = ^
}
