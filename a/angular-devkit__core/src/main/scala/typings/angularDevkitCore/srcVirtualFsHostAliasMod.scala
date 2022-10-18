package typings.angularDevkitCore

import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostResolverMod.ResolverHost
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostAliasMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/alias", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected () extends ResolverHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
    
    /* protected */ var _aliases: Map[Path_, Path_] = js.native
    
    def aliases: Map[Path_, Path_] = js.native
  }
}
