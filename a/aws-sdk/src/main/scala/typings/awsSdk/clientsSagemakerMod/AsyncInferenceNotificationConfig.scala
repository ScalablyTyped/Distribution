package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncInferenceNotificationConfig extends StObject {
  
  /**
    * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
    */
  var ErrorTopic: js.UndefOr[SnsTopicArn] = js.undefined
  
  /**
    * The Amazon SNS topics where you want the inference response to be included.  The inference response is included only if the response size is less than or equal to 128 KB. 
    */
  var IncludeInferenceResponseIn: js.UndefOr[AsyncNotificationTopicTypeList] = js.undefined
  
  /**
    * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
    */
  var SuccessTopic: js.UndefOr[SnsTopicArn] = js.undefined
}
object AsyncInferenceNotificationConfig {
  
  inline def apply(): AsyncInferenceNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInferenceNotificationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncInferenceNotificationConfig] (val x: Self) extends AnyVal {
    
    inline def setErrorTopic(value: SnsTopicArn): Self = StObject.set(x, "ErrorTopic", value.asInstanceOf[js.Any])
    
    inline def setErrorTopicUndefined: Self = StObject.set(x, "ErrorTopic", js.undefined)
    
    inline def setIncludeInferenceResponseIn(value: AsyncNotificationTopicTypeList): Self = StObject.set(x, "IncludeInferenceResponseIn", value.asInstanceOf[js.Any])
    
    inline def setIncludeInferenceResponseInUndefined: Self = StObject.set(x, "IncludeInferenceResponseIn", js.undefined)
    
    inline def setIncludeInferenceResponseInVarargs(value: AsyncNotificationTopicTypes*): Self = StObject.set(x, "IncludeInferenceResponseIn", js.Array(value*))
    
    inline def setSuccessTopic(value: SnsTopicArn): Self = StObject.set(x, "SuccessTopic", value.asInstanceOf[js.Any])
    
    inline def setSuccessTopicUndefined: Self = StObject.set(x, "SuccessTopic", js.undefined)
  }
}
