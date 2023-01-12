package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * The ID of the application to update.
    */
  var applicationId: ApplicationId
  
  /**
    * The configuration for an application to automatically start on job submission.
    */
  var autoStartConfiguration: js.UndefOr[AutoStartConfig] = js.undefined
  
  /**
    * The configuration for an application to automatically stop after a certain amount of time being idle.
    */
  var autoStopConfiguration: js.UndefOr[AutoStopConfig] = js.undefined
  
  /**
    * The client idempotency token of the application to update. Its value must be unique for each request.
    */
  var clientToken: ClientToken
  
  /**
    * The capacity to initialize when the application is updated.
    */
  var initialCapacity: js.UndefOr[InitialCapacityConfigMap] = js.undefined
  
  /**
    * The maximum capacity to allocate when the application is updated. This is cumulative across all workers at any given point in time during the lifespan of the application. No new resources will be created once any one of the defined limits is hit.
    */
  var maximumCapacity: js.UndefOr[MaximumAllowedResources] = js.undefined
  
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(applicationId: ApplicationId, clientToken: ClientToken): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setAutoStartConfiguration(value: AutoStartConfig): Self = StObject.set(x, "autoStartConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStartConfigurationUndefined: Self = StObject.set(x, "autoStartConfiguration", js.undefined)
    
    inline def setAutoStopConfiguration(value: AutoStopConfig): Self = StObject.set(x, "autoStopConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAutoStopConfigurationUndefined: Self = StObject.set(x, "autoStopConfiguration", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setInitialCapacity(value: InitialCapacityConfigMap): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
    
    inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
    
    inline def setMaximumCapacity(value: MaximumAllowedResources): Self = StObject.set(x, "maximumCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaximumCapacityUndefined: Self = StObject.set(x, "maximumCapacity", js.undefined)
    
    inline def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
  }
}
