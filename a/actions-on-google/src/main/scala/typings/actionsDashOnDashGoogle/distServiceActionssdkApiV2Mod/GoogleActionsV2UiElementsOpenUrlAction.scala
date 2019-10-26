package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsOpenUrlAction extends js.Object {
  /**
    * Information about the Android App if the URL is expected to be
    * fulfilled by an Android App.
    */
  var androidApp: js.UndefOr[GoogleActionsV2DevicesAndroidApp] = js.undefined
  /**
    * The url field which could be any of:
    * - http/https urls for opening an App-linked App or a webpage
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Indicates a hint for the url type.
    */
  var urlTypeHint: js.UndefOr[GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint] = js.undefined
}

object GoogleActionsV2UiElementsOpenUrlAction {
  @scala.inline
  def apply(
    androidApp: GoogleActionsV2DevicesAndroidApp = null,
    url: String = null,
    urlTypeHint: GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint = null
  ): GoogleActionsV2UiElementsOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    if (androidApp != null) __obj.updateDynamic("androidApp")(androidApp)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlTypeHint != null) __obj.updateDynamic("urlTypeHint")(urlTypeHint)
    __obj.asInstanceOf[GoogleActionsV2UiElementsOpenUrlAction]
  }
}

