package typings.antd.inputInputMod

import typings.antd.AnonAddonAfter
import typings.antd.AnonType
import typings.antd.AnonValueArray
import typings.antd.TypeofClassPassword
import typings.antd.TypeofClassSearch
import typings.antd.TypeofClassTextArea
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
  var Password: TypeofClassPassword = js.native
  var Search: TypeofClassSearch = js.native
  var TextArea: TypeofClassTextArea = js.native
  var defaultProps: AnonType = js.native
  var propTypes: AnonAddonAfter = js.native
  def getDerivedStateFromProps(nextProps: InputProps): AnonValueArray | Null = js.native
}

