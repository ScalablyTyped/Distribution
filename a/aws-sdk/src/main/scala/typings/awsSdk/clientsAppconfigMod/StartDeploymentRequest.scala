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
    * The configuration version to deploy. If deploying an AppConfig hosted configuration version, you can specify either the version number or version label.
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
    * The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this ID to encrypt the configuration data using a customer managed key. 
    */
  var KmsKeyIdentifier: js.UndefOr[Identifier] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileId(value: Id): Self = StObject.set(x, "ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVersion(value: Version): Self = StObject.set(x, "ConfigurationVersion", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdentifier(value: Identifier): Self = StObject.set(x, "KmsKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdentifierUndefined: Self = StObject.set(x, "KmsKeyIdentifier", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
