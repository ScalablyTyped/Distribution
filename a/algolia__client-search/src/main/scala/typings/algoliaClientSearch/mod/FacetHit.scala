package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetHit extends js.Object {
  /**
    * The count.
    */
  val count: Double
  /**
    * The highlighted value.
    */
  val highlighted: String
  /**
    * The value of the facet.
    */
  val value: String
}

object FacetHit {
  @scala.inline
  def apply(count: Double, highlighted: String, value: String): FacetHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FacetHit]
  }
}

