package typings.awsSdk.clientsAugmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopSummary extends StObject {
  
  /**
    * When Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason why the human loop failed. A failure reason is returned when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition used to configure the human loop.
    */
  var FlowDefinitionArn: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.FlowDefinitionArn] = js.undefined
  
  /**
    * The name of the human loop.
    */
  var HumanLoopName: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.HumanLoopName] = js.undefined
  
  /**
    * The status of the human loop. 
    */
  var HumanLoopStatus: js.UndefOr[typings.awsSdk.clientsAugmentedairuntimeMod.HumanLoopStatus] = js.undefined
}
object HumanLoopSummary {
  
  inline def apply(): HumanLoopSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HumanLoopSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionArnUndefined: Self = StObject.set(x, "FlowDefinitionArn", js.undefined)
    
    inline def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopNameUndefined: Self = StObject.set(x, "HumanLoopName", js.undefined)
    
    inline def setHumanLoopStatus(value: HumanLoopStatus): Self = StObject.set(x, "HumanLoopStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopStatusUndefined: Self = StObject.set(x, "HumanLoopStatus", js.undefined)
  }
}
