package typings
package antdLib.esCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox
  extends reactLib.reactMod.Component[CheckboxProps, js.Object, js.Any] {
  var rcCheckbox: js.Any = js.native
  def blur(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCheckbox(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckbox(hasValue: CheckboxProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCheckbox(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def renderCheckbox(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveCheckbox(node: js.Any): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckbox(
    nextProps: CheckboxProps,
    nextState: js.Object,
    nextContext: antdLib.esCheckboxGroupMod.CheckboxGroupContext
  ): scala.Boolean = js.native
}

