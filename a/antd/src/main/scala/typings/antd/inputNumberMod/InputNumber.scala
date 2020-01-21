package typings.antd.inputNumberMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputNumber
  extends Component[InputNumberProps, js.Any, js.Any] {
  var inputNumberRef: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderInputNumber(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveInputNumber(inputNumberRef: js.Any): Unit = js.native
}

