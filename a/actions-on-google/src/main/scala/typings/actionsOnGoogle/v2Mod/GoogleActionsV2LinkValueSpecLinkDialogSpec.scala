package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2LinkValueSpecLinkDialogSpec extends js.Object {
  /**
    * The name of the app or site this request wishes to linking to.
    * The TTS will be created with the title \"Open <destination_name>\". Also
    * used during confirmation, \"Can I send you to <destination_name>?\" If we
    * know the actual title of the link that is being handed off to, we will
    * ignore this field and use the appropriate title.
    * Max 20 chars.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  /**
    * A string that is added to the end of the confirmation prompt to explain
    * why we need to link out. Example: \"navigate to pick up your coffee?\" This
    * can be appended to the confirmation prompt like \"Can I send you to Google
    * Maps to navigate to pick up your coffee?\"
    */
  var requestLinkReason: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2LinkValueSpecLinkDialogSpec {
  @scala.inline
  def apply(destinationName: String = null, requestLinkReason: String = null): GoogleActionsV2LinkValueSpecLinkDialogSpec = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (requestLinkReason != null) __obj.updateDynamic("requestLinkReason")(requestLinkReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpecLinkDialogSpec]
  }
}

