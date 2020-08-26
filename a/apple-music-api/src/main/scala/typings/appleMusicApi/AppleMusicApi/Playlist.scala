package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.appleMusicApiStrings.playlists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/playlist
@js.native
trait Playlist extends Resource {
  var attributes: js.UndefOr[typings.appleMusicApi.anon.Artwork] = js.native
  var relationships: js.UndefOr[typings.appleMusicApi.anon.Curator] = js.native
  @JSName("type")
  var type_Playlist: playlists = js.native
}

object Playlist {
  @scala.inline
  def apply(id: String, `type`: playlists): Playlist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlist]
  }
  @scala.inline
  implicit class PlaylistOps[Self <: Playlist] (val x: Self) extends AnyVal {
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
    def setType(value: playlists): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: typings.appleMusicApi.anon.Artwork): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRelationships(value: typings.appleMusicApi.anon.Curator): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
  
}

