package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod extends Shortcut {
  
  @JSImport("antd/lib/radio/radioButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[js.Any]] = js.native
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
  
  type _To = ForwardRefExoticComponent[RadioButtonProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[js.Any]] = default
}
