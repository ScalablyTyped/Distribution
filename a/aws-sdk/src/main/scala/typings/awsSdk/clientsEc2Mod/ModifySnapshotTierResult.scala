package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySnapshotTierResult extends StObject {
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the archive process was started.
    */
  var TieringStartTime: js.UndefOr[js.Date] = js.undefined
}
object ModifySnapshotTierResult {
  
  inline def apply(): ModifySnapshotTierResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySnapshotTierResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifySnapshotTierResult] (val x: Self) extends AnyVal {
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setTieringStartTime(value: js.Date): Self = StObject.set(x, "TieringStartTime", value.asInstanceOf[js.Any])
    
    inline def setTieringStartTimeUndefined: Self = StObject.set(x, "TieringStartTime", js.undefined)
  }
}
