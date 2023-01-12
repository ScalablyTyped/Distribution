package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageConfiguration extends StObject {
  
  /**
    * Defines the storage configuration for an Amazon EFS file system.
    */
  var efs: js.UndefOr[EfsStorageConfiguration] = js.undefined
  
  /**
    * Defines the storage configuration for an Amazon FSx file system.
    */
  var fsx: js.UndefOr[FsxStorageConfiguration] = js.undefined
}
object StorageConfiguration {
  
  inline def apply(): StorageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEfs(value: EfsStorageConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    inline def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    inline def setFsx(value: FsxStorageConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    inline def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
  }
}
