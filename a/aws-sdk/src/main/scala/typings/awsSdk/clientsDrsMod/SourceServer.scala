package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceServer extends StObject {
  
  /**
    * The ARN of the Source Server.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The Data Replication Info of the Source Server.
    */
  var dataReplicationInfo: js.UndefOr[DataReplicationInfo] = js.undefined
  
  /**
    * The status of the last recovery launch of this Source Server.
    */
  var lastLaunchResult: js.UndefOr[LastLaunchResult] = js.undefined
  
  /**
    * The lifecycle information of this Source Server.
    */
  var lifeCycle: js.UndefOr[LifeCycle] = js.undefined
  
  /**
    * The ID of the Recovery Instance associated with this Source Server.
    */
  var recoveryInstanceId: js.UndefOr[RecoveryInstanceID] = js.undefined
  
  /**
    * The source properties of the Source Server.
    */
  var sourceProperties: js.UndefOr[SourceProperties] = js.undefined
  
  /**
    * The ID of the Source Server.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * The staging area of the source server.
    */
  var stagingArea: js.UndefOr[StagingArea] = js.undefined
  
  /**
    * The tags associated with the Source Server.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object SourceServer {
  
  inline def apply(): SourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceServer] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDataReplicationInfo(value: DataReplicationInfo): Self = StObject.set(x, "dataReplicationInfo", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInfoUndefined: Self = StObject.set(x, "dataReplicationInfo", js.undefined)
    
    inline def setLastLaunchResult(value: LastLaunchResult): Self = StObject.set(x, "lastLaunchResult", value.asInstanceOf[js.Any])
    
    inline def setLastLaunchResultUndefined: Self = StObject.set(x, "lastLaunchResult", js.undefined)
    
    inline def setLifeCycle(value: LifeCycle): Self = StObject.set(x, "lifeCycle", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleUndefined: Self = StObject.set(x, "lifeCycle", js.undefined)
    
    inline def setRecoveryInstanceId(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceId", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIdUndefined: Self = StObject.set(x, "recoveryInstanceId", js.undefined)
    
    inline def setSourceProperties(value: SourceProperties): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setStagingArea(value: StagingArea): Self = StObject.set(x, "stagingArea", value.asInstanceOf[js.Any])
    
    inline def setStagingAreaUndefined: Self = StObject.set(x, "stagingArea", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
