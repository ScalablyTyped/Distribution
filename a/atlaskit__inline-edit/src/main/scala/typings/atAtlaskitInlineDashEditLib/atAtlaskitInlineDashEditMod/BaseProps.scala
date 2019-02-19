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

