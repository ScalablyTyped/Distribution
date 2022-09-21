package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.resolverMod.ResolverHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopedMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/scoped", "ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected () extends ResolverHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
    
    /* protected */ var _root: Path_ = js.native
  }
}
