package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsTicketEventCharacter extends StObject {
  
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
  implicit class GoogleActionsOrdersV3VerticalsTicketEventCharacterMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsTicketEventCharacter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsTicketEventCharacterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
