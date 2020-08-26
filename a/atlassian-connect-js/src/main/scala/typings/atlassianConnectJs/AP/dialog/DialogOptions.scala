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

@js.native
trait DialogOptions extends js.Object {
  /**
    * (optional) an array of custom buttons to be added to the dialog if opening a dialog with chrome.
    */
  var buttons: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * (optional) text for the cancel button if opening a dialog with chrome.
    */
  var cancelText: js.UndefOr[String] = js.native
  /**
    * (optional) opens the dialog with heading and buttons.
    */
  var chrome: js.UndefOr[Boolean] = js.native
  /**
    * (optional) if true, pressing ESC inside the dialog will close the dialog (default is true).
    */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /**
    * (optional) custom data object that can be accessed from the actual dialog iFrame.
    */
  var customData: js.UndefOr[js.Object] = js.native
  /**
    * (optional) text to display in the header if opening a dialog with chrome.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * if size is not set, define the height as a percentage (append a % to the number) or pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (optional) Suggested actions or helpful info that will be added to the dialog if opening with chrome.
    */
  var hint: js.UndefOr[String] = js.native
  /**
    * The module key of a dialog, or the key of a page or web-item that you want to open as a dialog.
    */
  var key: String = js.native
  /**
    * Opens the dialog at a preset size: small, medium, large, x-large or fullscreen (with chrome).
    */
  var size: js.UndefOr[small | medium | large | `x-large` | fullscreen] = js.native
  /**
    * (optional) text for the submit button if opening a dialog with chrome.
    */
  var submitText: js.UndefOr[String] = js.native
  /**
    * if size is not set, define the width as a percentage (append a % to the number) or pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(key: String): DialogOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonsVarargs(value: Identifier*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[Identifier]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    @scala.inline
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large | `x-large` | fullscreen): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSubmitText(value: String): Self = this.set("submitText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitText: Self = this.set("submitText", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

