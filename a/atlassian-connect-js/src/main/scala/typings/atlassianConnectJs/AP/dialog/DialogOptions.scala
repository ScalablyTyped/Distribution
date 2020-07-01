package typings.atlassianConnectJs.AP.dialog

import typings.atlassianConnectJs.anon.Identifier
import typings.atlassianConnectJs.atlassianConnectJsStrings.`x-large`
import typings.atlassianConnectJs.atlassianConnectJsStrings.fullscreen
import typings.atlassianConnectJs.atlassianConnectJsStrings.large
import typings.atlassianConnectJs.atlassianConnectJsStrings.medium
import typings.atlassianConnectJs.atlassianConnectJsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOptions extends js.Object {
  /**
    * (optional) an array of custom buttons to be added to the dialog if opening a dialog with chrome.
    */
  var buttons: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * (optional) text for the cancel button if opening a dialog with chrome.
    */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
    * (optional) opens the dialog with heading and buttons.
    */
  var chrome: js.UndefOr[Boolean] = js.undefined
  /**
    * (optional) if true, pressing ESC inside the dialog will close the dialog (default is true).
    */
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  /**
    * (optional) custom data object that can be accessed from the actual dialog iFrame.
    */
  var customData: js.UndefOr[js.Object] = js.undefined
  /**
    * (optional) text to display in the header if opening a dialog with chrome.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * if size is not set, define the height as a percentage (append a % to the number) or pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (optional) Suggested actions or helpful info that will be added to the dialog if opening with chrome.
    */
  var hint: js.UndefOr[String] = js.undefined
  /**
    * The module key of a dialog, or the key of a page or web-item that you want to open as a dialog.
    */
  var key: String
  /**
    * Opens the dialog at a preset size: small, medium, large, x-large or fullscreen (with chrome).
    */
  var size: js.UndefOr[small | medium | large | `x-large` | fullscreen] = js.undefined
  /**
    * (optional) text for the submit button if opening a dialog with chrome.
    */
  var submitText: js.UndefOr[String] = js.undefined
  /**
    * if size is not set, define the width as a percentage (append a % to the number) or pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object DialogOptions {
  @scala.inline
  def apply(
    key: String,
    buttons: js.Array[Identifier] = null,
    cancelText: String = null,
    chrome: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    customData: js.Object = null,
    header: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hint: String = null,
    size: small | medium | large | `x-large` | fullscreen = null,
    submitText: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): DialogOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (!js.isUndefined(chrome)) __obj.updateDynamic("chrome")(chrome.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (submitText != null) __obj.updateDynamic("submitText")(submitText.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
}

