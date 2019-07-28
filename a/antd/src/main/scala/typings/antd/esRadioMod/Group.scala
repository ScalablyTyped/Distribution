package typings.antd.esRadioMod

import typings.antd.Anon_ButtonStyle
import typings.antd.Anon_RadioGroup
import typings.antd.Anon_ValueAny
import typings.antd.esRadioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/radio", "Group")
@js.native
class Group protected ()
  extends typings.antd.esRadioGroupMod.default {
  def this(props: RadioGroupProps) = this()
}

/* static members */
@JSImport("antd/es/radio", "Group")
@js.native
object Group extends js.Object {
  var childContextTypes: Anon_RadioGroup = js.native
  var defaultProps: Anon_ButtonStyle = js.native
  def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
}

