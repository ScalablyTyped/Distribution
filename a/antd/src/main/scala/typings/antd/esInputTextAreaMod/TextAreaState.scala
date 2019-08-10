package typings.antd.esInputTextAreaMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaState extends js.Object {
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizing: js.UndefOr[Boolean] = js.undefined
  var textareaStyles: js.UndefOr[CSSProperties] = js.undefined
}

object TextAreaState {
  @scala.inline
  def apply(resizing: js.UndefOr[Boolean] = js.undefined, textareaStyles: CSSProperties = null): TextAreaState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resizing)) __obj.updateDynamic("resizing")(resizing)
    if (textareaStyles != null) __obj.updateDynamic("textareaStyles")(textareaStyles)
    __obj.asInstanceOf[TextAreaState]
  }
}

