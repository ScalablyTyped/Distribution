package typings.antd.mod

import org.scalablytyped.runtime.Shortcut
import typings.antd.libStepsMod.StepProps
import typings.antd.libStepsMod.StepsType
import typings.react.mod.ClassicComponent
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps extends Shortcut {
  
  @JSImport("antd", "Steps")
  @js.native
  val ^ : StepsType = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Steps.Step")
  @js.native
  class Step protected () extends ClassicComponent[StepProps, ComponentState] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  
  type _To = StepsType
  
  /* This means you don't have to write `^`, but can instead just say `Steps.foo` */
  override def _to: StepsType = ^
}
