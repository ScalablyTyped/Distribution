package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskMap extends StObject {
  
  /**
    * The new disk name (e.g., my-new-disk).
    */
  var newDiskName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The original disk path exposed to the instance (for example, /dev/sdh).
    */
  var originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined
}
object DiskMap {
  
  inline def apply(): DiskMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskMap] (val x: Self) extends AnyVal {
    
    inline def setNewDiskName(value: ResourceName): Self = StObject.set(x, "newDiskName", value.asInstanceOf[js.Any])
    
    inline def setNewDiskNameUndefined: Self = StObject.set(x, "newDiskName", js.undefined)
    
    inline def setOriginalDiskPath(value: NonEmptyString): Self = StObject.set(x, "originalDiskPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalDiskPathUndefined: Self = StObject.set(x, "originalDiskPath", js.undefined)
  }
}
