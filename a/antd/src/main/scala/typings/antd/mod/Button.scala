package typings.antd.mod

import typings.antd.AnonArgs
import typings.antd.AnonBlock
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.buttonMod.default
import typings.react.mod.SFC
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
  var Group: SFC[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var defaultProps: AnonBlock = js.native
  var propTypes: AnonArgs = js.native
}

