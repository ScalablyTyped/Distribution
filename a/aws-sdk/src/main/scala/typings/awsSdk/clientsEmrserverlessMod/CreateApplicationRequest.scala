package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * The CPU architecture of an application.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * The configuration for an application to automatically start on job submission.
    */
  var autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined
  
  /**
    * The configuration for an application to automatically stop after a certain amount of time being idle.
    */
  var autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined
  
  /**
    * The client idempotency token of the application to create. Its value must be unique for each request.
    */
  var clientToken: ClientToken
  
  /**
    * The image configuration for all worker types. You can either set this parameter or imageConfiguration for each worker type in workerTypeSpecifications.
    */
  var imageConfiguration: js.UndefOr[ImageConfigurationInput] = js.undefined
  
  /**
    * The capacity to initialize when the application is created.
    */
  var initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined
  
  /**
    * The maximum capacity to allocate when the application is created. This is cumulative across all workers at any given point in time, not just when an application is created. No new resources will be created once any one of the defined limits is hit.
    */
  var maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * The network configuration for customer VPC connectivity.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * The EMR release associated with the application.
    */
  var releaseLabel: ReleaseLabel
  
  /**
    * The tags assigned to the application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of application you want to start, such as Spark or Hive.
    */
  var `type`: EngineType
  
  /**
    * The key-value pairs that specify worker type to WorkerTypeSpecificationInput. This parameter must contain all valid worker types for a Spark or Hive application. Valid worker types include Driver and Executor for Spark applications and HiveDriver and TezTask for Hive applications. You can either set image details in this parameter for each worker type, or in imageConfiguration for all worker types.
    */
  var workerTypeSpecifications: js.UndefOr[WorkerTypeSpecificationInputMap] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(clientToken: ClientToken, releaseLabel: ReleaseLabel, `type`: EngineType): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], releaseLabel = releaseLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setAutoStartConfiguration(value: AutoStartConfig): Self = StObject.set(x, "autoStartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStartConfigurationUndefined: Self = StObject.set(x, "autoStartConfiguration", js.undefined)
    
    inline def setAutoStopConfiguration(value: AutoStopConfig): Self = StObject.set(x, "autoStopConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStopConfigurationUndefined: Self = StObject.set(x, "autoStopConfiguration", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setImageConfiguration(value: ImageConfigurationInput): Self = StObject.set(x, "imageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageConfigurationUndefined: Self = StObject.set(x, "imageConfiguration", js.undefined)
    
    inline def setInitialCapacity(value: InitialCapacityConfigMap): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
    
    inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
    
    inline def setMaximumCapacity(value: MaximumAllowedResources): Self = StObject.set(x, "maximumCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaximumCapacityUndefined: Self = StObject.set(x, "maximumCapacity", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    inline def setReleaseLabel(value: ReleaseLabel): Self = StObject.set(x, "releaseLabel", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: EngineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeSpecifications(value: WorkerTypeSpecificationInputMap): Self = StObject.set(x, "workerTypeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeSpecificationsUndefined: Self = StObject.set(x, "workerTypeSpecifications", js.undefined)
  }
}
