package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/albumresponse
trait AlbumResponse extends StObject {
  
  var data: js.Array[Album]
}
object AlbumResponse {
  
  inline def apply(data: js.Array[Album]): AlbumResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumResponse]
  }
  
  extension [Self <: AlbumResponse](x: Self) {
    
    inline def setData(value: js.Array[Album]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Album*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
