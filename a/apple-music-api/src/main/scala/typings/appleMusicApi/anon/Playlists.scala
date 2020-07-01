package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Playlist
import typings.appleMusicApi.AppleMusicApi.Relationship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playlists extends js.Object {
  var playlists: js.UndefOr[Relationship[Playlist]] = js.undefined
}

object Playlists {
  @scala.inline
  def apply(playlists: Relationship[Playlist] = null): Playlists = {
    val __obj = js.Dynamic.literal()
    if (playlists != null) __obj.updateDynamic("playlists")(playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlists]
  }
}

