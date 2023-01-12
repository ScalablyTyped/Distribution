package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The ID of the application that was deployed.
    */
  var ApplicationId: js.UndefOr[Id] = js.undefined
  
  /**
    * A list of extensions that were processed as part of the deployment. The extensions that were previously associated to the configuration profile, environment, or the application when StartDeployment was called.
    */
  var AppliedExtensions: js.UndefOr[typings.awsSdk.clientsAppconfigMod.AppliedExtensions] = js.undefined
  
  /**
    * The time the deployment completed. 
    */
  var CompletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the source location of the configuration.
    */
  var ConfigurationLocationUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var ConfigurationName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the configuration profile that was deployed.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.undefined
  
  /**
    * The configuration version that was deployed.
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
    * The ID of the deployment strategy that was deployed.
    */
  var DeploymentStrategyId: js.UndefOr[Id] = js.undefined
  
  /**
    * The description of the deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The ID of the environment that was deployed.
    */
  var EnvironmentId: js.UndefOr[Id] = js.undefined
  
  /**
    * A list containing all events related to a deployment. The most recent events are displayed first.
    */
  var EventLog: js.UndefOr[DeploymentEvents] = js.undefined
  
  /**
    * The amount of time that AppConfig monitored for alarms before considering the deployment to be complete and no longer eligible for automatic rollback.
    */
  var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined
  
  /**
    * The percentage of targets to receive a deployed configuration during each interval.
    */
  var GrowthFactor: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The algorithm used to define how percentage grew over time.
    */
  var GrowthType: js.UndefOr[typings.awsSdk.clientsAppconfigMod.GrowthType] = js.undefined
  
  /**
    * The percentage of targets for which the deployment is available.
    */
  var PercentageComplete: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The time the deployment started.
    */
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the deployment.
    */
  var State: js.UndefOr[DeploymentState] = js.undefined
}
object Deployment {
  
  inline def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setAppliedExtensions(value: AppliedExtensions): Self = StObject.set(x, "AppliedExtensions", value.asInstanceOf[js.Any])
    
    inline def setAppliedExtensionsUndefined: Self = StObject.set(x, "AppliedExtensions", js.undefined)
    
    inline def setAppliedExtensionsVarargs(value: AppliedExtension*): Self = StObject.set(x, "AppliedExtensions", js.Array(value*))
    
    inline def setCompletedAt(value: js.Date): Self = StObject.set(x, "CompletedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "CompletedAt", js.undefined)
    
    inline def setConfigurationLocationUri(value: Uri): Self = StObject.set(x, "ConfigurationLocationUri", value.asInstanceOf[js.Any])
    
    inline def setConfigurationLocationUriUndefined: Self = StObject.set(x, "ConfigurationLocationUri", js.undefined)
    
    inline def setConfigurationName(value: Name): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNameUndefined: Self = StObject.set(x, "ConfigurationName", js.undefined)
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileIdUndefined: Self = StObject.set(x, "ConfigurationProfileId", js.undefined)
    
    inline def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersionUndefined: Self = StObject.set(x, "ConfigurationVersion", js.undefined)
    
    inline def setDeploymentDurationInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "DeploymentDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDeploymentDurationInMinutesUndefined: Self = StObject.set(x, "DeploymentDurationInMinutes", js.undefined)
    
    inline def setDeploymentNumber(value: Integer): Self = StObject.set(x, "DeploymentNumber", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNumberUndefined: Self = StObject.set(x, "DeploymentNumber", js.undefined)
    
    inline def setDeploymentStrategyId(value: Id): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStrategyIdUndefined: Self = StObject.set(x, "DeploymentStrategyId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEventLog(value: DeploymentEvents): Self = StObject.set(x, "EventLog", value.asInstanceOf[js.Any])
    
    inline def setEventLogUndefined: Self = StObject.set(x, "EventLog", js.undefined)
    
    inline def setEventLogVarargs(value: DeploymentEvent*): Self = StObject.set(x, "EventLog", js.Array(value*))
    
    inline def setFinalBakeTimeInMinutes(value: MinutesBetween0And24Hours): Self = StObject.set(x, "FinalBakeTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setFinalBakeTimeInMinutesUndefined: Self = StObject.set(x, "FinalBakeTimeInMinutes", js.undefined)
    
    inline def setGrowthFactor(value: Percentage): Self = StObject.set(x, "GrowthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "GrowthFactor", js.undefined)
    
    inline def setGrowthType(value: GrowthType): Self = StObject.set(x, "GrowthType", value.asInstanceOf[js.Any])
    
    inline def setGrowthTypeUndefined: Self = StObject.set(x, "GrowthType", js.undefined)
    
    inline def setPercentageComplete(value: Percentage): Self = StObject.set(x, "PercentageComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteUndefined: Self = StObject.set(x, "PercentageComplete", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setState(value: DeploymentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
