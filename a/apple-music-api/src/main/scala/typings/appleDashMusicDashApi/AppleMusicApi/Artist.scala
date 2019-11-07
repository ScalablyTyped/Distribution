package typings.appleDashMusicDashApi.AppleMusicApi

import typings.appleDashMusicDashApi.Anon_EditorialNotes
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.artists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist
trait Artist extends Resource {
  var attributes: js.UndefOr[Anon_EditorialNotes] = js.undefined
  var relationships: js.UndefOr[ArtistRelationships] = js.undefined
  @JSName("type")
  var type_Artist: artists
}

object Artist {
  @scala.inline
  def apply(
    id: String,
    `type`: artists,
    attributes: Anon_EditorialNotes = null,
    href: String = null,
    relationships: ArtistRelationships = null
  ): Artist = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (href != null) __obj.updateDynamic("href")(href)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[Artist]
  }
}

