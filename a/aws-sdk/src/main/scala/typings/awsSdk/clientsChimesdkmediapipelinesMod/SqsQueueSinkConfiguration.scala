package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqsQueueSinkConfiguration extends StObject {
  
  /**
    * The ARN of the SQS sink.
    */
  var InsightsTarget: js.UndefOr[Arn] = js.undefined
}
object SqsQueueSinkConfiguration {
  
  inline def apply(): SqsQueueSinkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsQueueSinkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqsQueueSinkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInsightsTarget(value: Arn): Self = StObject.set(x, "InsightsTarget", value.asInstanceOf[js.Any])
    
    inline def setInsightsTargetUndefined: Self = StObject.set(x, "InsightsTarget", js.undefined)
  }
}
