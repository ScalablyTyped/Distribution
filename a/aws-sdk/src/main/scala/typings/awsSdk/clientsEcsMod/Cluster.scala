package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The resources attached to a cluster. When using a capacity provider with a cluster, the capacity provider and associated resources are returned as cluster attachments.
    */
  var attachments: js.UndefOr[Attachments] = js.undefined
  
  /**
    * The status of the capacity providers associated with the cluster. The following are the states that are returned.  UPDATE_IN_PROGRESS  The available capacity providers for the cluster are updating.  UPDATE_COMPLETE  The capacity providers have successfully updated.  UPDATE_FAILED  The capacity provider updates failed.  
    */
  var attachmentsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity providers associated with the cluster.
    */
  var capacityProviders: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. For more information about the ARN format, see Amazon Resource Name (ARN) in the Amazon ECS Developer Guide.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * A user-generated string that you use to identify your cluster.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The execute command configuration for the cluster.
    */
  var configuration: js.UndefOr[ClusterConfiguration] = js.undefined
  
  /**
    * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
    */
  var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status.
    */
  var registeredContainerInstancesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace, any new services with Service Connect turned on that are created in the cluster are added as client services in the namespace. This setting only applies to new services that set the enabled parameter to true in the ServiceConnectConfiguration. You can set the namespace of each service individually in the ServiceConnectConfiguration to override this default parameter. Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service Connect. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var serviceConnectDefaults: js.UndefOr[ClusterServiceConnectDefaults] = js.undefined
  
  /**
    * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is on or off for a cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.undefined
  
  /**
    * Additional information about your clusters that are separated by launch type. They include the following:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.undefined
  
  /**
    * The status of the cluster. The following are the possible states that are returned.  ACTIVE  The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.  PROVISIONING  The cluster has capacity providers that are associated with it and the resources needed for the capacity provider are being created.  DEPROVISIONING  The cluster has capacity providers that are associated with it and the resources needed for the capacity provider are being deleted.  FAILED  The cluster has capacity providers that are associated with it and the resources needed for the capacity provider have failed to create.  INACTIVE  The cluster has been deleted. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future. We don't recommend that you rely on INACTIVE clusters persisting.  
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value. You define both. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setActiveServicesCount(value: Integer): Self = StObject.set(x, "activeServicesCount", value.asInstanceOf[js.Any])
    
    inline def setActiveServicesCountUndefined: Self = StObject.set(x, "activeServicesCount", js.undefined)
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsStatus(value: String): Self = StObject.set(x, "attachmentsStatus", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsStatusUndefined: Self = StObject.set(x, "attachmentsStatus", js.undefined)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setCapacityProviders(value: StringList): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    inline def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
    
    inline def setCapacityProvidersVarargs(value: String*): Self = StObject.set(x, "capacityProviders", js.Array(value*))
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfiguration(value: ClusterConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "defaultCapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setDefaultCapacityProviderStrategyUndefined: Self = StObject.set(x, "defaultCapacityProviderStrategy", js.undefined)
    
    inline def setDefaultCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "defaultCapacityProviderStrategy", js.Array(value*))
    
    inline def setPendingTasksCount(value: Integer): Self = StObject.set(x, "pendingTasksCount", value.asInstanceOf[js.Any])
    
    inline def setPendingTasksCountUndefined: Self = StObject.set(x, "pendingTasksCount", js.undefined)
    
    inline def setRegisteredContainerInstancesCount(value: Integer): Self = StObject.set(x, "registeredContainerInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setRegisteredContainerInstancesCountUndefined: Self = StObject.set(x, "registeredContainerInstancesCount", js.undefined)
    
    inline def setRunningTasksCount(value: Integer): Self = StObject.set(x, "runningTasksCount", value.asInstanceOf[js.Any])
    
    inline def setRunningTasksCountUndefined: Self = StObject.set(x, "runningTasksCount", js.undefined)
    
    inline def setServiceConnectDefaults(value: ClusterServiceConnectDefaults): Self = StObject.set(x, "serviceConnectDefaults", value.asInstanceOf[js.Any])
    
    inline def setServiceConnectDefaultsUndefined: Self = StObject.set(x, "serviceConnectDefaults", js.undefined)
    
    inline def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setStatistics(value: Statistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatisticsVarargs(value: KeyValuePair*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
