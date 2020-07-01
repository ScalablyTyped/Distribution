package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.appleMusicApiStrings.playlists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/playlist
trait Playlist extends Resource {
  var attributes: js.UndefOr[typings.appleMusicApi.anon.Artwork] = js.undefined
  var relationships: js.UndefOr[typings.appleMusicApi.anon.Curator] = js.undefined
  @JSName("type")
  var type_Playlist: playlists
}

object Playlist {
  @scala.inline
  def apply(
    id: String,
    `type`: playlists,
    attributes: typings.appleMusicApi.anon.Artwork = null,
    href: String = null,
    relationships: typings.appleMusicApi.anon.Curator = null
  ): Playlist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlist]
  }
}

