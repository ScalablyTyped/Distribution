package typings.antd.antdMod

import typings.antd.Anon_AddonAfter
import typings.antd.Anon_Type
import typings.antd.Anon_ValueArray
import typings.antd.TypeofClassPassword
import typings.antd.TypeofClassSearch
import typings.antd.TypeofClassTextArea
import typings.antd.libInputGroupMod.GroupProps
import typings.antd.libInputInputMod.InputProps
import typings.antd.libInputMod.default
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Input")
@js.native
class Input protected () extends default {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd", "Input")
@js.native
object Input extends js.Object {
  var Group: StatelessComponent[GroupProps] = js.native
  var Password: TypeofClassPassword = js.native
  var Search: TypeofClassSearch = js.native
  var TextArea: TypeofClassTextArea = js.native
  var defaultProps: Anon_Type = js.native
  var propTypes: Anon_AddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): Anon_ValueArray | Null = js.native
}

