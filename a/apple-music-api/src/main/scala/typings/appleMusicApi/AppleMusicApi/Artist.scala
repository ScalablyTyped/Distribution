package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.appleMusicApiStrings.artists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artist
@js.native
trait Artist extends Resource {
  
  var attributes: js.UndefOr[typings.appleMusicApi.anon.EditorialNotes] = js.native
  
  var relationships: js.UndefOr[ArtistRelationships] = js.native
  
  @JSName("type")
  var type_Artist: artists = js.native
}
object Artist {
  
  @scala.inline
  def apply(id: String, `type`: artists): Artist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
  
  @scala.inline
  implicit class ArtistMutableBuilder[Self <: Artist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: typings.appleMusicApi.anon.EditorialNotes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: ArtistRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: artists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
