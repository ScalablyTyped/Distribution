package typings.angularCore

import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.angularCore.timingStrategyMod.TimingStrategy
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/usage_strategy", JSImport.Namespace)
@js.native
object usageStrategyMod extends js.Object {
  @js.native
  class QueryUsageStrategy protected () extends TimingStrategy {
    def this(classMetadata: ClassMetadataMap, typeChecker: TypeChecker) = this()
    /**
      * Checks whether a given query is used statically within the given class, its super
      * class or derived classes.
      */
    var analyzeQueryUsage: js.Any = js.native
    var classMetadata: js.Any = js.native
    var typeChecker: js.Any = js.native
  }
  
}

