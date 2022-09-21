package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqsQueueConfiguration extends StObject {
  
  /**
    *  The proposed resource policy for the Amazon SQS queue. 
    */
  var queuePolicy: js.UndefOr[SqsQueuePolicy] = js.undefined
}
object SqsQueueConfiguration {
  
  inline def apply(): SqsQueueConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsQueueConfiguration]
  }
  
  extension [Self <: SqsQueueConfiguration](x: Self) {
    
    inline def setQueuePolicy(value: SqsQueuePolicy): Self = StObject.set(x, "queuePolicy", value.asInstanceOf[js.Any])
    
    inline def setQueuePolicyUndefined: Self = StObject.set(x, "queuePolicy", js.undefined)
  }
}
