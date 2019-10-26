package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`3`
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageImage
  extends DialogflowV1BaseMessage[`3`]
     with DialogflowV1Message {
  var imageUrl: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageImage {
  @scala.inline
  def apply(
    imageUrl: String = null,
    platform: facebook | kik | line | skype | slack | telegram | viber = null,
    `type`: `3` = null,
    url: String = null
  ): DialogflowV1MessageImage = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DialogflowV1MessageImage]
  }
}

