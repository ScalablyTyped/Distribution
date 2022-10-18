package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentResponse extends StObject {
  
  /**
    * The number of instances included in the runtime environment. A standalone runtime environment has a maxiumum of one instance. Currently, a high availability runtime environment has a maximum of two instances. 
    */
  var actualCapacity: js.UndefOr[CapacityValue] = js.undefined
  
  /**
    * The timestamp when the runtime environment was created.
    */
  var creationTime: js.Date
  
  /**
    * The description of the runtime environment.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The target platform for the runtime environment.
    */
  var engineType: EngineType
  
  /**
    * The version of the runtime engine.
    */
  var engineVersion: EngineVersion
  
  /**
    * The Amazon Resource Name (ARN) of the runtime environment.
    */
  var environmentArn: Arn
  
  /**
    * The unique identifier of the runtime environment.
    */
  var environmentId: Identifier
  
  /**
    * The desired capacity of the high availability configuration for the runtime environment.
    */
  var highAvailabilityConfig: js.UndefOr[HighAvailabilityConfig] = js.undefined
  
  /**
    * The type of instance underlying the runtime environment.
    */
  var instanceType: String20
  
  /**
    * The Amazon Resource Name (ARN) for the load balancer used with the runtime environment.
    */
  var loadBalancerArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the runtime environment. 
    */
  var name: EntityName
  
  /**
    * Indicates the pending maintenance scheduled on this environment.
    */
  var pendingMaintenance: js.UndefOr[PendingMaintenance] = js.undefined
  
  /**
    * Configures a desired maintenance window for the environment. If you do not provide a value, a random system-generated value will be assigned.
    */
  var preferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * Whether applications running in this runtime environment are publicly accessible. 
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique identifiers of the security groups assigned to this runtime environment.
    */
  var securityGroupIds: String50List
  
  /**
    * The status of the runtime environment.
    */
  var status: EnvironmentLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The storage configurations defined for the runtime environment.
    */
  var storageConfigurations: js.UndefOr[StorageConfigurationList] = js.undefined
  
  /**
    * The unique identifiers of the subnets assigned to this runtime environment.
    */
  var subnetIds: String50List
  
  /**
    * The tags defined for this runtime environment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The unique identifier for the VPC used with this runtime environment.
    */
  var vpcId: String50
}
object GetEnvironmentResponse {
  
  inline def apply(
    creationTime: js.Date,
    engineType: EngineType,
    engineVersion: EngineVersion,
    environmentArn: Arn,
    environmentId: Identifier,
    instanceType: String20,
    name: EntityName,
    securityGroupIds: String50List,
    status: EnvironmentLifecycle,
    subnetIds: String50List,
    vpcId: String50
  ): GetEnvironmentResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], environmentArn = environmentArn.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentResponse]
  }
  
  extension [Self <: GetEnvironmentResponse](x: Self) {
    
    inline def setActualCapacity(value: CapacityValue): Self = StObject.set(x, "actualCapacity", value.asInstanceOf[js.Any])
    
    inline def setActualCapacityUndefined: Self = StObject.set(x, "actualCapacity", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentArn(value: Arn): Self = StObject.set(x, "environmentArn", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setHighAvailabilityConfig(value: HighAvailabilityConfig): Self = StObject.set(x, "highAvailabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setHighAvailabilityConfigUndefined: Self = StObject.set(x, "highAvailabilityConfig", js.undefined)
    
    inline def setInstanceType(value: String20): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArn(value: String): Self = StObject.set(x, "loadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnUndefined: Self = StObject.set(x, "loadBalancerArn", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPendingMaintenance(value: PendingMaintenance): Self = StObject.set(x, "pendingMaintenance", value.asInstanceOf[js.Any])
    
    inline def setPendingMaintenanceUndefined: Self = StObject.set(x, "pendingMaintenance", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setSecurityGroupIds(value: String50List): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String50*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setStatus(value: EnvironmentLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStorageConfigurations(value: StorageConfigurationList): Self = StObject.set(x, "storageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigurationsUndefined: Self = StObject.set(x, "storageConfigurations", js.undefined)
    
    inline def setStorageConfigurationsVarargs(value: StorageConfiguration*): Self = StObject.set(x, "storageConfigurations", js.Array(value*))
    
    inline def setSubnetIds(value: String50List): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String50*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVpcId(value: String50): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
