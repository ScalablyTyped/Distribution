package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * The short name of one or more capacity providers to associate with the cluster. A capacity provider must be associated with a cluster before it can be included as part of the default capacity provider strategy of the cluster or used in a capacity provider strategy when calling the CreateService or RunTask actions. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must be created but not associated with another cluster. New Auto Scaling group capacity providers can be created with the CreateCapacityProvider API operation. To use a Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created.
    */
  var capacityProviders: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of your cluster. If you don't specify a name for your cluster, you create a cluster that's named default. Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed. 
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The execute command configuration for the cluster.
    */
  var configuration: js.UndefOr[ClusterConfiguration] = js.undefined
  
  /**
    * The capacity provider strategy to set as the default for the cluster. After a default capacity provider strategy is set for a cluster, when you call the RunTask or CreateService APIs with no capacity provider strategy or launch type specified, the default capacity provider strategy for the cluster is used. If a default capacity provider strategy isn't defined for a cluster when it was created, it can be defined later with the PutClusterCapacityProviders API operation.
    */
  var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The setting to use when creating a cluster. This parameter is used to turn on CloudWatch Container Insights for a cluster. If this value is specified, it overrides the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var settings: js.UndefOr[ClusterSettings] = js.undefined
  
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value. You define both. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(): CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  extension [Self <: CreateClusterRequest](x: Self) {
    
    inline def setCapacityProviders(value: StringList): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    inline def setCapacityProvidersUndefined: Self = StObject.set(x, "capacityProviders", js.undefined)
    
    inline def setCapacityProvidersVarargs(value: String*): Self = StObject.set(x, "capacityProviders", js.Array(value*))
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfiguration(value: ClusterConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "defaultCapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setDefaultCapacityProviderStrategyUndefined: Self = StObject.set(x, "defaultCapacityProviderStrategy", js.undefined)
    
    inline def setDefaultCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "defaultCapacityProviderStrategy", js.Array(value*))
    
    inline def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
