package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.appleMusicApiStrings.stations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/station
trait Station extends Resource {
  var artwork: Artwork
  var durationInMillis: js.UndefOr[Double] = js.undefined
  var editorialNotes: js.UndefOr[EditorialNotes] = js.undefined
  var episodeNumber: js.UndefOr[Double] = js.undefined
  var isLive: Boolean
  var name: String
  @JSName("type")
  var type_Station: stations
  var url: String
}

object Station {
  @scala.inline
  def apply(
    artwork: Artwork,
    id: String,
    isLive: Boolean,
    name: String,
    `type`: stations,
    url: String,
    durationInMillis: js.UndefOr[Double] = js.undefined,
    editorialNotes: EditorialNotes = null,
    episodeNumber: js.UndefOr[Double] = js.undefined,
    href: String = null
  ): Station = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLive = isLive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(durationInMillis)) __obj.updateDynamic("durationInMillis")(durationInMillis.get.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(episodeNumber)) __obj.updateDynamic("episodeNumber")(episodeNumber.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
}

