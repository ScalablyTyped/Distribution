package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSOriginSnapshotConfiguration extends StObject {
  
  /**
    * The strategy used when copying data from the snapshot to the new volume.     CLONE - The new volume references the data in the origin snapshot. Cloning a snapshot is faster than copying the data from a snapshot to a new volume and doesn't consume disk throughput. However, the origin snapshot can't be deleted if there is a volume using its copied data.     FULL_COPY - Copies all data from the snapshot to the new volume.   
    */
  var CopyStrategy: js.UndefOr[OpenZFSCopyStrategy] = js.undefined
  
  var SnapshotARN: js.UndefOr[ResourceARN] = js.undefined
}
object OpenZFSOriginSnapshotConfiguration {
  
  inline def apply(): OpenZFSOriginSnapshotConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenZFSOriginSnapshotConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenZFSOriginSnapshotConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCopyStrategy(value: OpenZFSCopyStrategy): Self = StObject.set(x, "CopyStrategy", value.asInstanceOf[js.Any])
    
    inline def setCopyStrategyUndefined: Self = StObject.set(x, "CopyStrategy", js.undefined)
    
    inline def setSnapshotARN(value: ResourceARN): Self = StObject.set(x, "SnapshotARN", value.asInstanceOf[js.Any])
    
    inline def setSnapshotARNUndefined: Self = StObject.set(x, "SnapshotARN", js.undefined)
  }
}
