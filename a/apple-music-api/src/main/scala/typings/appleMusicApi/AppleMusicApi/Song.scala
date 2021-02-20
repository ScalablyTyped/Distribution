package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.AlbumName
import typings.appleMusicApi.appleMusicApiStrings.songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/song
@js.native
trait Song extends Resource {
  
  // https://developer.apple.com/documentation/applemusicapi/song/attributes
  var attributes: js.UndefOr[AlbumName] = js.native
  
  var relationships: js.UndefOr[SongRelationships] = js.native
  
  @JSName("type")
  var type_Song: songs = js.native
}
object Song {
  
  @scala.inline
  def apply(id: String, `type`: songs): Song = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Song]
  }
  
  @scala.inline
  implicit class SongMutableBuilder[Self <: Song] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AlbumName): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: SongRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: songs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
