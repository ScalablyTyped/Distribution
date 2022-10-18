package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceServersRequestFilters extends StObject {
  
  /**
    * Request to filter Source Servers list by archived.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request to filter Source Servers list by life cycle states.
    */
  var lifeCycleStates: js.UndefOr[LifeCycleStates] = js.undefined
  
  /**
    * Request to filter Source Servers list by replication type.
    */
  var replicationTypes: js.UndefOr[ReplicationTypes] = js.undefined
  
  /**
    * Request to filter Source Servers list by Source Server ID.
    */
  var sourceServerIDs: js.UndefOr[DescribeSourceServersRequestFiltersIDs] = js.undefined
}
object DescribeSourceServersRequestFilters {
  
  inline def apply(): DescribeSourceServersRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSourceServersRequestFilters]
  }
  
  extension [Self <: DescribeSourceServersRequestFilters](x: Self) {
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setLifeCycleStates(value: LifeCycleStates): Self = StObject.set(x, "lifeCycleStates", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatesUndefined: Self = StObject.set(x, "lifeCycleStates", js.undefined)
    
    inline def setLifeCycleStatesVarargs(value: LifeCycleState*): Self = StObject.set(x, "lifeCycleStates", js.Array(value*))
    
    inline def setReplicationTypes(value: ReplicationTypes): Self = StObject.set(x, "replicationTypes", value.asInstanceOf[js.Any])
    
    inline def setReplicationTypesUndefined: Self = StObject.set(x, "replicationTypes", js.undefined)
    
    inline def setReplicationTypesVarargs(value: ReplicationType*): Self = StObject.set(x, "replicationTypes", js.Array(value*))
    
    inline def setSourceServerIDs(value: DescribeSourceServersRequestFiltersIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsUndefined: Self = StObject.set(x, "sourceServerIDs", js.undefined)
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
  }
}
