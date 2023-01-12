package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheLustreMetadataConfiguration extends StObject {
  
  /**
    * The storage capacity of the Lustre MDT (Metadata Target) storage volume in gibibytes (GiB). The only supported value is 2400 GiB.
    */
  var StorageCapacity: MetadataStorageCapacity
}
object FileCacheLustreMetadataConfiguration {
  
  inline def apply(StorageCapacity: MetadataStorageCapacity): FileCacheLustreMetadataConfiguration = {
    val __obj = js.Dynamic.literal(StorageCapacity = StorageCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCacheLustreMetadataConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCacheLustreMetadataConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStorageCapacity(value: MetadataStorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
  }
}
