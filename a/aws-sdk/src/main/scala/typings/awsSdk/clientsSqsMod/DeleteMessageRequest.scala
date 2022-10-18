package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageRequest extends StObject {
  
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
  
  /**
    * The receipt handle associated with the message to delete.
    */
  var ReceiptHandle: String
}
object DeleteMessageRequest {
  
  inline def apply(QueueUrl: String, ReceiptHandle: String): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageRequest]
  }
  
  extension [Self <: DeleteMessageRequest](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
  }
}
