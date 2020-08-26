package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist/relationships
@js.native
trait ArtistRelationships extends js.Object {
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
  implicit class ArtistRelationshipsOps[Self <: ArtistRelationships] (val x: Self) extends AnyVal {
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
    def setGenres(value: Relationship[Genre]): Self = this.set("genres", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
  }
  
}

