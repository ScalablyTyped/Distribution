package typings.antd.resizableTextAreaMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaState extends js.Object {
  /** We need add process style to disable scroll first and then add back to avoid unexpected scrollbar  */
  var resizeStatus: js.UndefOr[/* 0 */ Double] = js.undefined
  var textareaStyles: js.UndefOr[CSSProperties] = js.undefined
}

object TextAreaState {
  @scala.inline
  def apply(resizeStatus: js.UndefOr[/* 0 */ Double] = js.undefined, textareaStyles: CSSProperties = null): TextAreaState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resizeStatus)) __obj.updateDynamic("resizeStatus")(resizeStatus.get.asInstanceOf[js.Any])
    if (textareaStyles != null) __obj.updateDynamic("textareaStyles")(textareaStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaState]
  }
}

