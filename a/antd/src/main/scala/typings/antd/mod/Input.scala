package typings.antd.mod

import typings.antd.AnonType
import typings.antd.PartialInputState
import typings.antd.TypeofPassword
import typings.antd.TypeofSearch
import typings.antd.TypeofTextArea
import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.inputInputMod.InputState
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
  var Password: TypeofPassword = js.native
  var Search: TypeofSearch = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: AnonType = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

