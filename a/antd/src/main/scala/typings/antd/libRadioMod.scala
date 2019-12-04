package typings.antd

import typings.antd.libRadioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object libRadioMod extends js.Object {
  @js.native
  class Button ()
    extends typings.antd.libRadioRadioButtonMod.default
  
  @js.native
  class Group protected ()
    extends typings.antd.libRadioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typings.antd.libRadioRadioMod.default
  
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

