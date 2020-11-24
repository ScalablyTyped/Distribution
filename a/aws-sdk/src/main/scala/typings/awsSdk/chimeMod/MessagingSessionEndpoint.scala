package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingSessionEndpoint extends js.Object {
  
  /**
    * The URL of a meeting session endpoint.
    */
  var Url: js.UndefOr[UrlType] = js.native
}
object MessagingSessionEndpoint {
  
  @scala.inline
  def apply(): MessagingSessionEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSessionEndpoint]
  }
  
  @scala.inline
  implicit class MessagingSessionEndpointOps[Self <: MessagingSessionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: UrlType): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
