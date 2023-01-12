package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails extends StObject {
  
  /**
    * The Linux capabilities for the container that are added to the default configuration provided by Docker. Valid values are as follows: Valid values: "ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM" 
    */
  var Add: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The Linux capabilities for the container that are dropped from the default configuration provided by Docker. Valid values: "ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM" 
    */
  var Drop: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: NonEmptyStringList): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    inline def setAddVarargs(value: NonEmptyString*): Self = StObject.set(x, "Add", js.Array(value*))
    
    inline def setDrop(value: NonEmptyStringList): Self = StObject.set(x, "Drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "Drop", js.undefined)
    
    inline def setDropVarargs(value: NonEmptyString*): Self = StObject.set(x, "Drop", js.Array(value*))
  }
}
