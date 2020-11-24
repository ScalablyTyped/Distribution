package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Playlists
import typings.appleMusicApi.anon.Url
import typings.appleMusicApi.appleMusicApiStrings.curators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/curator
@js.native
trait Curator extends Resource {
  
  var attributes: js.UndefOr[Url] = js.native
  
  var relationships: js.UndefOr[Playlists] = js.native
  
  @JSName("type")
  var type_Curator: curators = js.native
}
object Curator {
  
  @scala.inline
  def apply(id: String, `type`: curators): Curator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setType(value: curators): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Url): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: Playlists): Self = this.set("relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
}
