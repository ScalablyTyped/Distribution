package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeploymentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id
  
  /**
    * The configuration version to deploy.
    */
  var ConfigurationVersion: Version
  
  /**
    * The deployment strategy ID.
    */
  var DeploymentStrategyId: typings.awsSdk.clientsAppconfigMod.DeploymentStrategyId
  
  /**
    * A description of the deployment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The environment ID.
    */
  var EnvironmentId: Id
  
  /**
    * Metadata to assign to the deployment. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object StartDeploymentRequest {
  
  inline def apply(
    ApplicationId: Id,
    ConfigurationProfileId: Id,
    ConfigurationVersion: Version,
    DeploymentStrategyId: DeploymentStrategyId,
    EnvironmentId: Id
  ): StartDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any], DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentRequest]
  }
  
  extension [Self <: StartDeploymentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
