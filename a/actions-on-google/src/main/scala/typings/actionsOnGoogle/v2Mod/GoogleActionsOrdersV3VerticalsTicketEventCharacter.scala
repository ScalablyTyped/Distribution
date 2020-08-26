package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsTicketEventCharacter extends js.Object {
  /**
    * Character's images.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Name of the character.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of the event character, e.g. actor or director.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketEventCharacterType] = js.native
}

object GoogleActionsOrdersV3VerticalsTicketEventCharacter {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsTicketEventCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketEventCharacter]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsTicketEventCharacterOps[Self <: GoogleActionsOrdersV3VerticalsTicketEventCharacter] (val x: Self) extends AnyVal {
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
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsTicketEventCharacterType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

