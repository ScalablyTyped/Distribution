package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelCapabilities extends StObject {
  
  /**
    * The Linux capabilities for the container that have been added to the default configuration provided by Docker. This parameter maps to CapAdd in the Create a container section of the Docker Remote API and the --cap-add option to docker run.  Tasks launched on Fargate only support adding the SYS_PTRACE kernel capability.  Valid values: "ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM" 
    */
  var add: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Linux capabilities for the container that have been removed from the default configuration provided by Docker. This parameter maps to CapDrop in the Create a container section of the Docker Remote API and the --cap-drop option to docker run. Valid values: "ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM" 
    */
  var drop: js.UndefOr[StringList] = js.undefined
}
object KernelCapabilities {
  
  inline def apply(): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelCapabilities]
  }
  
  extension [Self <: KernelCapabilities](x: Self) {
    
    inline def setAdd(value: StringList): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setDrop(value: StringList): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: String*): Self = StObject.set(x, "drop", js.Array(value*))
  }
}
