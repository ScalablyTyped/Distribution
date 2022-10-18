package typings.angularDevkitCore

import typings.angularDevkitCore.srcExceptionMod.BaseException
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.FileBufferLike
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostWatchEvent
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostWatchOptions
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Stats
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostSyncMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/sync", "SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected () extends StObject {
    def this(_delegate: Host[T]) = this()
    
    /* protected */ var _delegate: Host[T] = js.native
    
    /* protected */ def _doSyncCall[ResultT](observable: Observable_[ResultT]): ResultT = js.native
    
    def capabilities: HostCapabilities = js.native
    
    def delegate: Host[T] = js.native
    
    def delete(path: Path_): Unit = js.native
    
    def exists(path: Path_): Boolean = js.native
    
    def isDirectory(path: Path_): Boolean = js.native
    
    def isFile(path: Path_): Boolean = js.native
    
    def list(path: Path_): js.Array[PathFragment] = js.native
    
    def read(path: Path_): js.typedarray.ArrayBuffer = js.native
    
    def rename(from: Path_, to: Path_): Unit = js.native
    
    def stat(path: Path_): Stats[T] | Null = js.native
    
    def watch(path: Path_): Observable_[HostWatchEvent] | Null = js.native
    def watch(path: Path_, options: HostWatchOptions): Observable_[HostWatchEvent] | Null = js.native
    
    def write(path: Path_, content: FileBufferLike): Unit = js.native
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/sync", "SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException () extends BaseException
}
