package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.appleMusicApiStrings.clean
import typings.appleMusicApi.appleMusicApiStrings.explicit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtistName extends js.Object {
  
  // albumName might not actually be a required attribute of Album.
  // There may be a typo in Apple's documentation, their data doesn't
  // actually return this attribute for the example I picked and the description of the field references music videos, further increasingly the likelihood that it's just a typo):
  var albumName: js.UndefOr[String] = js.native
  
  var artistName: String = js.native
  
  var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
  
  var contentRating: js.UndefOr[clean | explicit] = js.native
  
  var copyright: js.UndefOr[String] = js.native
  
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
  
  var genreNames: js.Array[String] = js.native
  
  var isCompilation: Boolean = js.native
  
  var isComplete: Boolean = js.native
  
  var isMasteredForItunes: Boolean = js.native
  
  var isSingle: Boolean = js.native
  
  var name: String = js.native
  
  var playParams: js.UndefOr[PlayParameters] = js.native
  
  var recordLabel: String = js.native
  
  var releaseDate: String = js.native
  
  var trackCount: Double = js.native
  
  var url: String = js.native
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
    url: String
  ): ArtistName = {
    val __obj = js.Dynamic.literal(artistName = artistName.asInstanceOf[js.Any], genreNames = genreNames.asInstanceOf[js.Any], isCompilation = isCompilation.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any], isMasteredForItunes = isMasteredForItunes.asInstanceOf[js.Any], isSingle = isSingle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordLabel = recordLabel.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], trackCount = trackCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistName]
  }
  
  @scala.inline
  implicit class ArtistNameOps[Self <: ArtistName] (val x: Self) extends AnyVal {
    
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
    def setArtistName(value: String): Self = this.set("artistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreNamesVarargs(value: String*): Self = this.set("genreNames", js.Array(value :_*))
    
    @scala.inline
    def setGenreNames(value: js.Array[String]): Self = this.set("genreNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompilation(value: Boolean): Self = this.set("isCompilation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplete(value: Boolean): Self = this.set("isComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMasteredForItunes(value: Boolean): Self = this.set("isMasteredForItunes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSingle(value: Boolean): Self = this.set("isSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordLabel(value: String): Self = this.set("recordLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackCount(value: Double): Self = this.set("trackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumName(value: String): Self = this.set("albumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlbumName: Self = this.set("albumName", js.undefined)
    
    @scala.inline
    def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = this.set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
    
    @scala.inline
    def setContentRating(value: clean | explicit): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRating: Self = this.set("contentRating", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = this.set("editorialNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorialNotes: Self = this.set("editorialNotes", js.undefined)
    
    @scala.inline
    def setPlayParams(value: PlayParameters): Self = this.set("playParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayParams: Self = this.set("playParams", js.undefined)
  }
}
