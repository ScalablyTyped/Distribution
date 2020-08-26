package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.ArtistName
import typings.appleMusicApi.appleMusicApiStrings.albums
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
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
    def setType(value: albums): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: ArtistName): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRelationships(value: AlbumRelationships): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
  
}

