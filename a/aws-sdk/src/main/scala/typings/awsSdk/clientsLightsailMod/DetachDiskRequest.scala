package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachDiskRequest extends StObject {
  
  /**
    * The unique name of the disk you want to detach from your instance (e.g., my-disk).
    */
  var diskName: ResourceName
}
object DetachDiskRequest {
  
  inline def apply(diskName: ResourceName): DetachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachDiskRequest]
  }
  
  extension [Self <: DetachDiskRequest](x: Self) {
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
  }
}
