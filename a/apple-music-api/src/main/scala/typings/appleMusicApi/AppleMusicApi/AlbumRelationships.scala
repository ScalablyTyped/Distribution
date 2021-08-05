package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/album/relationships
trait AlbumRelationships extends StObject {
  
  var artists: Relationship[Artist]
  
  var genres: js.UndefOr[Relationship[Genre]] = js.undefined
  
  var tracks: Relationship[Song]
}
object AlbumRelationships {
  
  inline def apply(artists: Relationship[Artist], tracks: Relationship[Song]): AlbumRelationships = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumRelationships]
  }
  
  extension [Self <: AlbumRelationships](x: Self) {
    
    inline def setArtists(value: Relationship[Artist]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    inline def setGenres(value: Relationship[Genre]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    inline def setTracks(value: Relationship[Song]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
