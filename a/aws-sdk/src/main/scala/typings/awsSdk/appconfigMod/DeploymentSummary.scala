package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentSummary extends js.Object {
  
  /**
    * Time the deployment completed.
    */
  var CompletedAt: js.UndefOr[Iso8601DateTime] = js.native
  
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.native
  
  /**
    * The version of the configuration.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.native
  
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: js.UndefOr[Integer] = js.native
  
  /**
    * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.native
  
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.native
  
  /**
    * The algorithm used to define how percentage grows over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.native
  
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.native
  
  /**
    * Time the deployment started.
    */
  var StartedAt: js.UndefOr[Iso8601DateTime] = js.native
  
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.native
}
object DeploymentSummary {
  
  @scala.inline
  def apply(): DeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentSummary]
  }
  
  @scala.inline
  implicit class DeploymentSummaryOps[Self <: DeploymentSummary] (val x: Self) extends AnyVal {
    
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
    def setCompletedAt(value: Iso8601DateTime): Self = this.set("CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedAt: Self = this.set("CompletedAt", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: Name): Self = this.set("ConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationName: Self = this.set("ConfigurationName", js.undefined)
    
    @scala.inline
    def setConfigurationVersion(value: Version): Self = this.set("ConfigurationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationVersion: Self = this.set("ConfigurationVersion", js.undefined)
    
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = this.set("DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentDurationInMinutes: Self = this.set("DeploymentDurationInMinutes", js.undefined)
    
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = this.set("DeploymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentNumber: Self = this.set("DeploymentNumber", js.undefined)
    
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
    def setPercentageComplete(value: Percentage): Self = this.set("PercentageComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentageComplete: Self = this.set("PercentageComplete", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Iso8601DateTime): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    
    @scala.inline
    def setState(value: DeploymentState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
