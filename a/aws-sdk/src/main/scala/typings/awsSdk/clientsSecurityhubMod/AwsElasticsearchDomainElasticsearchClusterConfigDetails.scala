package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainElasticsearchClusterConfigDetails extends StObject {
  
  /**
    * The number of instances to use for the master node. If this attribute is specified, then DedicatedMasterEnabled must be true.
    */
  var DedicatedMasterCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster management tasks, but doesn't hold data or respond to data upload requests.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hardware configuration of the computer that hosts the dedicated master node. A sample value is m3.medium.elasticsearch. If this attribute is specified, then DedicatedMasterEnabled must be true. For a list of valid values, see Supported instance types in Amazon OpenSearch Service in the Amazon OpenSearch Service Developer Guide.
    */
  var DedicatedMasterType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of data nodes to use in the Elasticsearch domain.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance type for your data nodes. For example, m3.medium.elasticsearch. For a list of valid values, see Supported instance types in Amazon OpenSearch Service in the Amazon OpenSearch Service Developer Guide.
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Configuration options for zone awareness. Provided if ZoneAwarenessEnabled is true.
    */
  var ZoneAwarenessConfig: js.UndefOr[AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails] = js.undefined
  
  /**
    * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This prevents data loss and minimizes downtime if a node or data center fails.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}
object AwsElasticsearchDomainElasticsearchClusterConfigDetails {
  
  inline def apply(): AwsElasticsearchDomainElasticsearchClusterConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainElasticsearchClusterConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElasticsearchDomainElasticsearchClusterConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setDedicatedMasterCount(value: Integer): Self = StObject.set(x, "DedicatedMasterCount", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterCountUndefined: Self = StObject.set(x, "DedicatedMasterCount", js.undefined)
    
    inline def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "DedicatedMasterEnabled", js.undefined)
    
    inline def setDedicatedMasterType(value: NonEmptyString): Self = StObject.set(x, "DedicatedMasterType", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "DedicatedMasterType", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setZoneAwarenessConfig(value: AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails): Self = StObject.set(x, "ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "ZoneAwarenessConfig", js.undefined)
    
    inline def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "ZoneAwarenessEnabled", js.undefined)
  }
}
