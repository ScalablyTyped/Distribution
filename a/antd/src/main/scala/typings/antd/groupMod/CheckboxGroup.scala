package typings.antd.groupMod

import typings.antd.AnonCheckboxGroupAnonCancelValue
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroup
  extends Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  def cancelValue(value: String): Unit = js.native
  def getChildContext(): AnonCheckboxGroupAnonCancelValue = js.native
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  def registerValue(value: String): Unit = js.native
  def renderGroup(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckboxGroup(nextProps: CheckboxGroupProps, nextState: CheckboxGroupState): Boolean = js.native
  def toggleOption(option: CheckboxOptionType): Unit = js.native
}

