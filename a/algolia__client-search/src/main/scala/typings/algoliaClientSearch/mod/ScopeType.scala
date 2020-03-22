package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.algoliaClientSearch.algoliaClientSearchStrings.settings
  - typings.algoliaClientSearch.algoliaClientSearchStrings.synonyms
  - typings.algoliaClientSearch.algoliaClientSearchStrings.rules
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rules: typings.algoliaClientSearch.algoliaClientSearchStrings.rules = this.cast("rules")
  @scala.inline
  def settings: typings.algoliaClientSearch.algoliaClientSearchStrings.settings = this.cast("settings")
  @scala.inline
  def synonyms: typings.algoliaClientSearch.algoliaClientSearchStrings.synonyms = this.cast("synonyms")
}

