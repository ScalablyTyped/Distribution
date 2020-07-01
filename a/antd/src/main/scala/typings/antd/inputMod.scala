package typings.antd

import typings.antd.anon.PartialInputState
import typings.antd.anon.Type
import typings.antd.anon.TypeofTextArea
import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.inputInputMod.InputState
import typings.antd.passwordMod.PasswordProps
import typings.antd.searchMod.SearchProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.inputInputMod.default {
    def this(props: InputProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: FC[GroupProps] = js.native
    var Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
    var Search: ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]] = js.native
    var TextArea: TypeofTextArea = js.native
    var defaultProps: Type = js.native
    def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
  }
  
}

