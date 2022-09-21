package typings.angularDevkitCore

import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.hostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/resolver", "ResolverHost")
  @js.native
  abstract class ResolverHost[T /* <: js.Object */] protected ()
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
    override def exists(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def isDirectory(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def isFile(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def list(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def read(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def stat(path: Path_): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Stats<StatsT> | null> */ Any) | Null = js.native
    
    def write(path: Path_, content: js.typedarray.ArrayBuffer): Any = js.native
  }
}
