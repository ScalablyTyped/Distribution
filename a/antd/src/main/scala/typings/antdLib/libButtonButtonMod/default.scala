package typings
package antdLib.libButtonButtonMod

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
  @JSName("Group")
  var Group_Original: reactLib.reactMod.ReactNs.SFC[antdLib.libButtonButtonDashGroupMod.ButtonGroupProps] = js.native
  var __ANT_BUTTON: scala.Boolean = js.native
  var defaultProps: antdLib.Anon_Block = js.native
  var propTypes: antdLib.Anon_ArgsBlock = js.native
  def Group(props: antdLib.libButtonButtonDashGroupMod.ButtonGroupProps with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def Group(
    props: antdLib.libButtonButtonDashGroupMod.ButtonGroupProps with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def getDerivedStateFromProps(
    nextProps: antdLib.libButtonButtonMod.ButtonProps,
    prevState: antdLib.libButtonButtonMod.ButtonState
  ): antdLib.Anon_False | scala.Null = js.native
}

