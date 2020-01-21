package typings.antd.clearableLabeledInputMod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearableLabeledInput
  extends Component[ClearableInputProps, js.Object, js.Any] {
  def renderClearIcon(prefixCls: String): Element | Null = js.native
  def renderClearableLabeledInput(): Element = js.native
  def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): Element = js.native
  def renderLabeledIcon(prefixCls: String, element: ReactElement): Element = js.native
  def renderSuffix(prefixCls: String): Element | Null = js.native
  def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): Element = js.native
}

