package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/song/relationships
@js.native
trait SongRelationships extends js.Object {
  
  var albums: Relationship[Album] = js.native
  
  var artists: Relationship[Artist] = js.native
  
  var genres: js.UndefOr[Relationship[Genre]] = js.native
  
  var station: js.UndefOr[Data] = js.native
}
object SongRelationships {
  
  @scala.inline
  def apply(albums: Relationship[Album], artists: Relationship[Artist]): SongRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongRelationships]
  }
  
  @scala.inline
  implicit class SongRelationshipsOps[Self <: SongRelationships] (val x: Self) extends AnyVal {
    
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
    def setAlbums(value: Relationship[Album]): Self = this.set("albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtists(value: Relationship[Artist]): Self = this.set("artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenres(value: Relationship[Genre]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
    
    @scala.inline
    def setStation(value: Data): Self = this.set("station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStation: Self = this.set("station", js.undefined)
  }
}
