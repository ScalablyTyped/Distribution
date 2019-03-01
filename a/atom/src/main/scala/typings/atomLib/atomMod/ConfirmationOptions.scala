package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationOptions extends js.Object {
  /** The text for the buttons. */
  var buttons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  The index of the button to be used to cancel the dialog, via the `Esc` key.
    *  By default this is assigned to the first button with "cancel" or "no" as the
    *  label. If no such labeled buttons exist and this option is not set, 0 will be
    *  used as the return value or callback response.
    *
    *  This option is ignored on Windows.
    */
  var cancelId: js.UndefOr[scala.Double] = js.undefined
  /** Initial checked state of the checkbox. false by default. */
  var checkboxChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** If provided, the message box will include a checkbox with the given label. */
  var checkboxLabel: js.UndefOr[java.lang.String] = js.undefined
  /** The index for the button to be selected by default in the prompt. */
  var defaultId: js.UndefOr[scala.Double] = js.undefined
  /** Additional information regarding the message. */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /** An Electron NativeImage to use as the prompt's icon. */
  var icon: js.UndefOr[js.Object] = js.undefined
  /** The content of the message box. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  On Windows, Electron will try to figure out which one of the buttons are
    *  common buttons (like `Cancel` or `Yes`), and show the others as command links
    *  in the dialog. This can make the dialog appear in the style of modern Windows
    *  apps. If you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Normalize the keyboard access keys across platforms.
    * Atom defaults this to true.
    */
  var normalizeAccessKeys: js.UndefOr[scala.Boolean] = js.undefined
  /** The title for the prompt. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the confirmation prompt. */
  var `type`: js.UndefOr[
    atomLib.atomLibStrings.none | atomLib.atomLibStrings.info | atomLib.atomLibStrings.error | atomLib.atomLibStrings.question | atomLib.atomLibStrings.warning
  ] = js.undefined
}

object ConfirmationOptions {
  @scala.inline
  def apply(
    buttons: js.Array[java.lang.String] = null,
    cancelId: scala.Int | scala.Double = null,
    checkboxChecked: js.UndefOr[scala.Boolean] = js.undefined,
    checkboxLabel: java.lang.String = null,
    defaultId: scala.Int | scala.Double = null,
    detail: java.lang.String = null,
    icon: js.Object = null,
    message: java.lang.String = null,
    noLink: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeAccessKeys: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: atomLib.atomLibStrings.none | atomLib.atomLibStrings.info | atomLib.atomLibStrings.error | atomLib.atomLibStrings.question | atomLib.atomLibStrings.warning = null
  ): ConfirmationOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cancelId != null) __obj.updateDynamic("cancelId")(cancelId.asInstanceOf[js.Any])
    if (!js.isUndefined(checkboxChecked)) __obj.updateDynamic("checkboxChecked")(checkboxChecked)
    if (checkboxLabel != null) __obj.updateDynamic("checkboxLabel")(checkboxLabel)
    if (defaultId != null) __obj.updateDynamic("defaultId")(defaultId.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(noLink)) __obj.updateDynamic("noLink")(noLink)
    if (!js.isUndefined(normalizeAccessKeys)) __obj.updateDynamic("normalizeAccessKeys")(normalizeAccessKeys)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationOptions]
  }
}

