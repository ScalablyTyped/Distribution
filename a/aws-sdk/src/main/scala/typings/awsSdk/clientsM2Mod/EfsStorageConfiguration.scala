package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EfsStorageConfiguration extends StObject {
  
  /**
    * The file system identifier.
    */
  var fileSystemId: String200
  
  /**
    * The mount point for the file system.
    */
  var mountPoint: String200
}
object EfsStorageConfiguration {
  
  inline def apply(fileSystemId: String200, mountPoint: String200): EfsStorageConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], mountPoint = mountPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsStorageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EfsStorageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFileSystemId(value: String200): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setMountPoint(value: String200): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
  }
}
