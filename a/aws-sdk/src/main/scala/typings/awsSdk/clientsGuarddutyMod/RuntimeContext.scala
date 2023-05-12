package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeContext extends StObject {
  
  /**
    * Represents the communication protocol associated with the address. For example, the address family AF_INET is used for IP version of 4 protocol.
    */
  var AddressFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of mounted fileSystem.
    */
  var FileSystemType: js.UndefOr[String] = js.undefined
  
  /**
    * Represents options that control the behavior of a runtime operation or action. For example, a filesystem mount operation may contain a read-only flag.
    */
  var Flags: js.UndefOr[FlagsList] = js.undefined
  
  /**
    * Specifies a particular protocol within the address family. Usually there is a single protocol in address families. For example, the address family AF_INET only has the IP protocol.
    */
  var IanaProtocolNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value of the LD_PRELOAD environment variable.
    */
  var LdPreloadValue: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the new library that was loaded.
    */
  var LibraryPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Region of a process's address space such as stack and heap.
    */
  var MemoryRegions: js.UndefOr[MemoryRegionsList] = js.undefined
  
  /**
    * The timestamp at which the process modified the current process. The timestamp is in UTC date string format.
    */
  var ModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the process that modified the current process. This is available for multiple finding types.
    */
  var ModifyingProcess: js.UndefOr[ProcessDetails] = js.undefined
  
  /**
    * The path to the module loaded into the kernel.
    */
  var ModuleFilePath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the module loaded into the kernel.
    */
  var ModuleName: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA256 hash of the module.
    */
  var ModuleSha256: js.UndefOr[String] = js.undefined
  
  /**
    * The path on the host that is mounted by the container.
    */
  var MountSource: js.UndefOr[String] = js.undefined
  
  /**
    * The path in the container that is mapped to the host directory.
    */
  var MountTarget: js.UndefOr[String] = js.undefined
  
  /**
    * The path in the container that modified the release agent file.
    */
  var ReleaseAgentPath: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the leveraged runc implementation.
    */
  var RuncBinaryPath: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the script that was executed.
    */
  var ScriptPath: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the modified shell history file.
    */
  var ShellHistoryFilePath: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the docket socket that was accessed.
    */
  var SocketPath: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the process that had its memory overwritten by the current process.
    */
  var TargetProcess: js.UndefOr[ProcessDetails] = js.undefined
}
object RuntimeContext {
  
  inline def apply(): RuntimeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeContext] (val x: Self) extends AnyVal {
    
    inline def setAddressFamily(value: String): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    inline def setAddressFamilyUndefined: Self = StObject.set(x, "AddressFamily", js.undefined)
    
    inline def setFileSystemType(value: String): Self = StObject.set(x, "FileSystemType", value.asInstanceOf[js.Any])
    
    inline def setFileSystemTypeUndefined: Self = StObject.set(x, "FileSystemType", js.undefined)
    
    inline def setFlags(value: FlagsList): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "Flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "Flags", js.Array(value*))
    
    inline def setIanaProtocolNumber(value: Integer): Self = StObject.set(x, "IanaProtocolNumber", value.asInstanceOf[js.Any])
    
    inline def setIanaProtocolNumberUndefined: Self = StObject.set(x, "IanaProtocolNumber", js.undefined)
    
    inline def setLdPreloadValue(value: String): Self = StObject.set(x, "LdPreloadValue", value.asInstanceOf[js.Any])
    
    inline def setLdPreloadValueUndefined: Self = StObject.set(x, "LdPreloadValue", js.undefined)
    
    inline def setLibraryPath(value: String): Self = StObject.set(x, "LibraryPath", value.asInstanceOf[js.Any])
    
    inline def setLibraryPathUndefined: Self = StObject.set(x, "LibraryPath", js.undefined)
    
    inline def setMemoryRegions(value: MemoryRegionsList): Self = StObject.set(x, "MemoryRegions", value.asInstanceOf[js.Any])
    
    inline def setMemoryRegionsUndefined: Self = StObject.set(x, "MemoryRegions", js.undefined)
    
    inline def setMemoryRegionsVarargs(value: String*): Self = StObject.set(x, "MemoryRegions", js.Array(value*))
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
    
    inline def setModifyingProcess(value: ProcessDetails): Self = StObject.set(x, "ModifyingProcess", value.asInstanceOf[js.Any])
    
    inline def setModifyingProcessUndefined: Self = StObject.set(x, "ModifyingProcess", js.undefined)
    
    inline def setModuleFilePath(value: String): Self = StObject.set(x, "ModuleFilePath", value.asInstanceOf[js.Any])
    
    inline def setModuleFilePathUndefined: Self = StObject.set(x, "ModuleFilePath", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "ModuleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "ModuleName", js.undefined)
    
    inline def setModuleSha256(value: String): Self = StObject.set(x, "ModuleSha256", value.asInstanceOf[js.Any])
    
    inline def setModuleSha256Undefined: Self = StObject.set(x, "ModuleSha256", js.undefined)
    
    inline def setMountSource(value: String): Self = StObject.set(x, "MountSource", value.asInstanceOf[js.Any])
    
    inline def setMountSourceUndefined: Self = StObject.set(x, "MountSource", js.undefined)
    
    inline def setMountTarget(value: String): Self = StObject.set(x, "MountTarget", value.asInstanceOf[js.Any])
    
    inline def setMountTargetUndefined: Self = StObject.set(x, "MountTarget", js.undefined)
    
    inline def setReleaseAgentPath(value: String): Self = StObject.set(x, "ReleaseAgentPath", value.asInstanceOf[js.Any])
    
    inline def setReleaseAgentPathUndefined: Self = StObject.set(x, "ReleaseAgentPath", js.undefined)
    
    inline def setRuncBinaryPath(value: String): Self = StObject.set(x, "RuncBinaryPath", value.asInstanceOf[js.Any])
    
    inline def setRuncBinaryPathUndefined: Self = StObject.set(x, "RuncBinaryPath", js.undefined)
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "ScriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "ScriptPath", js.undefined)
    
    inline def setShellHistoryFilePath(value: String): Self = StObject.set(x, "ShellHistoryFilePath", value.asInstanceOf[js.Any])
    
    inline def setShellHistoryFilePathUndefined: Self = StObject.set(x, "ShellHistoryFilePath", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "SocketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "SocketPath", js.undefined)
    
    inline def setTargetProcess(value: ProcessDetails): Self = StObject.set(x, "TargetProcess", value.asInstanceOf[js.Any])
    
    inline def setTargetProcessUndefined: Self = StObject.set(x, "TargetProcess", js.undefined)
  }
}
