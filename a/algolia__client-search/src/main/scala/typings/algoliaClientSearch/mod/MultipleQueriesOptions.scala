package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleQueriesOptions extends js.Object {
  val strategy: js.UndefOr[StrategyType] = js.undefined
}

object MultipleQueriesOptions {
  @scala.inline
  def apply(strategy: StrategyType = null): MultipleQueriesOptions = {
    val __obj = js.Dynamic.literal()
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleQueriesOptions]
  }
}

