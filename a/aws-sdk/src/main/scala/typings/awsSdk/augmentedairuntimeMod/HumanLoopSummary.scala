package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopSummary extends StObject {
  
  /**
    * When Amazon Augmented AI created the human loop.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The reason why the human loop failed. A failure reason is returned when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.FailureReason] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition used to configure the human loop.
    */
  var FlowDefinitionArn: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.FlowDefinitionArn] = js.native
  
  /**
    * The name of the human loop.
    */
  var HumanLoopName: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopName] = js.native
  
  /**
    * The status of the human loop. 
    */
  var HumanLoopStatus: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopStatus] = js.native
}
object HumanLoopSummary {
  
  @scala.inline
  def apply(): HumanLoopSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopSummary]
  }
  
  @scala.inline
  implicit class HumanLoopSummaryMutableBuilder[Self <: HumanLoopSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowDefinitionArnUndefined: Self = StObject.set(x, "FlowDefinitionArn", js.undefined)
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopNameUndefined: Self = StObject.set(x, "HumanLoopName", js.undefined)
    
    @scala.inline
    def setHumanLoopStatus(value: HumanLoopStatus): Self = StObject.set(x, "HumanLoopStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopStatusUndefined: Self = StObject.set(x, "HumanLoopStatus", js.undefined)
  }
}
