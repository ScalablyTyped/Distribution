package typings.antd

import typings.antd.esRadioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio", JSImport.Namespace)
@js.native
object esRadioMod extends js.Object {
  @js.native
  class Button ()
    extends typings.antd.esRadioRadioButtonMod.default
  
  @js.native
  class Group protected ()
    extends typings.antd.esRadioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typings.antd.esRadioRadioMod.default
  
  /* static members */
  @js.native
  object Button extends js.Object {
    var contextTypes: Anon_RadioGroup = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    var childContextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_ButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: TypeofClassRadioButton = js.native
    var Group: TypeofClassRadioGroup = js.native
    var contextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_Type = js.native
  }
  
}

