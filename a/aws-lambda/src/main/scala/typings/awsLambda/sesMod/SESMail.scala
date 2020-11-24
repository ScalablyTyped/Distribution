package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESMail extends js.Object {
  
  var commonHeaders: SESMailCommonHeaders = js.native
  
  var destination: js.Array[String] = js.native
  
  var headers: js.Array[SESMailHeader] = js.native
  
  var headersTruncated: Boolean = js.native
  
  var messageId: String = js.native
  
  var source: String = js.native
  
  var timestamp: String = js.native
}
object SESMail {
  
  @scala.inline
  def apply(
    commonHeaders: SESMailCommonHeaders,
    destination: js.Array[String],
    headers: js.Array[SESMailHeader],
    headersTruncated: Boolean,
    messageId: String,
    source: String,
    timestamp: String
  ): SESMail = {
    val __obj = js.Dynamic.literal(commonHeaders = commonHeaders.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersTruncated = headersTruncated.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMail]
  }
  
  @scala.inline
  implicit class SESMailOps[Self <: SESMail] (val x: Self) extends AnyVal {
    
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
    def setCommonHeaders(value: SESMailCommonHeaders): Self = this.set("commonHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationVarargs(value: String*): Self = this.set("destination", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: js.Array[String]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: SESMailHeader*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[SESMailHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersTruncated(value: Boolean): Self = this.set("headersTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
