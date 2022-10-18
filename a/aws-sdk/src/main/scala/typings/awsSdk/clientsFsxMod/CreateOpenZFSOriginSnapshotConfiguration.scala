package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpenZFSOriginSnapshotConfiguration extends StObject {
  
  /**
    * The strategy used when copying data from the snapshot to the new volume.     CLONE - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than copying data from the snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot can't be deleted if there is a volume using its copied data.     FULL_COPY - Copies all data from the snapshot to the new volume.   
    */
  var CopyStrategy: OpenZFSCopyStrategy
  
  var SnapshotARN: ResourceARN
}
object CreateOpenZFSOriginSnapshotConfiguration {
  
  inline def apply(CopyStrategy: OpenZFSCopyStrategy, SnapshotARN: ResourceARN): CreateOpenZFSOriginSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(CopyStrategy = CopyStrategy.asInstanceOf[js.Any], SnapshotARN = SnapshotARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpenZFSOriginSnapshotConfiguration]
  }
  
  extension [Self <: CreateOpenZFSOriginSnapshotConfiguration](x: Self) {
    
    inline def setCopyStrategy(value: OpenZFSCopyStrategy): Self = StObject.set(x, "CopyStrategy", value.asInstanceOf[js.Any])
    
    inline def setSnapshotARN(value: ResourceARN): Self = StObject.set(x, "SnapshotARN", value.asInstanceOf[js.Any])
  }
}
