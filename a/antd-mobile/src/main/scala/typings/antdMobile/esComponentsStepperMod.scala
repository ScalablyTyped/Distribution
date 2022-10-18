package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.esComponentsStepperStepperMod.StepperProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsStepperMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/stepper", JSImport.Default)
  @js.native
  val default: FC[StepperProps] = js.native
  
  type _To = FC[StepperProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsStepperMod.foo` */
  override def _to: FC[StepperProps] = default
}
