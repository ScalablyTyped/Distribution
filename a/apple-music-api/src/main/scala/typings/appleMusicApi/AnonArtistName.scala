package typings.appleMusicApi

import typings.appleMusicApi.AppleMusicApi.Artwork
import typings.appleMusicApi.AppleMusicApi.EditorialNotes
import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.appleMusicApiStrings.clean
import typings.appleMusicApi.appleMusicApiStrings.explicit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtistName extends js.Object {
  var albumName: String
  var artistName: String
  var artwork: js.UndefOr[Artwork] = js.undefined
  var contentRating: js.UndefOr[clean | explicit] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var editorialNotes: js.UndefOr[EditorialNotes] = js.undefined
  var genreNames: js.Array[String]
  var isComplete: Boolean
  var isMasteredForItunes: Boolean
  var isSingle: Boolean
  var name: String
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  var recordLabel: String
  var releaseDate: String
  var trackCount: Double
  var url: String
}

object AnonArtistName {
  @scala.inline
  def apply(
    albumName: String,
    artistName: String,
    genreNames: js.Array[String],
    isComplete: Boolean,
    isMasteredForItunes: Boolean,
    isSingle: Boolean,
    name: String,
    recordLabel: String,
    releaseDate: String,
    trackCount: Double,
    url: String,
    artwork: Artwork = null,
    contentRating: clean | explicit = null,
    copyright: String = null,
    editorialNotes: EditorialNotes = null,
    playParams: PlayParameters = null
  ): AnonArtistName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    if (playParams != null) __obj.updateDynamic("playParams")(playParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArtistName]
  }
}

