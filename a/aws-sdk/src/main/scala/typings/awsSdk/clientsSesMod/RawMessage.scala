package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawMessage extends StObject {
  
  /**
    * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding for you. In all cases, the client must ensure that the message format complies with Internet email standards regarding email header fields, MIME types, and MIME encoding. The To:, CC:, and BCC: headers in the raw message can contain a group list. If you are using SendRawEmail with sending authorization, you can include X-headers in the raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation for SendRawEmail.   Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the email.  For more information, go to the Amazon SES Developer Guide.
    */
  var Data: RawMessageData
}
object RawMessage {
  
  inline def apply(Data: RawMessageData): RawMessage = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawMessage]
  }
  
  extension [Self <: RawMessage](x: Self) {
    
    inline def setData(value: RawMessageData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
