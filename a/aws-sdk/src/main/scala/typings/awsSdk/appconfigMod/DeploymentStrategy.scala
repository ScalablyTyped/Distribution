package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentStrategy extends js.Object {
  
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The description of the deployment strategy.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The amount of time AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The percentage of targets that received a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
  
  /**
    * The deployment strategy ID.
    */
  var Id: js.UndefOr[typings.awsSdk.appconfigMod.Id] = js.native
  
  /**
    * The name of the deployment strategy.
    */
  var Name: js.UndefOr[typings.awsSdk.appconfigMod.Name] = js.native
  
  /**
    * Save the deployment strategy to a Systems Manager (SSM) document.
    */
  var ReplicateTo: js.UndefOr[typings.awsSdk.appconfigMod.ReplicateTo] = js.native
}
object DeploymentStrategy {
  
  @scala.inline
  def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  
  @scala.inline
  implicit class DeploymentStrategyOps[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    
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
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = this.set("DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentDurationInMinutes: Self = this.set("DeploymentDurationInMinutes", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = this.set("FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalBakeTimeInMinutes: Self = this.set("FinalBakeTimeInMinutes", js.undefined)
    
    @scala.inline
    def setGrowthFactor(value: Percentage): Self = this.set("GrowthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowthFactor: Self = this.set("GrowthFactor", js.undefined)
    
    @scala.inline
    def setGrowthType(value: GrowthType): Self = this.set("GrowthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowthType: Self = this.set("GrowthType", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setReplicateTo(value: ReplicateTo): Self = this.set("ReplicateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicateTo: Self = this.set("ReplicateTo", js.undefined)
  }
}
