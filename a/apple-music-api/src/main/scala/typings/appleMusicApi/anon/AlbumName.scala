package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Artwork
import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.AppleMusicApi.Preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumName extends js.Object {
  var albumName: String
  var artistName: String
  var artwork: js.UndefOr[Artwork] = js.undefined
  var composerName: js.UndefOr[String] = js.undefined
  var contentRating: js.UndefOr[String] = js.undefined
  var discNumber: Double
  var durationInMillis: Double
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
  var genreNames: js.Array[String]
  var hasLyrics: Boolean
  var isrc: String
  var movementCount: js.UndefOr[Double] = js.undefined
  var movementName: js.UndefOr[String] = js.undefined
  var movementNumber: js.UndefOr[String] = js.undefined
  var name: String
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  var previews: js.Array[Preview]
  var releaseDate: String
  var trackNumber: Double
  var url: String
  var workName: js.UndefOr[String] = js.undefined
}

object AlbumName {
  @scala.inline
  def apply(
    albumName: String,
    artistName: String,
    discNumber: Double,
    durationInMillis: Double,
    genreNames: js.Array[String],
    hasLyrics: Boolean,
    isrc: String,
    name: String,
    previews: js.Array[Preview],
    releaseDate: String,
    trackNumber: Double,
    url: String,
    artwork: Artwork = null,
    composerName: String = null,
    contentRating: String = null,
    editorialNotes: typings.appleMusicApi.AppleMusicApi.EditorialNotes = null,
    movementCount: js.UndefOr[Double] = js.undefined,
    movementName: String = null,
    movementNumber: String = null,
    playParams: PlayParameters = null,
    workName: String = null
  ): AlbumName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (composerName != null) __obj.updateDynamic("composerName")(composerName.asInstanceOf[js.Any])
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(movementCount)) __obj.updateDynamic("movementCount")(movementCount.get.asInstanceOf[js.Any])
    if (movementName != null) __obj.updateDynamic("movementName")(movementName.asInstanceOf[js.Any])
    if (movementNumber != null) __obj.updateDynamic("movementNumber")(movementNumber.asInstanceOf[js.Any])
    if (playParams != null) __obj.updateDynamic("playParams")(playParams.asInstanceOf[js.Any])
    if (workName != null) __obj.updateDynamic("workName")(workName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumName]
  }
}

