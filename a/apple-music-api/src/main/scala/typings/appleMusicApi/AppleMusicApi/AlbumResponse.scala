package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/albumresponse
@js.native
trait AlbumResponse extends StObject {
  
  var data: js.Array[Album] = js.native
}
object AlbumResponse {
  
  @scala.inline
  def apply(data: js.Array[Album]): AlbumResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumResponse]
  }
  
  @scala.inline
  implicit class AlbumResponseMutableBuilder[Self <: AlbumResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Album]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Album*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
