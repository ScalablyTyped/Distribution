package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskInfo extends StObject {
  
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The disk name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The disk path.
    */
  var path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}
object DiskInfo {
  
  inline def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  
  extension [Self <: DiskInfo](x: Self) {
    
    inline def setIsSystemDisk(value: Boolean): Self = StObject.set(x, "isSystemDisk", value.asInstanceOf[js.Any])
    
    inline def setIsSystemDiskUndefined: Self = StObject.set(x, "isSystemDisk", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
