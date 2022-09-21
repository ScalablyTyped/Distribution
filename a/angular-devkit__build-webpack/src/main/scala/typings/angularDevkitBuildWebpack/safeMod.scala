package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostCapabilities
import typings.angularDevkitBuildWebpack.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitBuildWebpack.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/safe", "SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends StObject
       with ReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
    
    /* private */ var _delegate: Any = js.native
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    @JSName("capabilities")
    def capabilities_MSafeReadonlyHost: HostCapabilities = js.native
    
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
  }
}
