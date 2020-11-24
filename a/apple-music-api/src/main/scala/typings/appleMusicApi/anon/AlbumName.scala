package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.AppleMusicApi.Preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlbumName extends js.Object {
  
  var albumName: String = js.native
  
  var artistName: String = js.native
  
  var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
  
  var composerName: js.UndefOr[String] = js.native
  
  var contentRating: js.UndefOr[String] = js.native
  
  var discNumber: Double = js.native
  
  var durationInMillis: Double = js.native
  
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
  
  var genreNames: js.Array[String] = js.native
  
  var hasLyrics: Boolean = js.native
  
  var isrc: String = js.native
  
  var movementCount: js.UndefOr[Double] = js.native
  
  var movementName: js.UndefOr[String] = js.native
  
  var movementNumber: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var playParams: js.UndefOr[PlayParameters] = js.native
  
  var previews: js.Array[Preview] = js.native
  
  var releaseDate: String = js.native
  
  var trackNumber: Double = js.native
  
  var url: String = js.native
  
  var workName: js.UndefOr[String] = js.native
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
    url: String
  ): AlbumName = {
    val __obj = js.Dynamic.literal(albumName = albumName.asInstanceOf[js.Any], artistName = artistName.asInstanceOf[js.Any], discNumber = discNumber.asInstanceOf[js.Any], durationInMillis = durationInMillis.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], hasLyrics = hasLyrics.asInstanceOf[js.Any], isrc = isrc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumName]
  }
  
  @scala.inline
  implicit class AlbumNameOps[Self <: AlbumName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlbumName(value: String): Self = this.set("albumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistName(value: String): Self = this.set("artistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscNumber(value: Double): Self = this.set("discNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMillis(value: Double): Self = this.set("durationInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreNamesVarargs(value: String*): Self = this.set("genreNames", js.Array(value :_*))
    
    @scala.inline
    def setGenreNames(value: js.Array[String]): Self = this.set("genreNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLyrics(value: Boolean): Self = this.set("hasLyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsrc(value: String): Self = this.set("isrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewsVarargs(value: Preview*): Self = this.set("previews", js.Array(value :_*))
    
    @scala.inline
    def setPreviews(value: js.Array[Preview]): Self = this.set("previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNumber(value: Double): Self = this.set("trackNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = this.set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
    
    @scala.inline
    def setComposerName(value: String): Self = this.set("composerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposerName: Self = this.set("composerName", js.undefined)
    
    @scala.inline
    def setContentRating(value: String): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRating: Self = this.set("contentRating", js.undefined)
    
    @scala.inline
    def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = this.set("editorialNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorialNotes: Self = this.set("editorialNotes", js.undefined)
    
    @scala.inline
    def setMovementCount(value: Double): Self = this.set("movementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovementCount: Self = this.set("movementCount", js.undefined)
    
    @scala.inline
    def setMovementName(value: String): Self = this.set("movementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovementName: Self = this.set("movementName", js.undefined)
    
    @scala.inline
    def setMovementNumber(value: String): Self = this.set("movementNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovementNumber: Self = this.set("movementNumber", js.undefined)
    
    @scala.inline
    def setPlayParams(value: PlayParameters): Self = this.set("playParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayParams: Self = this.set("playParams", js.undefined)
    
    @scala.inline
    def setWorkName(value: String): Self = this.set("workName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkName: Self = this.set("workName", js.undefined)
  }
}
