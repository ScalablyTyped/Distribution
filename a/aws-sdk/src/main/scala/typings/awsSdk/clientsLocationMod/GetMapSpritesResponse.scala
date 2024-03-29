package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapSpritesResponse extends StObject {
  
  /**
    * Contains the body of the sprite sheet or JSON offset ﬁle.
    */
  var Blob: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The HTTP Cache-Control directive for the value.
    */
  var CacheControl: js.UndefOr[String] = js.undefined
  
  /**
    * The content type of the sprite sheet and offsets. For example, the sprite sheet content type is image/png, and the sprite offset JSON document is application/json. 
    */
  var ContentType: js.UndefOr[String] = js.undefined
}
object GetMapSpritesResponse {
  
  inline def apply(): GetMapSpritesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMapSpritesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMapSpritesResponse] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: _Blob): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "Blob", js.undefined)
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
  }
}
