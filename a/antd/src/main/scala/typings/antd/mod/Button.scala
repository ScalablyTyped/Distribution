package typings.antd.mod

import typings.antd.AnonBlock
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.buttonMod.default
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Context
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Button")
@js.native
class Button protected () extends default {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd", "Button")
@js.native
object Button extends js.Object {
  var Group: FC[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: AnonBlock = js.native
}

