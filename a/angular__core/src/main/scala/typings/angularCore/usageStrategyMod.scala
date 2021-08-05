package typings.angularCore

import typings.angularCore.ngQueryVisitorMod.ClassMetadataMap
import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.timingStrategyMod.TimingResult
import typings.angularCore.timingStrategyMod.TimingStrategy
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageStrategyMod {
  
  @JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/usage_strategy", "QueryUsageStrategy")
  @js.native
  class QueryUsageStrategy protected ()
    extends StObject
       with TimingStrategy {
    def this(classMetadata: ClassMetadataMap, typeChecker: TypeChecker) = this()
    
    /**
      * Checks whether a given query is used statically within the given class, its super
      * class or derived classes.
      */
    /* private */ var analyzeQueryUsage: js.Any = js.native
    
    /* private */ var classMetadata: js.Any = js.native
    
    /** Detects the timing result for a given query. */
    /* CompleteClass */
    override def detectTiming(query: NgQueryDefinition): TimingResult = js.native
    
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    /* CompleteClass */
    override def setup(): Unit = js.native
    
    /* private */ var typeChecker: js.Any = js.native
  }
}
