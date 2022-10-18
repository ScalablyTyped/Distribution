package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaVolumeMount extends StObject {
  
  /**
    * Whether or not to add the IoT Greengrass user group as an owner of the volume. Default: false 
    */
  var addGroupOwner: js.UndefOr[OptionalBoolean] = js.undefined
  
  /**
    * The path to the logical volume in the file system.
    */
  var destinationPath: FileSystemPath
  
  /**
    * The permission to access the volume: read/only (ro) or read/write (rw). Default: ro 
    */
  var permission: js.UndefOr[LambdaFilesystemPermission] = js.undefined
  
  /**
    * The path to the physical volume in the file system.
    */
  var sourcePath: FileSystemPath
}
object LambdaVolumeMount {
  
  inline def apply(destinationPath: FileSystemPath, sourcePath: FileSystemPath): LambdaVolumeMount = {
    val __obj = js.Dynamic.literal(destinationPath = destinationPath.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaVolumeMount]
  }
  
  extension [Self <: LambdaVolumeMount](x: Self) {
    
    inline def setAddGroupOwner(value: OptionalBoolean): Self = StObject.set(x, "addGroupOwner", value.asInstanceOf[js.Any])
    
    inline def setAddGroupOwnerUndefined: Self = StObject.set(x, "addGroupOwner", js.undefined)
    
    inline def setDestinationPath(value: FileSystemPath): Self = StObject.set(x, "destinationPath", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: LambdaFilesystemPermission): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setSourcePath(value: FileSystemPath): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
  }
}
