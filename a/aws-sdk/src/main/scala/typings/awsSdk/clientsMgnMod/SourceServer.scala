package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceServer extends StObject {
  
  /**
    * Source server ARN.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Source server data replication info.
    */
  var dataReplicationInfo: js.UndefOr[DataReplicationInfo] = js.undefined
  
  /**
    * Source server archived status.
    */
  var isArchived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Source server launched instance.
    */
  var launchedInstance: js.UndefOr[LaunchedInstance] = js.undefined
  
  /**
    * Source server lifecycle state.
    */
  var lifeCycle: js.UndefOr[LifeCycle] = js.undefined
  
  /**
    * Source server replication type.
    */
  var replicationType: js.UndefOr[ReplicationType] = js.undefined
  
  /**
    * Source server properties.
    */
  var sourceProperties: js.UndefOr[SourceProperties] = js.undefined
  
  /**
    * Source server ID.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * Source server Tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Source server vCenter client id.
    */
  var vcenterClientID: js.UndefOr[VcenterClientID] = js.undefined
}
object SourceServer {
  
  inline def apply(): SourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceServer]
  }
  
  extension [Self <: SourceServer](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDataReplicationInfo(value: DataReplicationInfo): Self = StObject.set(x, "dataReplicationInfo", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInfoUndefined: Self = StObject.set(x, "dataReplicationInfo", js.undefined)
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
    
    inline def setLaunchedInstance(value: LaunchedInstance): Self = StObject.set(x, "launchedInstance", value.asInstanceOf[js.Any])
    
    inline def setLaunchedInstanceUndefined: Self = StObject.set(x, "launchedInstance", js.undefined)
    
    inline def setLifeCycle(value: LifeCycle): Self = StObject.set(x, "lifeCycle", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleUndefined: Self = StObject.set(x, "lifeCycle", js.undefined)
    
    inline def setReplicationType(value: ReplicationType): Self = StObject.set(x, "replicationType", value.asInstanceOf[js.Any])
    
    inline def setReplicationTypeUndefined: Self = StObject.set(x, "replicationType", js.undefined)
    
    inline def setSourceProperties(value: SourceProperties): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVcenterClientID(value: VcenterClientID): Self = StObject.set(x, "vcenterClientID", value.asInstanceOf[js.Any])
    
    inline def setVcenterClientIDUndefined: Self = StObject.set(x, "vcenterClientID", js.undefined)
  }
}
