package typings.antd.groupMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroup
  extends Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  def cancelValue(value: String): Unit = js.native
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  def registerValue(value: String): Unit = js.native
  def renderGroup(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def toggleOption(option: CheckboxOptionType): Unit = js.native
}

