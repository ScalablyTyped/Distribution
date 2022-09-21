package typings.angularDevkitCore

import typings.angularDevkitCore.hostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/empty", "Empty")
  @js.native
  open class Empty ()
    extends StObject
       with ReadonlyHost[js.Object] {
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    
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
