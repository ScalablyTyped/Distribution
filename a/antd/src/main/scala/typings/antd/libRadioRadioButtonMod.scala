package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libCheckboxCheckboxMod.AbstractCheckboxProps
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioRadioButtonMod extends Shortcut {
  
  @JSImport("antd/lib/radio/radioButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[Any]] = js.native
  
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
  
  type _To = ForwardRefExoticComponent[RadioButtonProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libRadioRadioButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[RadioButtonProps & RefAttributes[Any]] = default
}
