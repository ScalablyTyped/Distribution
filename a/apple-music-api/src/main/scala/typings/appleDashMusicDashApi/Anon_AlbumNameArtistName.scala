package typings.appleDashMusicDashApi

import typings.appleDashMusicDashApi.AppleMusicApi.Artwork
import typings.appleDashMusicDashApi.AppleMusicApi.EditorialNotes
import typings.appleDashMusicDashApi.AppleMusicApi.PlayParameters
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.clean
import typings.appleDashMusicDashApi.appleDashMusicDashApiStrings.explicit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlbumNameArtistName extends js.Object {
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

object Anon_AlbumNameArtistName {
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
  ): Anon_AlbumNameArtistName = {
    val __obj = js.Dynamic.literal(albumName = albumName, artistName = artistName, genreNames = genreNames, isComplete = isComplete, isMasteredForItunes = isMasteredForItunes, isSingle = isSingle, name = name, recordLabel = recordLabel, releaseDate = releaseDate, trackCount = trackCount, url = url)
    if (artwork != null) __obj.updateDynamic("artwork")(artwork)
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes)
    if (playParams != null) __obj.updateDynamic("playParams")(playParams)
    __obj.asInstanceOf[Anon_AlbumNameArtistName]
  }
}

