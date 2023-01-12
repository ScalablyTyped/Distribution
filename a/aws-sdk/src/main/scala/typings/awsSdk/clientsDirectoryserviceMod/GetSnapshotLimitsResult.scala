package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotLimitsResult extends StObject {
  
  /**
    * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
    */
  var SnapshotLimits: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SnapshotLimits] = js.undefined
}
object GetSnapshotLimitsResult {
  
  inline def apply(): GetSnapshotLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotLimitsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSnapshotLimitsResult] (val x: Self) extends AnyVal {
    
    inline def setSnapshotLimits(value: SnapshotLimits): Self = StObject.set(x, "SnapshotLimits", value.asInstanceOf[js.Any])
    
    inline def setSnapshotLimitsUndefined: Self = StObject.set(x, "SnapshotLimits", js.undefined)
  }
}
