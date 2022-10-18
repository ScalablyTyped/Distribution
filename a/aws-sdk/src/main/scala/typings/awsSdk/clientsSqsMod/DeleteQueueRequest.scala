package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueueRequest extends StObject {
  
  /**
    * The URL of the Amazon SQS queue to delete. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object DeleteQueueRequest {
  
  inline def apply(QueueUrl: String): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueueRequest]
  }
  
  extension [Self <: DeleteQueueRequest](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
