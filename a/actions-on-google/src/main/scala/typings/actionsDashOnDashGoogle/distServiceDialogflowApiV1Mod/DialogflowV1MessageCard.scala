package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`1`
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

trait DialogflowV1MessageCard
  extends DialogflowV1BaseMessage[`1`]
     with DialogflowV1Message {
  var buttons: js.UndefOr[js.Array[DialogflowV1Button]] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageCard {
  @scala.inline
  def apply(
    buttons: js.Array[DialogflowV1Button] = null,
    imageUrl: String = null,
    platform: facebook | kik | line | skype | slack | telegram | viber = null,
    subtitle: String = null,
    title: String = null,
    `type`: `1` = null
  ): DialogflowV1MessageCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageCard]
  }
}

