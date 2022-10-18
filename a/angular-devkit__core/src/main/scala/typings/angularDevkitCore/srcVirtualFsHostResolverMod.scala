package typings.angularDevkitCore

import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Stats
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostResolverMod {
  
  /* note: abstract class */ @JSImport("@angular-devkit/core/src/virtual-fs/host/resolver", "ResolverHost")
  @js.native
  open class ResolverHost[T /* <: js.Object */] protected ()
    extends StObject
       with Host[T] {
    def this(_delegate: Host[T]) = this()
    
    /* protected */ var _delegate: Host[T] = js.native
    
    /* protected */ def _resolve(path: Path_): Path_ = js.native
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    @JSName("capabilities")
    def capabilities_MResolverHost: HostCapabilities = js.native
    
    /* CompleteClass */
    override def exists(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isDirectory(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isFile(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def list(path: Path_): Observable_[js.Array[PathFragment]] = js.native
    
    /* CompleteClass */
    override def read(path: Path_): Observable_[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def stat(path: Path_): (Observable_[Stats[T] | Null]) | Null = js.native
    
    def write(path: Path_, content: js.typedarray.ArrayBuffer): Observable_[Unit] = js.native
  }
}
