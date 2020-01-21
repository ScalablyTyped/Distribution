package typings.antd

import typings.antd.radioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  class Button ()
    extends typings.antd.radioButtonMod.default
  
  @js.native
  class Group protected ()
    extends typings.antd.radioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typings.antd.radioRadioMod.default
  
  /* static members */
  @js.native
  object Button extends js.Object {
    var contextTypes: AnonRadioGroup = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    var childContextTypes: AnonRadioGroup = js.native
    var defaultProps: AnonButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): AnonValueAny | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: TypeofClassRadioButton = js.native
    var Group: TypeofClassRadioGroup = js.native
    var contextTypes: AnonRadioGroup = js.native
    var defaultProps: AnonType = js.native
  }
  
}

