package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceSnapshotResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.undefined
}
object GetInstanceSnapshotResult {
  
  inline def apply(): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceSnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceSnapshot(value: InstanceSnapshot): Self = StObject.set(x, "instanceSnapshot", value.asInstanceOf[js.Any])
    
    inline def setInstanceSnapshotUndefined: Self = StObject.set(x, "instanceSnapshot", js.undefined)
  }
}
