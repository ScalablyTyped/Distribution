package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoSnapshotDetails extends StObject {
  
  /**
    * The timestamp when the automatic snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date of the automatic snapshot in YYYY-MM-DD format.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot was created.
    */
  var fromAttachedDisks: js.UndefOr[AttachedDiskList] = js.undefined
  
  /**
    * The status of the automatic snapshot.
    */
  var status: js.UndefOr[AutoSnapshotStatus] = js.undefined
}
object AutoSnapshotDetails {
  
  inline def apply(): AutoSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSnapshotDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoSnapshotDetails] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFromAttachedDisks(value: AttachedDiskList): Self = StObject.set(x, "fromAttachedDisks", value.asInstanceOf[js.Any])
    
    inline def setFromAttachedDisksUndefined: Self = StObject.set(x, "fromAttachedDisks", js.undefined)
    
    inline def setFromAttachedDisksVarargs(value: AttachedDisk*): Self = StObject.set(x, "fromAttachedDisks", js.Array(value*))
    
    inline def setStatus(value: AutoSnapshotStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
