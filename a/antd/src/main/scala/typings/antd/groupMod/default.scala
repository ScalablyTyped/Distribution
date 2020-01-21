package typings.antd.groupMod

import typings.antd.AnonArgsDefaultValue
import typings.antd.AnonCheckboxGroup
import typings.antd.AnonOptions
import typings.antd.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/checkbox/Group", JSImport.Default)
@js.native
class default protected () extends CheckboxGroup {
  def this(props: CheckboxGroupProps) = this()
}

/* static members */
@JSImport("antd/lib/checkbox/Group", JSImport.Default)
@js.native
object default extends js.Object {
  var childContextTypes: AnonCheckboxGroup = js.native
  var defaultProps: AnonOptions = js.native
  var propTypes: AnonArgsDefaultValue = js.native
  def getDerivedStateFromProps(nextProps: CheckboxGroupProps): AnonValue | Null = js.native
}

