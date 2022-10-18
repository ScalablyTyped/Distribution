package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The ID of the destination Amazon EFS file system.
    */
  var FileSystemId: typings.awsSdk.clientsEfsMod.FileSystemId
  
  /**
    * The time when the most recent sync was successfully completed on the destination file system. Any changes to data on the source file system that occurred before this time have been successfully replicated to the destination file system. Any changes that occurred after this time might not be fully replicated.
    */
  var LastReplicatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services Region in which the destination file system is located.
    */
  var Region: RegionName
  
  /**
    * Describes the status of the destination Amazon EFS file system. If the status is ERROR, the destination file system in the replication configuration is in a failed state and is unrecoverable. To access the file system data, restore a backup of the failed file system to a new file system.
    */
  var Status: ReplicationStatus
}
object Destination {
  
  inline def apply(FileSystemId: FileSystemId, Region: RegionName, Status: ReplicationStatus): Destination = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setLastReplicatedTimestamp(value: js.Date): Self = StObject.set(x, "LastReplicatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastReplicatedTimestampUndefined: Self = StObject.set(x, "LastReplicatedTimestamp", js.undefined)
    
    inline def setRegion(value: RegionName): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
