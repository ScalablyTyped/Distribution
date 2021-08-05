package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobQueueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueueArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the job queue.
    */
  var jobQueueName: js.UndefOr[String] = js.undefined
}
object UpdateJobQueueResponse {
  
  inline def apply(): UpdateJobQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobQueueResponse]
  }
  
  extension [Self <: UpdateJobQueueResponse](x: Self) {
    
    inline def setJobQueueArn(value: String): Self = StObject.set(x, "jobQueueArn", value.asInstanceOf[js.Any])
    
    inline def setJobQueueArnUndefined: Self = StObject.set(x, "jobQueueArn", js.undefined)
    
    inline def setJobQueueName(value: String): Self = StObject.set(x, "jobQueueName", value.asInstanceOf[js.Any])
    
    inline def setJobQueueNameUndefined: Self = StObject.set(x, "jobQueueName", js.undefined)
  }
}
