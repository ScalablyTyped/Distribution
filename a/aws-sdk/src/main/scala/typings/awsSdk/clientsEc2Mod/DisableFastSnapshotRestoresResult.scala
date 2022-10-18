package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoresResult extends StObject {
  
  /**
    * Information about the snapshots for which fast snapshot restores were successfully disabled.
    */
  var Successful: js.UndefOr[DisableFastSnapshotRestoreSuccessSet] = js.undefined
  
  /**
    * Information about the snapshots for which fast snapshot restores could not be disabled.
    */
  var Unsuccessful: js.UndefOr[DisableFastSnapshotRestoreErrorSet] = js.undefined
}
object DisableFastSnapshotRestoresResult {
  
  inline def apply(): DisableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoresResult]
  }
  
  extension [Self <: DisableFastSnapshotRestoresResult](x: Self) {
    
    inline def setSuccessful(value: DisableFastSnapshotRestoreSuccessSet): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: DisableFastSnapshotRestoreSuccessItem*): Self = StObject.set(x, "Successful", js.Array(value*))
    
    inline def setUnsuccessful(value: DisableFastSnapshotRestoreErrorSet): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: DisableFastSnapshotRestoreErrorItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value*))
  }
}
