package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/playlistresponse
trait PlaylistResponse extends StObject {
  
  var data: js.Array[Playlist]
}
object PlaylistResponse {
  
  inline def apply(data: js.Array[Playlist]): PlaylistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistResponse]
  }
  
  extension [Self <: PlaylistResponse](x: Self) {
    
    inline def setData(value: js.Array[Playlist]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Playlist*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
