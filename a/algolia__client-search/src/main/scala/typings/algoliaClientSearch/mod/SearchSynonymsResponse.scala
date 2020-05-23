package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSynonymsResponse extends js.Object {
  /**
    * The list of synonyms.
    */
  var hits: js.Array[Synonym]
  /**
    * The number of synonyms on the list.
    */
  var nbHits: Double
}

object SearchSynonymsResponse {
  @scala.inline
  def apply(hits: js.Array[Synonym], nbHits: Double): SearchSynonymsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsResponse]
  }
}

