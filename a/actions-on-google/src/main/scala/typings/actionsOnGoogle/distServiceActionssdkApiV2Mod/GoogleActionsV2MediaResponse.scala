package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2MediaResponse extends StObject {
  
  /**
    * The list of media objects.
    */
  var mediaObjects: js.UndefOr[js.Array[GoogleActionsV2MediaObject]] = js.undefined
  
  /**
    * Type of the media within this response.
    */
  var mediaType: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.undefined
}
object GoogleActionsV2MediaResponse {
  
  inline def apply(): GoogleActionsV2MediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaResponse]
  }
  
  extension [Self <: GoogleActionsV2MediaResponse](x: Self) {
    
    inline def setMediaObjects(value: js.Array[GoogleActionsV2MediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
    
    inline def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
    
    inline def setMediaObjectsVarargs(value: GoogleActionsV2MediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value*))
    
    inline def setMediaType(value: GoogleActionsV2MediaResponseMediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
