package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Relationship
import typings.appleMusicApi.AppleMusicApi.Song
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Curator extends js.Object {
  
  var curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator] = js.native
  
  var tracks: js.UndefOr[Relationship[Song]] = js.native
}
object Curator {
  
  @scala.inline
  def apply(curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator]): Curator = {
    val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
  
  @scala.inline
  implicit class CuratorOps[Self <: Curator] (val x: Self) extends AnyVal {
    
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
    def setCurator(value: Relationship[typings.appleMusicApi.AppleMusicApi.Curator]): Self = this.set("curator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: Relationship[Song]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
}
