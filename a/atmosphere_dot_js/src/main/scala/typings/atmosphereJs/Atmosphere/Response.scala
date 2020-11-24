package typings.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  var closedByClientTimeout: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var errorHandled: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  var messages: js.UndefOr[js.Array[String]] = js.native
  
  var partialMessage: js.UndefOr[String] = js.native
  
  var reasonPhrase: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[Request] = js.native
  
  var responseBody: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[String] = js.native
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setClosedByClientTimeout(value: Boolean): Self = this.set("closedByClientTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosedByClientTimeout: Self = this.set("closedByClientTimeout", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorHandled(value: Boolean): Self = this.set("errorHandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandled: Self = this.set("errorHandled", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: String*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setPartialMessage(value: String): Self = this.set("partialMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialMessage: Self = this.set("partialMessage", js.undefined)
    
    @scala.inline
    def setReasonPhrase(value: String): Self = this.set("reasonPhrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonPhrase: Self = this.set("reasonPhrase", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResponseBody(value: String): Self = this.set("responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBody: Self = this.set("responseBody", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
