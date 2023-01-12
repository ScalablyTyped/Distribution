package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteSnapshotRequest extends StObject {
  
  /**
    * The number of blocks that were written to the snapshot.
    */
  var ChangedBlocksCount: typings.awsSdk.clientsEbsMod.ChangedBlocksCount
  
  /**
    * An aggregated Base-64 SHA256 checksum based on the checksums of each written block. To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written block in ascending order of their block index, concatenate them to form a single string, and then generate the checksum on the entire string using the SHA256 algorithm.
    */
  var Checksum: js.UndefOr[typings.awsSdk.clientsEbsMod.Checksum] = js.undefined
  
  /**
    * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is LINEAR.
    */
  var ChecksumAggregationMethod: js.UndefOr[typings.awsSdk.clientsEbsMod.ChecksumAggregationMethod] = js.undefined
  
  /**
    * The algorithm used to generate the checksum. Currently, the only supported algorithm is SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.clientsEbsMod.ChecksumAlgorithm] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsSdk.clientsEbsMod.SnapshotId
}
object CompleteSnapshotRequest {
  
  inline def apply(ChangedBlocksCount: ChangedBlocksCount, SnapshotId: SnapshotId): CompleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(ChangedBlocksCount = ChangedBlocksCount.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setChangedBlocksCount(value: ChangedBlocksCount): Self = StObject.set(x, "ChangedBlocksCount", value.asInstanceOf[js.Any])
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumAggregationMethod(value: ChecksumAggregationMethod): Self = StObject.set(x, "ChecksumAggregationMethod", value.asInstanceOf[js.Any])
    
    inline def setChecksumAggregationMethodUndefined: Self = StObject.set(x, "ChecksumAggregationMethod", js.undefined)
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
