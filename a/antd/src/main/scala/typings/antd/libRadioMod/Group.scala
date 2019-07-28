package typings.antd.libRadioMod

import typings.antd.Anon_ButtonStyleRadioGroupButtonStyle
import typings.antd.Anon_RadioGroup
import typings.antd.Anon_ValueAny
import typings.antd.libRadioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", "Group")
@js.native
class Group protected ()
  extends typings.antd.libRadioGroupMod.default {
  def this(props: RadioGroupProps) = this()
}

/* static members */
@JSImport("antd/lib/radio", "Group")
@js.native
object Group extends js.Object {
  var childContextTypes: Anon_RadioGroup = js.native
  var defaultProps: Anon_ButtonStyleRadioGroupButtonStyle = js.native
  def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
}

