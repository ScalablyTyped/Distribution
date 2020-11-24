package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.appleMusicApiStrings.`personal-mix`
import typings.appleMusicApi.appleMusicApiStrings.`user-shared`
import typings.appleMusicApi.appleMusicApiStrings.editorial
import typings.appleMusicApi.appleMusicApiStrings.external
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artwork extends js.Object {
  
  var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.native
  
  var curatorName: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
  
  // `isChart` is not currently mentioned in the apple music api documentation:
  var isChart: js.UndefOr[Boolean] = js.native
  
  var lastModifiedDate: String = js.native
  
  var name: String = js.native
  
  var playParams: js.UndefOr[PlayParameters] = js.native
  
  var playlistType: `user-shared` | editorial | external | `personal-mix` = js.native
  
  var url: String = js.native
}
object Artwork {
  
  @scala.inline
  def apply(
    lastModifiedDate: String,
    name: String,
    playlistType: `user-shared` | editorial | external | `personal-mix`,
    url: String
  ): Artwork = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playlistType = playlistType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  
  @scala.inline
  implicit class ArtworkOps[Self <: Artwork] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDate(value: String): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistType(value: `user-shared` | editorial | external | `personal-mix`): Self = this.set("playlistType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtwork(value: typings.appleMusicApi.AppleMusicApi.Artwork): Self = this.set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
    
    @scala.inline
    def setCuratorName(value: String): Self = this.set("curatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCuratorName: Self = this.set("curatorName", js.undefined)
    
    @scala.inline
    def setDescription(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIsChart(value: Boolean): Self = this.set("isChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChart: Self = this.set("isChart", js.undefined)
    
    @scala.inline
    def setPlayParams(value: PlayParameters): Self = this.set("playParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayParams: Self = this.set("playParams", js.undefined)
  }
}
