package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoverySnapshot extends StObject {
  
  /**
    * A list of EBS snapshots.
    */
  var ebsSnapshots: js.UndefOr[EbsSnapshotsList] = js.undefined
  
  /**
    * The timestamp of when we expect the snapshot to be taken.
    */
  var expectedTimestamp: ISO8601DatetimeString
  
  /**
    * The ID of the Recovery Snapshot.
    */
  var snapshotID: RecoverySnapshotID
  
  /**
    * The ID of the Source Server that the snapshot was taken for.
    */
  var sourceServerID: SourceServerID
  
  /**
    * The actual timestamp that the snapshot was taken.
    */
  var timestamp: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object RecoverySnapshot {
  
  inline def apply(
    expectedTimestamp: ISO8601DatetimeString,
    snapshotID: RecoverySnapshotID,
    sourceServerID: SourceServerID
  ): RecoverySnapshot = {
    val __obj = js.Dynamic.literal(expectedTimestamp = expectedTimestamp.asInstanceOf[js.Any], snapshotID = snapshotID.asInstanceOf[js.Any], sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoverySnapshot]
  }
  
  extension [Self <: RecoverySnapshot](x: Self) {
    
    inline def setEbsSnapshots(value: EbsSnapshotsList): Self = StObject.set(x, "ebsSnapshots", value.asInstanceOf[js.Any])
    
    inline def setEbsSnapshotsUndefined: Self = StObject.set(x, "ebsSnapshots", js.undefined)
    
    inline def setEbsSnapshotsVarargs(value: ebsSnapshot*): Self = StObject.set(x, "ebsSnapshots", js.Array(value*))
    
    inline def setExpectedTimestamp(value: ISO8601DatetimeString): Self = StObject.set(x, "expectedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSnapshotID(value: RecoverySnapshotID): Self = StObject.set(x, "snapshotID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: ISO8601DatetimeString): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
