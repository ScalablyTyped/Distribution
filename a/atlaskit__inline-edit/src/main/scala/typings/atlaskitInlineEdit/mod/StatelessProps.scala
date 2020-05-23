package typings.atlaskitInlineEdit.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends BaseProps {
  /** Whether the component shows the readView or the editView. */
  var isEditing: Boolean
  /** Handler called when the wrapper or the label are clicked. */
  def onEditRequested(): Unit
}

object StatelessProps {
  @scala.inline
  def apply(
    isEditing: Boolean,
    onCancel: () => Unit,
    onConfirm: () => Unit,
    onEditRequested: () => Unit,
    readView: ReactElement,
    areActionButtonsHidden: js.UndefOr[Boolean] = js.undefined,
    disableEditViewFieldBase: js.UndefOr[Boolean] = js.undefined,
    editView: ReactElement = null,
    invalidMessage: ReactElement = null,
    isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.undefined,
    isFitContainerWidthReadView: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isLabelHidden: js.UndefOr[Boolean] = js.undefined,
    isWaiting: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelHtmlFor: String = null,
    shouldConfirmOnEnter: js.UndefOr[Boolean] = js.undefined
  ): StatelessProps = {
    val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView.asInstanceOf[js.Any])
    if (!js.isUndefined(areActionButtonsHidden)) __obj.updateDynamic("areActionButtonsHidden")(areActionButtonsHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditViewFieldBase)) __obj.updateDynamic("disableEditViewFieldBase")(disableEditViewFieldBase.get.asInstanceOf[js.Any])
    if (editView != null) __obj.updateDynamic("editView")(editView.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isConfirmOnBlurDisabled)) __obj.updateDynamic("isConfirmOnBlurDisabled")(isConfirmOnBlurDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFitContainerWidthReadView)) __obj.updateDynamic("isFitContainerWidthReadView")(isFitContainerWidthReadView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLabelHidden)) __obj.updateDynamic("isLabelHidden")(isLabelHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWaiting)) __obj.updateDynamic("isWaiting")(isWaiting.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelHtmlFor != null) __obj.updateDynamic("labelHtmlFor")(labelHtmlFor.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldConfirmOnEnter)) __obj.updateDynamic("shouldConfirmOnEnter")(shouldConfirmOnEnter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessProps]
  }
}

