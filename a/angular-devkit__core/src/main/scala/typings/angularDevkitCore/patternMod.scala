package typings.angularDevkitCore

import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitCore.resolverMod.ResolverHost
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/pattern", "PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected () extends ResolverHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
    
    /* protected */ var _patterns: Map[js.RegExp, ReplacementFunction] = js.native
    
    def addPattern(pattern: String, replacementFn: ReplacementFunction): Unit = js.native
    def addPattern(pattern: js.Array[String], replacementFn: ReplacementFunction): Unit = js.native
  }
  
  type ReplacementFunction = js.Function1[/* path */ Path_, Path_]
}
