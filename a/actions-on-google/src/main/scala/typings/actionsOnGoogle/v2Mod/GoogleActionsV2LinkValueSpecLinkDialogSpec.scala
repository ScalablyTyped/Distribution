package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2LinkValueSpecLinkDialogSpec extends js.Object {
  /**
    * The name of the app or site this request wishes to linking to.
    * The TTS will be created with the title \"Open <destination_name>\". Also
    * used during confirmation, \"Can I send you to <destination_name>?\" If we
    * know the actual title of the link that is being handed off to, we will
    * ignore this field and use the appropriate title.
    * Max 20 chars.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * A string that is added to the end of the confirmation prompt to explain
    * why we need to link out. Example: \"navigate to pick up your coffee?\" This
    * can be appended to the confirmation prompt like \"Can I send you to Google
    * Maps to navigate to pick up your coffee?\"
    */
  var requestLinkReason: js.UndefOr[String] = js.native
}

object GoogleActionsV2LinkValueSpecLinkDialogSpec {
  @scala.inline
  def apply(): GoogleActionsV2LinkValueSpecLinkDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpecLinkDialogSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2LinkValueSpecLinkDialogSpecOps[Self <: GoogleActionsV2LinkValueSpecLinkDialogSpec] (val x: Self) extends AnyVal {
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
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setRequestLinkReason(value: String): Self = this.set("requestLinkReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestLinkReason: Self = this.set("requestLinkReason", js.undefined)
  }
  
}

