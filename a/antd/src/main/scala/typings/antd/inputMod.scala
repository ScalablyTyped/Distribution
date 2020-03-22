package typings.antd

import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.inputInputMod.InputState
import typings.react.mod.StatelessComponent
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
    var Group: StatelessComponent[GroupProps] = js.native
    var Password: TypeofPassword = js.native
    var Search: TypeofSearch = js.native
    var TextArea: TypeofTextArea = js.native
    var defaultProps: AnonType = js.native
    def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
  }
  
}

