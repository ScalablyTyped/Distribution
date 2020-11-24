package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppArgsSnoopId extends js.Object {
  
  var app: String = js.native
  
  var appArgs: js.UndefOr[String] = js.native
  
  var snoopId: String = js.native
  
  var spy: js.UndefOr[String] = js.native
  
  var whisper: js.UndefOr[String] = js.native
}
object AppArgsSnoopId {
  
  @scala.inline
  def apply(app: String, snoopId: String): AppArgsSnoopId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], snoopId = snoopId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppArgsSnoopId]
  }
  
  @scala.inline
  implicit class AppArgsSnoopIdOps[Self <: AppArgsSnoopId] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnoopId(value: String): Self = this.set("snoopId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = this.set("appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppArgs: Self = this.set("appArgs", js.undefined)
    
    @scala.inline
    def setSpy(value: String): Self = this.set("spy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpy: Self = this.set("spy", js.undefined)
    
    @scala.inline
    def setWhisper(value: String): Self = this.set("whisper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhisper: Self = this.set("whisper", js.undefined)
  }
}
