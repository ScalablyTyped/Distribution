package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESMailCommonHeaders extends js.Object {
  
  var date: String = js.native
  
  var from: js.Array[String] = js.native
  
  var messageId: String = js.native
  
  var returnPath: String = js.native
  
  var subject: String = js.native
  
  var to: js.Array[String] = js.native
}
object SESMailCommonHeaders {
  
  @scala.inline
  def apply(
    date: String,
    from: js.Array[String],
    messageId: String,
    returnPath: String,
    subject: String,
    to: js.Array[String]
  ): SESMailCommonHeaders = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], returnPath = returnPath.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESMailCommonHeaders]
  }
  
  @scala.inline
  implicit class SESMailCommonHeadersOps[Self <: SESMailCommonHeaders] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromVarargs(value: String*): Self = this.set("from", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: js.Array[String]): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPath(value: String): Self = this.set("returnPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
