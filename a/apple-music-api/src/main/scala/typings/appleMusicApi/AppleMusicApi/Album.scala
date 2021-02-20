package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.ArtistName
import typings.appleMusicApi.appleMusicApiStrings.albums
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/album
@js.native
trait Album extends Resource {
  
  // https://developer.apple.com/documentation/applemusicapi/album/attributes
  var attributes: js.UndefOr[ArtistName] = js.native
  
  var relationships: js.UndefOr[AlbumRelationships] = js.native
  
  @JSName("type")
  var type_Album: albums = js.native
}
object Album {
  
  @scala.inline
  def apply(id: String, `type`: albums): Album = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  @scala.inline
  implicit class AlbumMutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ArtistName): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: AlbumRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: albums): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
