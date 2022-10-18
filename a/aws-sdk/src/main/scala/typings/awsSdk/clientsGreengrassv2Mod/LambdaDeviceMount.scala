package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaDeviceMount extends StObject {
  
  /**
    * Whether or not to add the component's system user as an owner of the device. Default: false 
    */
  var addGroupOwner: js.UndefOr[OptionalBoolean] = js.undefined
  
  /**
    * The mount path for the device in the file system.
    */
  var path: FileSystemPath
  
  /**
    * The permission to access the device: read/only (ro) or read/write (rw). Default: ro 
    */
  var permission: js.UndefOr[LambdaFilesystemPermission] = js.undefined
}
object LambdaDeviceMount {
  
  inline def apply(path: FileSystemPath): LambdaDeviceMount = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaDeviceMount]
  }
  
  extension [Self <: LambdaDeviceMount](x: Self) {
    
    inline def setAddGroupOwner(value: OptionalBoolean): Self = StObject.set(x, "addGroupOwner", value.asInstanceOf[js.Any])
    
    inline def setAddGroupOwnerUndefined: Self = StObject.set(x, "addGroupOwner", js.undefined)
    
    inline def setPath(value: FileSystemPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: LambdaFilesystemPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
