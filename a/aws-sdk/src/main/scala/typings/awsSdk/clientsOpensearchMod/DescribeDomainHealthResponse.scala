package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainHealthResponse extends StObject {
  
  /**
    * The number of active Availability Zones configured for the domain. If the service is unable to fetch this information, it will return NotAvailable.
    */
  var ActiveAvailabilityZoneCount: js.UndefOr[NumberOfAZs] = js.undefined
  
  /**
    * The number of Availability Zones configured for the domain. If the service is unable to fetch this information, it will return NotAvailable.
    */
  var AvailabilityZoneCount: js.UndefOr[NumberOfAZs] = js.undefined
  
  /**
    * The current health status of your cluster.    Red - At least one primary shard is not allocated to any node.    Yellow - All primary shards are allocated to nodes, but some replicas aren’t.    Green - All primary shards and their replicas are allocated to nodes.    NotAvailable - Unable to retrieve cluster health.  
    */
  var ClusterHealth: js.UndefOr[DomainHealth] = js.undefined
  
  /**
    * The number of data nodes configured for the domain. If the service is unable to fetch this information, it will return NotAvailable.
    */
  var DataNodeCount: js.UndefOr[NumberOfNodes] = js.undefined
  
  /**
    * A boolean that indicates if dedicated master nodes are activated for the domain.
    */
  var DedicatedMaster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current state of the domain.    Processing - The domain has updates in progress.    Active - Requested changes have been processed and deployed to the domain.  
    */
  var DomainState: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainState] = js.undefined
  
  /**
    * A list of EnvironmentInfo for the domain. 
    */
  var EnvironmentInformation: js.UndefOr[EnvironmentInfoList] = js.undefined
  
  /**
    * The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this value is the number of dedicated master nodes configured for the domain. If the service is unable to fetch this information, it will return NotAvailable.
    */
  var MasterEligibleNodeCount: js.UndefOr[NumberOfNodes] = js.undefined
  
  /**
    * Indicates whether the domain has an elected master node.    Available - The domain has an elected master node.    UnAvailable - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been reached.  
    */
  var MasterNode: js.UndefOr[MasterNodeStatus] = js.undefined
  
  /**
    * The number of standby Availability Zones configured for the domain. If the service is unable to fetch this information, it will return NotAvailable.
    */
  var StandByAvailabilityZoneCount: js.UndefOr[NumberOfAZs] = js.undefined
  
  /**
    * The total number of primary and replica shards for the domain.
    */
  var TotalShards: js.UndefOr[NumberOfShards] = js.undefined
  
  /**
    * The total number of primary and replica shards not allocated to any of the nodes for the cluster.
    */
  var TotalUnAssignedShards: js.UndefOr[NumberOfShards] = js.undefined
  
  /**
    * The number of warm nodes configured for the domain.
    */
  var WarmNodeCount: js.UndefOr[NumberOfNodes] = js.undefined
}
object DescribeDomainHealthResponse {
  
  inline def apply(): DescribeDomainHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainHealthResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainHealthResponse] (val x: Self) extends AnyVal {
    
    inline def setActiveAvailabilityZoneCount(value: NumberOfAZs): Self = StObject.set(x, "ActiveAvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setActiveAvailabilityZoneCountUndefined: Self = StObject.set(x, "ActiveAvailabilityZoneCount", js.undefined)
    
    inline def setAvailabilityZoneCount(value: NumberOfAZs): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
    
    inline def setClusterHealth(value: DomainHealth): Self = StObject.set(x, "ClusterHealth", value.asInstanceOf[js.Any])
    
    inline def setClusterHealthUndefined: Self = StObject.set(x, "ClusterHealth", js.undefined)
    
    inline def setDataNodeCount(value: NumberOfNodes): Self = StObject.set(x, "DataNodeCount", value.asInstanceOf[js.Any])
    
    inline def setDataNodeCountUndefined: Self = StObject.set(x, "DataNodeCount", js.undefined)
    
    inline def setDedicatedMaster(value: Boolean): Self = StObject.set(x, "DedicatedMaster", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterUndefined: Self = StObject.set(x, "DedicatedMaster", js.undefined)
    
    inline def setDomainState(value: DomainState): Self = StObject.set(x, "DomainState", value.asInstanceOf[js.Any])
    
    inline def setDomainStateUndefined: Self = StObject.set(x, "DomainState", js.undefined)
    
    inline def setEnvironmentInformation(value: EnvironmentInfoList): Self = StObject.set(x, "EnvironmentInformation", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentInformationUndefined: Self = StObject.set(x, "EnvironmentInformation", js.undefined)
    
    inline def setEnvironmentInformationVarargs(value: EnvironmentInfo*): Self = StObject.set(x, "EnvironmentInformation", js.Array(value*))
    
    inline def setMasterEligibleNodeCount(value: NumberOfNodes): Self = StObject.set(x, "MasterEligibleNodeCount", value.asInstanceOf[js.Any])
    
    inline def setMasterEligibleNodeCountUndefined: Self = StObject.set(x, "MasterEligibleNodeCount", js.undefined)
    
    inline def setMasterNode(value: MasterNodeStatus): Self = StObject.set(x, "MasterNode", value.asInstanceOf[js.Any])
    
    inline def setMasterNodeUndefined: Self = StObject.set(x, "MasterNode", js.undefined)
    
    inline def setStandByAvailabilityZoneCount(value: NumberOfAZs): Self = StObject.set(x, "StandByAvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setStandByAvailabilityZoneCountUndefined: Self = StObject.set(x, "StandByAvailabilityZoneCount", js.undefined)
    
    inline def setTotalShards(value: NumberOfShards): Self = StObject.set(x, "TotalShards", value.asInstanceOf[js.Any])
    
    inline def setTotalShardsUndefined: Self = StObject.set(x, "TotalShards", js.undefined)
    
    inline def setTotalUnAssignedShards(value: NumberOfShards): Self = StObject.set(x, "TotalUnAssignedShards", value.asInstanceOf[js.Any])
    
    inline def setTotalUnAssignedShardsUndefined: Self = StObject.set(x, "TotalUnAssignedShards", js.undefined)
    
    inline def setWarmNodeCount(value: NumberOfNodes): Self = StObject.set(x, "WarmNodeCount", value.asInstanceOf[js.Any])
    
    inline def setWarmNodeCountUndefined: Self = StObject.set(x, "WarmNodeCount", js.undefined)
  }
}
