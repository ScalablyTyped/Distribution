package typings.appleDashMusicDashApi.AppleMusicApi

import typings.appleDashMusicDashApi.Anon_AlbumNameArtistName
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.albums
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/album
trait Album extends Resource {
  // https://developer.apple.com/documentation/applemusicapi/album/attributes
  var attributes: js.UndefOr[Anon_AlbumNameArtistName] = js.undefined
  var relationships: js.UndefOr[AlbumRelationships] = js.undefined
  @JSName("type")
  var type_Album: albums
}

object Album {
  @scala.inline
  def apply(
    id: String,
    `type`: albums,
    attributes: Anon_AlbumNameArtistName = null,
    href: String = null,
    relationships: AlbumRelationships = null
  ): Album = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
}

