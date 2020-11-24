package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1OriginalRequest extends js.Object {
  
  var data: js.UndefOr[GoogleActionsV2AppRequest] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object DialogflowV1OriginalRequest {
  
  @scala.inline
  def apply(): DialogflowV1OriginalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1OriginalRequest]
  }
  
  @scala.inline
  implicit class DialogflowV1OriginalRequestOps[Self <: DialogflowV1OriginalRequest] (val x: Self) extends AnyVal {
    
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
    def setData(value: GoogleActionsV2AppRequest): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
