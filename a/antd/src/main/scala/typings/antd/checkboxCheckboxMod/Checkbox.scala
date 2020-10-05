package typings.antd.checkboxCheckboxMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkbox
  extends Component[CheckboxProps, js.Object, js.Any] {
  var rcCheckbox: js.Any = js.native
  def blur(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCheckbox(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckbox(hasValue: CheckboxProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCheckbox(): Unit = js.native
  def focus(): Unit = js.native
  def renderCheckbox(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveCheckbox(node: js.Any): Unit = js.native
}

