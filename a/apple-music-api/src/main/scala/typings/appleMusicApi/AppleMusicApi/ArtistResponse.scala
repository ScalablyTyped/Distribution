package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artistresponse
trait ArtistResponse extends StObject {
  
  var data: js.Array[Artist]
}
object ArtistResponse {
  
  inline def apply(data: js.Array[Artist]): ArtistResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Artist]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Artist*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
