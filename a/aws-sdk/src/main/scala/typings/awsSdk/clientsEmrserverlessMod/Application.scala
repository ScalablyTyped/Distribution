package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /**
    * The ID of the application.
    */
  var applicationId: ApplicationId
  
  /**
    * The ARN of the application.
    */
  var arn: ApplicationArn
  
  /**
    * The configuration for an application to automatically start on job submission.
    */
  var autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined
  
  /**
    * The configuration for an application to automatically stop after a certain amount of time being idle.
    */
  var autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined
  
  /**
    * The date and time when the application run was created.
    */
  var createdAt: js.Date
  
  /**
    * The initial capacity of the application.
    */
  var initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined
  
  /**
    * The maximum capacity of the application. This is cumulative across all workers at any given point in time during the lifespan of the application is created. No new resources will be created once any one of the defined limits is hit.
    */
  var maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The network configuration for customer VPC connectivity for the application.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The EMR release version associated with the application.
    */
  var releaseLabel: ReleaseLabel
  
  /**
    * The state of the application.
    */
  var state: ApplicationState
  
  /**
    * The state details of the application.
    */
  var stateDetails: js.UndefOr[String256] = js.undefined
  
  /**
    * The tags assigned to the application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of application, such as Spark or Hive.
    */
  var `type`: EngineType
  
  /**
    * The date and time when the application run was last updated.
    */
  var updatedAt: js.Date
}
object Application {
  
  inline def apply(
    applicationId: ApplicationId,
    arn: ApplicationArn,
    createdAt: js.Date,
    releaseLabel: ReleaseLabel,
    state: ApplicationState,
    `type`: EngineType,
    updatedAt: js.Date
  ): Application = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAutoStartConfiguration(value: AutoStartConfig): Self = StObject.set(x, "autoStartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStartConfigurationUndefined: Self = StObject.set(x, "autoStartConfiguration", js.undefined)
    
    inline def setAutoStopConfiguration(value: AutoStopConfig): Self = StObject.set(x, "autoStopConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStopConfigurationUndefined: Self = StObject.set(x, "autoStopConfiguration", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setInitialCapacity(value: InitialCapacityConfigMap): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
    
    inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
    
    inline def setMaximumCapacity(value: MaximumAllowedResources): Self = StObject.set(x, "maximumCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaximumCapacityUndefined: Self = StObject.set(x, "maximumCapacity", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setState(value: ApplicationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetails(value: String256): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    inline def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: EngineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
