package typings.antd.buttonButtonMod

import typings.antd.AnonBlock
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Context
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
class default protected () extends Button {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: FC[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: AnonBlock = js.native
}

