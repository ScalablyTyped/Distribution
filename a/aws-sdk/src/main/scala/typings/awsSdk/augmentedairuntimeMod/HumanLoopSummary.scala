package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopSummary extends js.Object {
  
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
  implicit class HumanLoopSummaryOps[Self <: HumanLoopSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = this.set("FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowDefinitionArn: Self = this.set("FlowDefinitionArn", js.undefined)
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = this.set("HumanLoopName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLoopName: Self = this.set("HumanLoopName", js.undefined)
    
    @scala.inline
    def setHumanLoopStatus(value: HumanLoopStatus): Self = this.set("HumanLoopStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLoopStatus: Self = this.set("HumanLoopStatus", js.undefined)
  }
}
