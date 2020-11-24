package typings.antd

import typings.antd.checkboxCheckboxMod.CheckboxProps
import typings.antd.checkboxGroupMod.CheckboxGroupProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.NamedExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] {
    
    var Group: NamedExoticComponent[CheckboxGroupProps] = js.native
    
    var __ANT_CHECKBOX: Boolean = js.native
  }
}
