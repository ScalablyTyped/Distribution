package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndicesResponse extends js.Object {
  /**
    * List of index response
    */
  val items: js.Array[Indice]
  /**
    * Number of pages
    */
  val nbPages: Double
}

object ListIndicesResponse {
  @scala.inline
  def apply(items: js.Array[Indice], nbPages: Double): ListIndicesResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndicesResponse]
  }
}

