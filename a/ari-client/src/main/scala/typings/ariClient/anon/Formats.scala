package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formats extends js.Object {
  
  var app: String = js.native
  
  var appArgs: js.UndefOr[String] = js.native
  
  var endpoint: String = js.native
  
  var formats: js.UndefOr[String] = js.native
  
  var originator: js.UndefOr[String] = js.native
  
  var otherChannelId: js.UndefOr[String] = js.native
}
object Formats {
  
  @scala.inline
  def apply(app: String, endpoint: String): Formats = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppArgs(value: String): Self = this.set("appArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppArgs: Self = this.set("appArgs", js.undefined)
    
    @scala.inline
    def setFormats(value: String): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginator: Self = this.set("originator", js.undefined)
    
    @scala.inline
    def setOtherChannelId(value: String): Self = this.set("otherChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherChannelId: Self = this.set("otherChannelId", js.undefined)
  }
}
