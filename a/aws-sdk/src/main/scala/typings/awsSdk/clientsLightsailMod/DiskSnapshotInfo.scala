package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskSnapshotInfo extends StObject {
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}
object DiskSnapshotInfo {
  
  inline def apply(): DiskSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshotInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskSnapshotInfo] (val x: Self) extends AnyVal {
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
