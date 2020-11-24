package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.appleMusicApiStrings.stations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/station
@js.native
trait Station extends Resource {
  
  var artwork: Artwork = js.native
  
  var durationInMillis: js.UndefOr[Double] = js.native
  
  var editorialNotes: js.UndefOr[EditorialNotes] = js.native
  
  var episodeNumber: js.UndefOr[Double] = js.native
  
  var isLive: Boolean = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_Station: stations = js.native
  
  var url: String = js.native
}
object Station {
  
  @scala.inline
  def apply(artwork: Artwork, id: String, isLive: Boolean, name: String, `type`: stations, url: String): Station = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLive = isLive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
  
  @scala.inline
  implicit class StationOps[Self <: Station] (val x: Self) extends AnyVal {
    
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
    def setArtwork(value: Artwork): Self = this.set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLive(value: Boolean): Self = this.set("isLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: stations): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMillis(value: Double): Self = this.set("durationInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationInMillis: Self = this.set("durationInMillis", js.undefined)
    
    @scala.inline
    def setEditorialNotes(value: EditorialNotes): Self = this.set("editorialNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorialNotes: Self = this.set("editorialNotes", js.undefined)
    
    @scala.inline
    def setEpisodeNumber(value: Double): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpisodeNumber: Self = this.set("episodeNumber", js.undefined)
  }
}
