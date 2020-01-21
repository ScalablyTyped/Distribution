package typings.antd.mod

import typings.antd.AnonAddonAfter
import typings.antd.AnonType
import typings.antd.AnonValueArray
import typings.antd.TypeofClassPassword
import typings.antd.TypeofClassSearch
import typings.antd.TypeofClassTextArea
import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.inputMod.default
import typings.react.mod.StatelessComponent
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
  var defaultProps: AnonType = js.native
  var propTypes: AnonAddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): AnonValueArray | Null = js.native
}

