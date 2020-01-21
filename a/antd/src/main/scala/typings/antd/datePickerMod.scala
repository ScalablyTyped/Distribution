package typings.antd

import org.scalablytyped.runtime.TopLevel
import typings.antd.interfaceMod.DatePickerDecorator
import typings.antd.interfaceMod.DatePickerProps
import typings.react.mod.ClassicComponent
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  @js.native
  class default protected () extends ClassicComponent[DatePickerProps, ComponentState] {
    def this(props: DatePickerProps) = this()
    def this(props: DatePickerProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[DatePickerDecorator]
  
}

