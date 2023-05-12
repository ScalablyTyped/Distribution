package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.esComponentsStepperStepperMod.StepperProps
import typings.antdMobile.esComponentsStepperStepperMod.StepperRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsStepperMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/stepper", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StepperProps & RefAttributes[StepperRef]] = js.native
  
  type _To = ForwardRefExoticComponent[StepperProps & RefAttributes[StepperRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsStepperMod.foo` */
  override def _to: ForwardRefExoticComponent[StepperProps & RefAttributes[StepperRef]] = default
}
