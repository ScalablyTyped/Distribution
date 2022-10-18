package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedDisk extends StObject {
  
  /**
    * The path of the disk (e.g., /dev/xvdf).
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}
object AttachedDisk {
  
  inline def apply(): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDisk]
  }
  
  extension [Self <: AttachedDisk](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    inline def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
