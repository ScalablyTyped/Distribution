package typings
package atAtlaskitInlineDashEditLib.atAtlaskitInlineDashEditMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /** Sets whether the checkmark and cross are displayed in the bottom right fo the field. */
  var areActionButtonsHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Set whether default stylings should be disabled when editing. */
  var disableEditViewFieldBase: js.UndefOr[scala.Boolean] = js.undefined
  /** Component to be shown when editing. Should be an @atlaskit/input. */
  var editView: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /** Component to be shown in an @atlaskit/inline-dialog when edit view is open. */
  var invalidMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /** Sets whether the confirm function is called when the input loses focus. */
  var isConfirmOnBlurDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Set whether the read view should fit width, most obvious when hovered. */
  var isFitContainerWidthReadView: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets yellow border with warning symbol at end of input. Removes confirm and cancel buttons. */
  var isInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /** Determine whether the label is shown. */
  var isLabelHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Greys out text and shows spinner. Does not disable input. */
  var isWaiting: js.UndefOr[scala.Boolean] = js.undefined
  /** Label above the input. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** html to pass down to the label htmlFor prop. */
  var labelHtmlFor: js.UndefOr[java.lang.String] = js.undefined
  /** Component to be shown when reading only */
  var readView: reactLib.reactMod.ReactNs.ReactElement[_]
  /** Set whether onConfirm is called on pressing enter. */
  var shouldConfirmOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** Handler called when the cross is clicked on. */
  def onCancel(): scala.Unit
  /** Handler called when checkmark is clicked. Also by default called when the input loses focus. */
  def onConfirm(): scala.Unit
}

object BaseProps {
  @scala.inline
  def apply(
    onCancel: () => scala.Unit,
    onConfirm: () => scala.Unit,
    readView: reactLib.reactMod.ReactNs.ReactElement[_],
    areActionButtonsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    disableEditViewFieldBase: js.UndefOr[scala.Boolean] = js.undefined,
    editView: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    invalidMessage: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    isConfirmOnBlurDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isFitContainerWidthReadView: js.UndefOr[scala.Boolean] = js.undefined,
    isInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    isLabelHidden: js.UndefOr[scala.Boolean] = js.undefined,
    isWaiting: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    labelHtmlFor: java.lang.String = null,
    shouldConfirmOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), readView = readView)
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
    __obj.asInstanceOf[BaseProps]
  }
}

