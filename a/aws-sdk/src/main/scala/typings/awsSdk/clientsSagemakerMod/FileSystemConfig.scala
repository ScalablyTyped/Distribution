package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemConfig extends StObject {
  
  /**
    * The default POSIX group ID (GID). If not specified, defaults to 100.
    */
  var DefaultGid: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DefaultGid] = js.undefined
  
  /**
    * The default POSIX user ID (UID). If not specified, defaults to 1000.
    */
  var DefaultUid: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DefaultUid] = js.undefined
  
  /**
    * The path within the image to mount the user's EFS home directory. The directory should be empty. If not specified, defaults to /home/sagemaker-user.
    */
  var MountPath: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MountPath] = js.undefined
}
object FileSystemConfig {
  
  inline def apply(): FileSystemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemConfig]
  }
  
  extension [Self <: FileSystemConfig](x: Self) {
    
    inline def setDefaultGid(value: DefaultGid): Self = StObject.set(x, "DefaultGid", value.asInstanceOf[js.Any])
    
    inline def setDefaultGidUndefined: Self = StObject.set(x, "DefaultGid", js.undefined)
    
    inline def setDefaultUid(value: DefaultUid): Self = StObject.set(x, "DefaultUid", value.asInstanceOf[js.Any])
    
    inline def setDefaultUidUndefined: Self = StObject.set(x, "DefaultUid", js.undefined)
    
    inline def setMountPath(value: MountPath): Self = StObject.set(x, "MountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "MountPath", js.undefined)
  }
}
