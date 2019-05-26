package typings
package antdLib.libButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Default)
@js.native
class default protected ()
  extends antdLib.libButtonButtonMod.default {
  def this(props: antdLib.libButtonButtonMod.ButtonProps) = this()
}

/* static members */
@JSImport("antd/lib/button", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: reactLib.reactMod.SFC[antdLib.libButtonButtonDashGroupMod.ButtonGroupProps] = js.native
  var __ANT_BUTTON: scala.Boolean = js.native
  var defaultProps: antdLib.Anon_Block = js.native
  var propTypes: antdLib.Anon_Args = js.native
  def getDerivedStateFromProps(
    nextProps: antdLib.libButtonButtonMod.ButtonProps,
    prevState: antdLib.libButtonButtonMod.ButtonState
  ): antdLib.Anon_False | scala.Null = js.native
}

