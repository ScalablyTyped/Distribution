package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1BaseGoogleMessage[TType /* <: String */] extends js.Object {
  
  var platform: google = js.native
  
  var `type`: js.UndefOr[TType] = js.native
}
object DialogflowV1BaseGoogleMessage {
  
  @scala.inline
  def apply[TType /* <: String */](platform: google): DialogflowV1BaseGoogleMessage[TType] = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseGoogleMessage[TType]]
  }
  
  @scala.inline
  implicit class DialogflowV1BaseGoogleMessageOps[Self <: DialogflowV1BaseGoogleMessage[_], TType /* <: String */] (val x: Self with DialogflowV1BaseGoogleMessage[TType]) extends AnyVal {
    
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
    def setPlatform(value: google): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
