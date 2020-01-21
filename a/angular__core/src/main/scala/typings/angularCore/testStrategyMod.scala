package typings.angularCore

import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import typings.angularCore.timingStrategyMod.TimingResult
import typings.angularCore.timingStrategyMod.TimingStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/static-queries/strategies/test_strategy/test_strategy", JSImport.Namespace)
@js.native
object testStrategyMod extends js.Object {
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

