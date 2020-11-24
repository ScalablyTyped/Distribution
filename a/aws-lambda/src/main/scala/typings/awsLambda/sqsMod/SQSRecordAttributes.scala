package typings.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQSRecordAttributes extends js.Object {
  
  var AWSTraceHeader: js.UndefOr[String] = js.native
  
  var ApproximateFirstReceiveTimestamp: String = js.native
  
  var ApproximateReceiveCount: String = js.native
  
  var MessageDeduplicationId: js.UndefOr[String] = js.native
  
  var MessageGroupId: js.UndefOr[String] = js.native
  
  var SenderId: String = js.native
  
  var SentTimestamp: String = js.native
  
  var SequenceNumber: js.UndefOr[String] = js.native
}
object SQSRecordAttributes {
  
  @scala.inline
  def apply(
    ApproximateFirstReceiveTimestamp: String,
    ApproximateReceiveCount: String,
    SenderId: String,
    SentTimestamp: String
  ): SQSRecordAttributes = {
    val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQSRecordAttributes]
  }
  
  @scala.inline
  implicit class SQSRecordAttributesOps[Self <: SQSRecordAttributes] (val x: Self) extends AnyVal {
    
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
    def setApproximateFirstReceiveTimestamp(value: String): Self = this.set("ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateReceiveCount(value: String): Self = this.set("ApproximateReceiveCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderId(value: String): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentTimestamp(value: String): Self = this.set("SentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSTraceHeader(value: String): Self = this.set("AWSTraceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAWSTraceHeader: Self = this.set("AWSTraceHeader", js.undefined)
    
    @scala.inline
    def setMessageDeduplicationId(value: String): Self = this.set("MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageDeduplicationId: Self = this.set("MessageDeduplicationId", js.undefined)
    
    @scala.inline
    def setMessageGroupId(value: String): Self = this.set("MessageGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageGroupId: Self = this.set("MessageGroupId", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
  }
}
