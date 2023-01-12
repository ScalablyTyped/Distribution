package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotLimits extends StObject {
  
  /**
    * The current number of manual snapshots of the directory.
    */
  var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined
  
  /**
    * The maximum number of manual snapshots allowed.
    */
  var ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined
  
  /**
    * Indicates if the manual snapshot limit has been reached.
    */
  var ManualSnapshotsLimitReached: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ManualSnapshotsLimitReached] = js.undefined
}
object SnapshotLimits {
  
  inline def apply(): SnapshotLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotLimits] (val x: Self) extends AnyVal {
    
    inline def setManualSnapshotsCurrentCount(value: Limit): Self = StObject.set(x, "ManualSnapshotsCurrentCount", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotsCurrentCountUndefined: Self = StObject.set(x, "ManualSnapshotsCurrentCount", js.undefined)
    
    inline def setManualSnapshotsLimit(value: Limit): Self = StObject.set(x, "ManualSnapshotsLimit", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotsLimitReached(value: ManualSnapshotsLimitReached): Self = StObject.set(x, "ManualSnapshotsLimitReached", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotsLimitReachedUndefined: Self = StObject.set(x, "ManualSnapshotsLimitReached", js.undefined)
    
    inline def setManualSnapshotsLimitUndefined: Self = StObject.set(x, "ManualSnapshotsLimit", js.undefined)
  }
}
