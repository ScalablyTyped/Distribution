package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBounceRequest extends StObject {
  
  /**
    * The address to use in the "From" header of the bounce message. This must be an identity that you have verified with Amazon SES.
    */
  var BounceSender: Address
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the address in the "From" header of the bounce. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var BounceSenderArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * A list of recipients of the bounced message, including the information required to create the Delivery Status Notifications (DSNs) for the recipients. You must specify at least one BouncedRecipientInfo in the list.
    */
  var BouncedRecipientInfoList: typings.awsSdk.clientsSesMod.BouncedRecipientInfoList
  
  /**
    * Human-readable text for the bounce message to explain the failure. If not specified, the text will be auto-generated based on the bounced recipient information.
    */
  var Explanation: js.UndefOr[typings.awsSdk.clientsSesMod.Explanation] = js.undefined
  
  /**
    * Message-related DSN fields. If not specified, Amazon SES will choose the values.
    */
  var MessageDsn: js.UndefOr[typings.awsSdk.clientsSesMod.MessageDsn] = js.undefined
  
  /**
    * The message ID of the message to be bounced.
    */
  var OriginalMessageId: MessageId
}
object SendBounceRequest {
  
  inline def apply(
    BounceSender: Address,
    BouncedRecipientInfoList: BouncedRecipientInfoList,
    OriginalMessageId: MessageId
  ): SendBounceRequest = {
    val __obj = js.Dynamic.literal(BounceSender = BounceSender.asInstanceOf[js.Any], BouncedRecipientInfoList = BouncedRecipientInfoList.asInstanceOf[js.Any], OriginalMessageId = OriginalMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBounceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendBounceRequest] (val x: Self) extends AnyVal {
    
    inline def setBounceSender(value: Address): Self = StObject.set(x, "BounceSender", value.asInstanceOf[js.Any])
    
    inline def setBounceSenderArn(value: AmazonResourceName): Self = StObject.set(x, "BounceSenderArn", value.asInstanceOf[js.Any])
    
    inline def setBounceSenderArnUndefined: Self = StObject.set(x, "BounceSenderArn", js.undefined)
    
    inline def setBouncedRecipientInfoList(value: BouncedRecipientInfoList): Self = StObject.set(x, "BouncedRecipientInfoList", value.asInstanceOf[js.Any])
    
    inline def setBouncedRecipientInfoListVarargs(value: BouncedRecipientInfo*): Self = StObject.set(x, "BouncedRecipientInfoList", js.Array(value*))
    
    inline def setExplanation(value: Explanation): Self = StObject.set(x, "Explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "Explanation", js.undefined)
    
    inline def setMessageDsn(value: MessageDsn): Self = StObject.set(x, "MessageDsn", value.asInstanceOf[js.Any])
    
    inline def setMessageDsnUndefined: Self = StObject.set(x, "MessageDsn", js.undefined)
    
    inline def setOriginalMessageId(value: MessageId): Self = StObject.set(x, "OriginalMessageId", value.asInstanceOf[js.Any])
  }
}
