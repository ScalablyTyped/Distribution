package typings.antd.clearableLabeledInputMod

import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearableLabeledInput
  extends Component[ClearableInputProps, js.Object, js.Any] {
  /** @private Do not use out of this class. We do not promise this is always keep. */
  var containerRef: js.Any = js.native
  var onInputMouseUp: MouseEventHandler[Element] = js.native
  def renderClearIcon(prefixCls: String): typings.react.mod.global.JSX.Element | Null = js.native
  def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): typings.react.mod.global.JSX.Element = js.native
  def renderLabeledIcon(prefixCls: String, element: ReactElement): typings.react.mod.global.JSX.Element = js.native
  def renderSuffix(prefixCls: String): typings.react.mod.global.JSX.Element | Null = js.native
  def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): typings.react.mod.global.JSX.Element = js.native
}

