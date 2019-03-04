package typings
package atAtlaskitInlineDashEditLib.atAtlaskitInlineDashEditMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends BaseProps {
  /** Whether the component shows the readView or the editView. */
  var isEditing: scala.Boolean
  /** Handler called when the wrapper or the label are clicked. */
  def onEditRequested(): scala.Unit
}

object StatelessProps {
  @scala.inline
  def apply(
    isEditing: scala.Boolean,
    onCancel: js.Function0[scala.Unit],
    onConfirm: js.Function0[scala.Unit],
    onEditRequested: js.Function0[scala.Unit],
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
  ): StatelessProps = {
    val __obj = js.Dynamic.literal(isEditing = isEditing, onCancel = onCancel, onConfirm = onConfirm, onEditRequested = onEditRequested, readView = readView)
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

