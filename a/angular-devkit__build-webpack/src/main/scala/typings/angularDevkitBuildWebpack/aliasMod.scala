package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.resolverMod.ResolverHost
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/alias", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected () extends ResolverHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
    
    /* protected */ var _aliases: Map[Path_, Path_] = js.native
    
    def aliases: Map[Path_, Path_] = js.native
  }
}
