package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueUrlResult extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object GetQueueUrlResult {
  
  inline def apply(): GetQueueUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueUrlResult]
  }
  
  extension [Self <: GetQueueUrlResult](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
