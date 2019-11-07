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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (href != null) __obj.updateDynamic("href")(href)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[Song]
  }
}

