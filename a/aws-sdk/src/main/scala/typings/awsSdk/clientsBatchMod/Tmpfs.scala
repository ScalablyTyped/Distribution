package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tmpfs extends StObject {
  
  /**
    * The absolute file path in the container where the tmpfs volume is mounted.
    */
  var containerPath: String
  
  /**
    * The list of tmpfs volume mount options. Valid values: "defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol"
    */
  var mountOptions: js.UndefOr[StringList] = js.undefined
  
  /**
    * The size (in MiB) of the tmpfs volume.
    */
  var size: Integer
}
object Tmpfs {
  
  inline def apply(containerPath: String, size: Integer): Tmpfs = {
    val __obj = js.Dynamic.literal(containerPath = containerPath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tmpfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tmpfs] (val x: Self) extends AnyVal {
    
    inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    inline def setMountOptions(value: StringList): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
    
    inline def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value*))
    
    inline def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
