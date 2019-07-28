package typings.atAtlaskitInlineDashEdit.atAtlaskitInlineDashEditMod

import typings.react.reactMod.ReactElement
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
    val __obj = js.Dynamic.literal(isEditing = isEditing, onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView)
    if (!js.isUndefined(areActionButtonsHidden)) __obj.updateDynamic("areActionButtonsHidden")(areActionButtonsHidden)
    if (!js.isUndefined(disableEditViewFieldBase)) __obj.updateDynamic("disableEditViewFieldBase")(disableEditViewFieldBase)
    if (editView != null) __obj.updateDynamic("editView")(editView)
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage)
    if (!js.isUndefined(isConfirmOnBlurDisabled)) __obj.updateDynamic("isConfirmOnBlurDisabled")(isConfirmOnBlurDisabled)
    if (!js.isUndefined(isFitContainerWidthReadView)) __obj.updateDynamic("isFitContainerWidthReadView")(isFitContainerWidthReadView)
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid)
    if (!js.isUndefined(isLabelHidden)) __obj.updateDynamic("isLabelHidden")(isLabelHidden)
    if (!js.isUndefined(isWaiting)) __obj.updateDynamic("isWaiting")(isWaiting)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelHtmlFor != null) __obj.updateDynamic("labelHtmlFor")(labelHtmlFor)
    if (!js.isUndefined(shouldConfirmOnEnter)) __obj.updateDynamic("shouldConfirmOnEnter")(shouldConfirmOnEnter)
    __obj.asInstanceOf[StatelessProps]
  }
}

