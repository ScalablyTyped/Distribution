package typings.atom.mod

import typings.atom.atomStrings.error
import typings.atom.atomStrings.info
import typings.atom.atomStrings.none
import typings.atom.atomStrings.question
import typings.atom.atomStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmationOptions extends js.Object {
  /** The text for the buttons. */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  /**
    *  The index of the button to be used to cancel the dialog, via the `Esc` key.
    *  By default this is assigned to the first button with "cancel" or "no" as the
    *  label. If no such labeled buttons exist and this option is not set, 0 will be
    *  used as the return value or callback response.
    *
    *  This option is ignored on Windows.
    */
  var cancelId: js.UndefOr[Double] = js.native
  /** Initial checked state of the checkbox. false by default. */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  /** If provided, the message box will include a checkbox with the given label. */
  var checkboxLabel: js.UndefOr[String] = js.native
  /** The index for the button to be selected by default in the prompt. */
  var defaultId: js.UndefOr[Double] = js.native
  /** Additional information regarding the message. */
  var detail: js.UndefOr[String] = js.native
  /** An Electron NativeImage to use as the prompt's icon. */
  var icon: js.UndefOr[js.Object] = js.native
  /** The content of the message box. */
  var message: js.UndefOr[String] = js.native
  /**
    *  On Windows, Electron will try to figure out which one of the buttons are
    *  common buttons (like `Cancel` or `Yes`), and show the others as command links
    *  in the dialog. This can make the dialog appear in the style of modern Windows
    *  apps. If you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  /**
    * Normalize the keyboard access keys across platforms.
    * Atom defaults this to true.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  /** The title for the prompt. */
  var title: js.UndefOr[String] = js.native
  /** The type of the confirmation prompt. */
  var `type`: js.UndefOr[none | info | error | question | warning] = js.native
}

object ConfirmationOptions {
  @scala.inline
  def apply(): ConfirmationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmationOptions]
  }
  @scala.inline
  implicit class ConfirmationOptionsOps[Self <: ConfirmationOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: String*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCancelId(value: Double): Self = this.set("cancelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelId: Self = this.set("cancelId", js.undefined)
    @scala.inline
    def setCheckboxChecked(value: Boolean): Self = this.set("checkboxChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxChecked: Self = this.set("checkboxChecked", js.undefined)
    @scala.inline
    def setCheckboxLabel(value: String): Self = this.set("checkboxLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxLabel: Self = this.set("checkboxLabel", js.undefined)
    @scala.inline
    def setDefaultId(value: Double): Self = this.set("defaultId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultId: Self = this.set("defaultId", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setIcon(value: js.Object): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setNoLink(value: Boolean): Self = this.set("noLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLink: Self = this.set("noLink", js.undefined)
    @scala.inline
    def setNormalizeAccessKeys(value: Boolean): Self = this.set("normalizeAccessKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeAccessKeys: Self = this.set("normalizeAccessKeys", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: none | info | error | question | warning): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

