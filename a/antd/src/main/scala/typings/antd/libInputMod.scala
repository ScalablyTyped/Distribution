package typings.antd

import typings.antd.libInputGroupMod.GroupProps
import typings.antd.libInputInputMod.InputProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input", JSImport.Namespace)
@js.native
object libInputMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.libInputInputMod.default {
    def this(props: InputProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: StatelessComponent[GroupProps] = js.native
    var Password: TypeofClassPassword = js.native
    var Search: TypeofClassSearch = js.native
    var TextArea: TypeofClassTextArea = js.native
    var defaultProps: Anon_Type = js.native
    var propTypes: Anon_AddonAfter = js.native
    def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
  }
  
}

