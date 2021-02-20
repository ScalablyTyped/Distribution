package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/playlistresponse
@js.native
trait PlaylistResponse extends StObject {
  
  var data: js.Array[Playlist] = js.native
}
object PlaylistResponse {
  
  @scala.inline
  def apply(data: js.Array[Playlist]): PlaylistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistResponse]
  }
  
  @scala.inline
  implicit class PlaylistResponseMutableBuilder[Self <: PlaylistResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Playlist]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Playlist*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
