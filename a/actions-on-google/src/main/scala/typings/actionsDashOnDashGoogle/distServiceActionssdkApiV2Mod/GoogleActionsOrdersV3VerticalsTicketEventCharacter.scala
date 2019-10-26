package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsTicketEventCharacter extends js.Object {
  /**
    * Character's images.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Name of the character.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Type of the event character, e.g. actor or director.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketEventCharacterType] = js.undefined
}

object GoogleActionsOrdersV3VerticalsTicketEventCharacter {
  @scala.inline
  def apply(
    image: GoogleActionsV2UiElementsImage = null,
    name: String = null,
    `type`: GoogleActionsOrdersV3VerticalsTicketEventCharacterType = null
  ): GoogleActionsOrdersV3VerticalsTicketEventCharacter = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketEventCharacter]
  }
}

