package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DateTimePickerInput
import typings.arcgisJsApi.esri.DateTimePickerInputConstructor
import typings.arcgisJsApi.esri.DateTimePickerInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePickerInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  val ^ : DateTimePickerInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  class Class () extends DateTimePickerInput {
    def this(properties: DateTimePickerInputProperties) = this()
  }
  
  type _To = DateTimePickerInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dateTimePickerInputMod.foo` */
  override def _to: DateTimePickerInputConstructor = ^
}
