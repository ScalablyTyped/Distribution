package typings.antd

import org.scalablytyped.runtime.TopLevel
import typings.antd.libDateDashPickerInterfaceMod.DatePickerDecorator
import typings.antd.libDateDashPickerInterfaceMod.DatePickerProps
import typings.react.reactMod.ClassicComponent
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker", JSImport.Namespace)
@js.native
object libDateDashPickerMod extends js.Object {
  @js.native
  class default protected () extends ClassicComponent[DatePickerProps, ComponentState] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[DatePickerDecorator]
  
}

