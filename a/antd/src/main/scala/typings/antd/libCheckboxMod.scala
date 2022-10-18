package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libCheckboxCheckboxMod.CheckboxProps
import typings.antd.libCheckboxGroupMod.CheckboxGroupProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxMod extends Shortcut {
  
  @JSImport("antd/lib/checkbox", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] {
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[CheckboxGroupProps & RefAttributes[HTMLDivElement]]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libCheckboxMod.foo` */
  override def _to: CompoundedComponent = default
}
