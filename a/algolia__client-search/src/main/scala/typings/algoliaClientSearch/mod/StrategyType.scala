package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.algoliaClientSearch.algoliaClientSearchStrings.none
  - typings.algoliaClientSearch.algoliaClientSearchStrings.stopIfEnoughMatches
*/
trait StrategyType extends js.Object

object StrategyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.algoliaClientSearch.algoliaClientSearchStrings.none = this.cast("none")
  @scala.inline
  def stopIfEnoughMatches: typings.algoliaClientSearch.algoliaClientSearchStrings.stopIfEnoughMatches = this.cast("stopIfEnoughMatches")
}

