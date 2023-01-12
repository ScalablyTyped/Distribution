package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityRequest extends StObject {
  
  /**
    * The URL of the Amazon SQS queue whose message's visibility is changed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
  
  /**
    * The receipt handle associated with the message whose visibility timeout is changed. This parameter is returned by the  ReceiveMessage  action.
    */
  var ReceiptHandle: String
  
  /**
    * The new value for the message's visibility timeout (in seconds). Values range: 0 to 43200. Maximum: 12 hours.
    */
  var VisibilityTimeout: Integer
}
object ChangeMessageVisibilityRequest {
  
  inline def apply(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Integer): ChangeMessageVisibilityRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeMessageVisibilityRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setVisibilityTimeout(value: Integer): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
  }
}
