package typings.angularCore.timingStrategyMod

import typings.angularCore.queryDefinitionMod.NgQueryDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingStrategy extends js.Object {
  /** Detects the timing result for a given query. */
  def detectTiming(query: NgQueryDefinition): TimingResult
  /** Sets up the given strategy. Throws if the strategy could not be set up. */
  def setup(): Unit
}

object TimingStrategy {
  @scala.inline
  def apply(detectTiming: NgQueryDefinition => TimingResult, setup: () => Unit): TimingStrategy = {
    val __obj = js.Dynamic.literal(detectTiming = js.Any.fromFunction1(detectTiming), setup = js.Any.fromFunction0(setup))
    __obj.asInstanceOf[TimingStrategy]
  }
}

