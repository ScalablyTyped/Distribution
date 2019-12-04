package typings.atAngularCore

import typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularNgUnderscoreQueryUnderscoreVisitorMod.ClassMetadataMap
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.NgQueryDefinition
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesStrategiesTimingDashStrategyMod.TimingResult
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesStrategiesTimingDashStrategyMod.TimingStrategy
import typings.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/usage_strategy/usage_strategy", JSImport.Namespace)
@js.native
object schematicsMigrationsStaticDashQueriesStrategiesUsageUnderscoreStrategyUsageUnderscoreStrategyMod extends js.Object {
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
    /** Detects the timing result for a given query. */
    /* CompleteClass */
    override def detectTiming(query: NgQueryDefinition): TimingResult = js.native
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    /* CompleteClass */
    override def setup(): Unit = js.native
  }
  
}

