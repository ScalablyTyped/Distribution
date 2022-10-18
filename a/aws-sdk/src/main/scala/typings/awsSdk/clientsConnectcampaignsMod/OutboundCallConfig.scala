package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundCallConfig extends StObject {
  
  var answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig] = js.undefined
  
  var connectContactFlowId: ContactFlowId
  
  var connectQueueId: QueueId
  
  var connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber] = js.undefined
}
object OutboundCallConfig {
  
  inline def apply(connectContactFlowId: ContactFlowId, connectQueueId: QueueId): OutboundCallConfig = {
    val __obj = js.Dynamic.literal(connectContactFlowId = connectContactFlowId.asInstanceOf[js.Any], connectQueueId = connectQueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundCallConfig]
  }
  
  extension [Self <: OutboundCallConfig](x: Self) {
    
    inline def setAnswerMachineDetectionConfig(value: AnswerMachineDetectionConfig): Self = StObject.set(x, "answerMachineDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setAnswerMachineDetectionConfigUndefined: Self = StObject.set(x, "answerMachineDetectionConfig", js.undefined)
    
    inline def setConnectContactFlowId(value: ContactFlowId): Self = StObject.set(x, "connectContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setConnectQueueId(value: QueueId): Self = StObject.set(x, "connectQueueId", value.asInstanceOf[js.Any])
    
    inline def setConnectSourcePhoneNumber(value: SourcePhoneNumber): Self = StObject.set(x, "connectSourcePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setConnectSourcePhoneNumberUndefined: Self = StObject.set(x, "connectSourcePhoneNumber", js.undefined)
  }
}
