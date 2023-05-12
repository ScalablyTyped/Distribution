package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsTopicSinkConfiguration extends StObject {
  
  /**
    * The ARN of the SNS sink.
    */
  var InsightsTarget: js.UndefOr[Arn] = js.undefined
}
object SnsTopicSinkConfiguration {
  
  inline def apply(): SnsTopicSinkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnsTopicSinkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsTopicSinkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInsightsTarget(value: Arn): Self = StObject.set(x, "InsightsTarget", value.asInstanceOf[js.Any])
    
    inline def setInsightsTargetUndefined: Self = StObject.set(x, "InsightsTarget", js.undefined)
  }
}
