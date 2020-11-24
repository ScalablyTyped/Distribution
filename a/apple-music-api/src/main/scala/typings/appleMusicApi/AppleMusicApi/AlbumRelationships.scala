package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/album/relationships
@js.native
trait AlbumRelationships extends js.Object {
  
  var artists: Relationship[Artist] = js.native
  
  var genres: js.UndefOr[Relationship[Genre]] = js.native
  
  var tracks: Relationship[Song] = js.native
}
object AlbumRelationships {
  
  @scala.inline
  def apply(artists: Relationship[Artist], tracks: Relationship[Song]): AlbumRelationships = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumRelationships]
  }
  
  @scala.inline
  implicit class AlbumRelationshipsOps[Self <: AlbumRelationships] (val x: Self) extends AnyVal {
    
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
    def setArtists(value: Relationship[Artist]): Self = this.set("artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: Relationship[Song]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenres(value: Relationship[Genre]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
  }
}
