package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentStorage extends StObject {
  
  /**
    * The size of the persistent storage in gigabytes (specifically GiB).  Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64. 
    */
  var sizeInGiB: PersistentStorageSizeInGiBInteger
}
object PersistentStorage {
  
  inline def apply(sizeInGiB: PersistentStorageSizeInGiBInteger): PersistentStorage = {
    val __obj = js.Dynamic.literal(sizeInGiB = sizeInGiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentStorage] (val x: Self) extends AnyVal {
    
    inline def setSizeInGiB(value: PersistentStorageSizeInGiBInteger): Self = StObject.set(x, "sizeInGiB", value.asInstanceOf[js.Any])
  }
}
