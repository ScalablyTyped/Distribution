package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsLinkOutSuggestion extends js.Object {
  /**
    * The name of the app or site this chip is linking to. The chip will be
    * rendered with the title \"Open <destination_name>\". Max 20 chars.
    * Required.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  /**
    * The URL of the App or Site to open when the user taps the suggestion chip.
    * Ownership of this App/URL must be validated in the Actions on Google
    * developer  console, or the suggestion will not be shown to the user.
    * Open URL Action supports http, https and intent URLs.
    * For Intent URLs refer to:
    * https://developer.chrome.com/multidevice/android/intents
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  /**
    * Deprecated. Use OpenUrlAction instead.
    */
  var url: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsLinkOutSuggestion {
  @scala.inline
  def apply(
    destinationName: String = null,
    openUrlAction: GoogleActionsV2UiElementsOpenUrlAction = null,
    url: String = null
  ): GoogleActionsV2UiElementsLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsLinkOutSuggestion]
  }
}

