package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create an environment. The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response. The service also handles deleting the clientToken after it expires. 
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the environment.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The engine type for the environment.
    */
  var engineType: EngineType
  
  /**
    * The version of the engine type for the environment.
    */
  var engineVersion: js.UndefOr[EngineVersion] = js.undefined
  
  /**
    * The details of a high availability configuration for this runtime environment.
    */
  var highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig] = js.undefined
  
  /**
    * The type of instance for the environment.
    */
  var instanceType: String20
  
  /**
    * The unique identifier of the environment.
    */
  var name: EntityName
  
  /**
    * Configures a desired maintenance window for the environment. If you do not provide a value, a random system-generated value will be assigned.
    */
  var preferredMaintenanceWindow: js.UndefOr[String50] = js.undefined
  
  /**
    * Specifies whether the environment is publicly accessible.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of security groups for the VPC associated with this environment.
    */
  var securityGroupIds: js.UndefOr[String50List] = js.undefined
  
  /**
    * Optional. The storage configurations for this environment.
    */
  var storageConfigurations: js.UndefOr[StorageConfigurationList] = js.undefined
  
  /**
    * The list of subnets associated with the VPC for this environment.
    */
  var subnetIds: js.UndefOr[String50List] = js.undefined
  
  /**
    * The tags for the environment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEnvironmentRequest {
  
  inline def apply(engineType: EngineType, instanceType: String20, name: EntityName): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(engineType = engineType.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    inline def setHighAvailabilityConfig(value: HighAvailabilityConfig): Self = StObject.set(x, "highAvailabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setHighAvailabilityConfigUndefined: Self = StObject.set(x, "highAvailabilityConfig", js.undefined)
    
    inline def setInstanceType(value: String20): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindow(value: String50): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setSecurityGroupIds(value: String50List): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String50*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setStorageConfigurations(value: StorageConfigurationList): Self = StObject.set(x, "storageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigurationsUndefined: Self = StObject.set(x, "storageConfigurations", js.undefined)
    
    inline def setStorageConfigurationsVarargs(value: StorageConfiguration*): Self = StObject.set(x, "storageConfigurations", js.Array(value*))
    
    inline def setSubnetIds(value: String50List): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String50*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
