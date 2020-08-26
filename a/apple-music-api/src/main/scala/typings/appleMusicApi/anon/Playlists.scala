package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Playlist
import typings.appleMusicApi.AppleMusicApi.Relationship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playlists extends js.Object {
  var playlists: js.UndefOr[Relationship[Playlist]] = js.native
}

object Playlists {
  @scala.inline
  def apply(): Playlists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Playlists]
  }
  @scala.inline
  implicit class PlaylistsOps[Self <: Playlists] (val x: Self) extends AnyVal {
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
    def setPlaylists(value: Relationship[Playlist]): Self = this.set("playlists", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylists: Self = this.set("playlists", js.undefined)
  }
  
}

