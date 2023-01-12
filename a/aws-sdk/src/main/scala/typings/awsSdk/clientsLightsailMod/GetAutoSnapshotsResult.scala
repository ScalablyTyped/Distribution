package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoSnapshotsResult extends StObject {
  
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source instance or disk.
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.undefined
  
  /**
    * The name of the source instance or disk for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object GetAutoSnapshotsResult {
  
  inline def apply(): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAutoSnapshotsResult] (val x: Self) extends AnyVal {
    
    inline def setAutoSnapshots(value: AutoSnapshotDetailsList): Self = StObject.set(x, "autoSnapshots", value.asInstanceOf[js.Any])
    
    inline def setAutoSnapshotsUndefined: Self = StObject.set(x, "autoSnapshots", js.undefined)
    
    inline def setAutoSnapshotsVarargs(value: AutoSnapshotDetails*): Self = StObject.set(x, "autoSnapshots", js.Array(value*))
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
