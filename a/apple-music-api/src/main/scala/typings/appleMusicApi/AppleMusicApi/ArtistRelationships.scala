package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
@js.native
trait ArtistRelationships extends StObject {
  
  var albums: Relationship[Album] = js.native
  
  var genres: js.UndefOr[Relationship[Genre]] = js.native
}
object ArtistRelationships {
  
  @scala.inline
  def apply(albums: Relationship[Album]): ArtistRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistRelationships]
  }
  
  @scala.inline
  implicit class ArtistRelationshipsMutableBuilder[Self <: ArtistRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbums(value: Relationship[Album]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenres(value: Relationship[Genre]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
  }
}
