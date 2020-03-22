package typings.antd.inputInputMod

import typings.antd.AnonType
import typings.antd.PartialInputState
import typings.antd.TypeofPassword
import typings.antd.TypeofSearch
import typings.antd.TypeofTextArea
import typings.antd.inputGroupMod.GroupProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
class default protected () extends Input {
  def this(props: InputProps) = this()
}

/* static members */
@JSImport("antd/lib/input/Input", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: StatelessComponent[GroupProps] = js.native
  var Password: TypeofPassword = js.native
  var Search: TypeofSearch = js.native
  var TextArea: TypeofTextArea = js.native
  var defaultProps: AnonType = js.native
  def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
}

