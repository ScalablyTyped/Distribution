package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationSet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Details about who created the replication set.
    */
  var createdBy: Arn
  
  /**
    * When the replication set was created.
    */
  var createdTime: js.Date
  
  /**
    * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you can't delete the last Amazon Web Services Region in the replication set. 
    */
  var deletionProtected: Boolean
  
  /**
    * Who last modified the replication set.
    */
  var lastModifiedBy: Arn
  
  /**
    * When the replication set was last updated.
    */
  var lastModifiedTime: js.Date
  
  /**
    * The map between each Amazon Web Services Region in your replication set and the KMS key that's used to encrypt the data in that Region.
    */
  var regionMap: RegionInfoMap
  
  /**
    * The status of the replication set. If the replication set is still pending, you can't use Incident Manager functionality.
    */
  var status: ReplicationSetStatus
}
object ReplicationSet {
  
  inline def apply(
    createdBy: Arn,
    createdTime: js.Date,
    deletionProtected: Boolean,
    lastModifiedBy: Arn,
    lastModifiedTime: js.Date,
    regionMap: RegionInfoMap,
    status: ReplicationSetStatus
  ): ReplicationSet = {
    val __obj = js.Dynamic.literal(createdBy = createdBy.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], deletionProtected = deletionProtected.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], regionMap = regionMap.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationSet] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedBy(value: Arn): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtected(value: Boolean): Self = StObject.set(x, "deletionProtected", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: Arn): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setRegionMap(value: RegionInfoMap): Self = StObject.set(x, "regionMap", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReplicationSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
