package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2MediaObject extends StObject {
  
  /**
    * The url pointing to the media content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * Description of this media object.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A small image icon displayed on the right from the title.
    * It's resized to 36x36 dp.
    */
  var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * A large image, such as the cover of the album, etc.
    */
  var largeImage: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Name of this media object.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleActionsV2MediaObject {
  
  @scala.inline
  def apply(): GoogleActionsV2MediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaObject]
  }
  
  @scala.inline
  implicit class GoogleActionsV2MediaObjectMutableBuilder[Self <: GoogleActionsV2MediaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIcon(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLargeImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "largeImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeImageUndefined: Self = StObject.set(x, "largeImage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
