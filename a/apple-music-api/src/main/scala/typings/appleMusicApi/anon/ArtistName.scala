package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Artwork
import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.appleMusicApiStrings.clean
import typings.appleMusicApi.appleMusicApiStrings.explicit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtistName extends js.Object {
  // albumName might not actually be a required attribute of Album.
  // There may be a typo in Apple's documentation, their data doesn't
  // actually return this attribute for the example I picked and the description of the field references music videos, further increasingly the likelihood that it's just a typo):
  var albumName: js.UndefOr[String] = js.undefined
  var artistName: String
  var artwork: js.UndefOr[Artwork] = js.undefined
  var contentRating: js.UndefOr[clean | explicit] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
  var genreNames: js.Array[String]
  var isCompilation: Boolean
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

object ArtistName {
  @scala.inline
  def apply(
    artistName: String,
    genreNames: js.Array[String],
    isCompilation: Boolean,
    isComplete: Boolean,
    isMasteredForItunes: Boolean,
    isSingle: Boolean,
    name: String,
    recordLabel: String,
    releaseDate: String,
    trackCount: Double,
    url: String,
    albumName: String = null,
    artwork: Artwork = null,
    contentRating: clean | explicit = null,
    copyright: String = null,
    editorialNotes: typings.appleMusicApi.AppleMusicApi.EditorialNotes = null,
    playParams: PlayParameters = null
  ): ArtistName = {
    val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (albumName != null) __obj.updateDynamic("albumName")(albumName.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    if (playParams != null) __obj.updateDynamic("playParams")(playParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistName]
  }
}

