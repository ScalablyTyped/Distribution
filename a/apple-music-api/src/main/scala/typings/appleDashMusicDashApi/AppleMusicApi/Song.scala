package typings.appleDashMusicDashApi.AppleMusicApi

import typings.appleDashMusicDashApi.Anon_AlbumName
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.songs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/song
trait Song extends Resource {
  // https://developer.apple.com/documentation/applemusicapi/song/attributes
  var attributes: js.UndefOr[Anon_AlbumName] = js.undefined
  var relationships: js.UndefOr[SongRelationships] = js.undefined
  @JSName("type")
  var type_Song: songs
}

object Song {
  @scala.inline
  def apply(
    id: String,
    `type`: songs,
    attributes: Anon_AlbumName = null,
    href: String = null,
    relationships: SongRelationships = null
  ): Song = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
}

