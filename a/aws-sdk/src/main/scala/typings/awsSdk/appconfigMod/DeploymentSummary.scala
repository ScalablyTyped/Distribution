package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentSummary extends StObject {
  
  /**
    * Time the deployment completed.
    */
  var CompletedAt: js.UndefOr[Iso8601DateTime] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.undefined
  
  /**
    * The version of the configuration.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * Total amount of time the deployment lasted.
    */
  var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The amount of time AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The algorithm used to define how percentage grows over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.appconfigMod.GrowthType] = js.undefined
  
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.undefined
  
  /**
    * Time the deployment started.
    */
  var StartedAt: js.UndefOr[Iso8601DateTime] = js.undefined
  
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.undefined
}
object DeploymentSummary {
  
  @scala.inline
  def apply(): DeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentSummary]
  }
  
  @scala.inline
  implicit class DeploymentSummaryMutableBuilder[Self <: DeploymentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedAt(value: Iso8601DateTime): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    @scala.inline
    def setConfigurationName(value: Name): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationNameUndefined: Self = StObject.set(x, "ConfigurationName", js.undefined)
    
    @scala.inline
    def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVersionUndefined: Self = StObject.set(x, "ConfigurationVersion", js.undefined)
    
    @scala.inline
    def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentNumberUndefined: Self = StObject.set(x, "DeploymentNumber", js.undefined)
    
    @scala.inline
    def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    @scala.inline
    def setGrowthFactor(value: Percentage): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    @scala.inline
    def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
    
    @scala.inline
    def setPercentageComplete(value: Percentage): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Iso8601DateTime): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    @scala.inline
    def setState(value: DeploymentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
