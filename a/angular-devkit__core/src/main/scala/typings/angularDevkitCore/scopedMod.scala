package typings.angularDevkitCore

import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitCore.resolverMod.ResolverHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/scoped", "ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected () extends ResolverHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
    
    /* protected */ var _root: Path_ = js.native
  }
}
