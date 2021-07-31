package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.AlbumName
import typings.appleMusicApi.appleMusicApiStrings.songs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/song
trait Song
  extends StObject
     with Resource {
  
  // https://developer.apple.com/documentation/applemusicapi/song/attributes
  var attributes: js.UndefOr[AlbumName] = js.undefined
  
  var relationships: js.UndefOr[SongRelationships] = js.undefined
  
  @JSName("type")
  var type_Song: songs
}
object Song {
  
  @scala.inline
  def apply(id: String): Song = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("songs")
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
