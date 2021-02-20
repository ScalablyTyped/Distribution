package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2MediaResponse extends StObject {
  
  /**
    * The list of media objects.
    */
  var mediaObjects: js.UndefOr[js.Array[GoogleActionsV2MediaObject]] = js.native
  
  /**
    * Type of the media within this response.
    */
  var mediaType: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.native
}
object GoogleActionsV2MediaResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2MediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2MediaResponseMutableBuilder[Self <: GoogleActionsV2MediaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaObjects(value: js.Array[GoogleActionsV2MediaObject]): Self = StObject.set(x, "mediaObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaObjectsUndefined: Self = StObject.set(x, "mediaObjects", js.undefined)
    
    @scala.inline
    def setMediaObjectsVarargs(value: GoogleActionsV2MediaObject*): Self = StObject.set(x, "mediaObjects", js.Array(value :_*))
    
    @scala.inline
    def setMediaType(value: GoogleActionsV2MediaResponseMediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
