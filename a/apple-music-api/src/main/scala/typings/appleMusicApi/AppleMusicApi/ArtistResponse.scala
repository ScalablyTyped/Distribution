package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artistresponse
@js.native
trait ArtistResponse extends StObject {
  
  var data: js.Array[Artist] = js.native
}
object ArtistResponse {
  
  @scala.inline
  def apply(data: js.Array[Artist]): ArtistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistResponse]
  }
  
  @scala.inline
  implicit class ArtistResponseMutableBuilder[Self <: ArtistResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Artist]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Artist*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
