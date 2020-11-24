package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2MediaResponse extends js.Object {
  
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
  implicit class GoogleActionsV2MediaResponseOps[Self <: GoogleActionsV2MediaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMediaObjectsVarargs(value: GoogleActionsV2MediaObject*): Self = this.set("mediaObjects", js.Array(value :_*))
    
    @scala.inline
    def setMediaObjects(value: js.Array[GoogleActionsV2MediaObject]): Self = this.set("mediaObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaObjects: Self = this.set("mediaObjects", js.undefined)
    
    @scala.inline
    def setMediaType(value: GoogleActionsV2MediaResponseMediaType): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
}
