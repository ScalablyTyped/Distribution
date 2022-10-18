package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoreStateErrorItem extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The error.
    */
  var Error: js.UndefOr[DisableFastSnapshotRestoreStateError] = js.undefined
}
object DisableFastSnapshotRestoreStateErrorItem {
  
  inline def apply(): DisableFastSnapshotRestoreStateErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreStateErrorItem]
  }
  
  extension [Self <: DisableFastSnapshotRestoreStateErrorItem](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setError(value: DisableFastSnapshotRestoreStateError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
