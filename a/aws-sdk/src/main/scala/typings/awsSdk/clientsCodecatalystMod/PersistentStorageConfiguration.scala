package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentStorageConfiguration extends StObject {
  
  /**
    * The size of the persistent storage in gigabytes (specifically GiB).  Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64. 
    */
  var sizeInGiB: PersistentStorageConfigurationSizeInGiBInteger
}
object PersistentStorageConfiguration {
  
  inline def apply(sizeInGiB: PersistentStorageConfigurationSizeInGiBInteger): PersistentStorageConfiguration = {
    val __obj = js.Dynamic.literal(sizeInGiB = sizeInGiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentStorageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentStorageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSizeInGiB(value: PersistentStorageConfigurationSizeInGiBInteger): Self = StObject.set(x, "sizeInGiB", value.asInstanceOf[js.Any])
  }
}
