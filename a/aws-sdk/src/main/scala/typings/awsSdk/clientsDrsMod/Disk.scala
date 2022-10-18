package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disk extends StObject {
  
  /**
    * The amount of storage on the disk in bytes.
    */
  var bytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The disk or device name.
    */
  var deviceName: js.UndefOr[BoundedString] = js.undefined
}
object Disk {
  
  inline def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  extension [Self <: Disk](x: Self) {
    
    inline def setBytes(value: PositiveInteger): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setDeviceName(value: BoundedString): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
