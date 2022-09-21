package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.exceptionMod.BaseException
import typings.angularDevkitBuildWebpack.hostInterfaceMod.FileBufferLike
import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostCapabilities
import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostWatchOptions
import typings.angularDevkitBuildWebpack.hostInterfaceMod.Stats
import typings.angularDevkitBuildWebpack.pathMod.PathFragment
import typings.angularDevkitBuildWebpack.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/sync", "SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected () extends StObject {
    def this(_delegate: Host[T]) = this()
    
    /* protected */ var _delegate: Host[T] = js.native
    
    /* protected */ def _doSyncCall[ResultT](
      observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<ResultT> */ Any
    ): ResultT = js.native
    
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
    
    def watch(path: Path_): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<HostWatchEvent> */ Any) | Null = js.native
    def watch(path: Path_, options: HostWatchOptions): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<HostWatchEvent> */ Any) | Null = js.native
    
    def write(path: Path_, content: FileBufferLike): Unit = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/sync", "SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException () extends BaseException
}
