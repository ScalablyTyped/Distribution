package typings.atAngularCore

import typings.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod.NgQueryDefinition
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesStrategiesTimingDashStrategyMod.TimingResult
import typings.atAngularCore.schematicsMigrationsStaticDashQueriesStrategiesTimingDashStrategyMod.TimingStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/test_strategy/test_strategy", JSImport.Namespace)
@js.native
object schematicsMigrationsStaticDashQueriesStrategiesTestUnderscoreStrategyTestUnderscoreStrategyMod extends js.Object {
  @js.native
  class QueryTestStrategy () extends TimingStrategy {
    /** Detects the timing result for a given query. */
    /* CompleteClass */
    override def detectTiming(query: NgQueryDefinition): TimingResult = js.native
    /** Sets up the given strategy. Throws if the strategy could not be set up. */
    /* CompleteClass */
    override def setup(): Unit = js.native
  }
  
}

