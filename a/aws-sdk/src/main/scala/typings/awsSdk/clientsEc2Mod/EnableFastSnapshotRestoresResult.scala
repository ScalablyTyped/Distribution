package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableFastSnapshotRestoresResult extends StObject {
  
  /**
    * Information about the snapshots for which fast snapshot restores were successfully enabled.
    */
  var Successful: js.UndefOr[EnableFastSnapshotRestoreSuccessSet] = js.undefined
  
  /**
    * Information about the snapshots for which fast snapshot restores could not be enabled.
    */
  var Unsuccessful: js.UndefOr[EnableFastSnapshotRestoreErrorSet] = js.undefined
}
object EnableFastSnapshotRestoresResult {
  
  inline def apply(): EnableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoresResult]
  }
  
  extension [Self <: EnableFastSnapshotRestoresResult](x: Self) {
    
    inline def setSuccessful(value: EnableFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: EnableFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "Successful", js.Array(value*))
    
    inline def setUnsuccessful(value: EnableFastSnapshotRestoreErrorSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: EnableFastSnapshotRestoreErrorItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value*))
  }
}
