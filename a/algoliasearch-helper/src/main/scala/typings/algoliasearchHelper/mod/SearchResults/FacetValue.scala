package typings.algoliasearchHelper.mod.SearchResults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetValue extends js.Object {
  var count: Double
  var isExcluded: Boolean
  var isRefined: Boolean
  var name: String
}

object FacetValue {
  @scala.inline
  def apply(count: Double, isExcluded: Boolean, isRefined: Boolean, name: String): FacetValue = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], isExcluded = isExcluded.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetValue]
  }
}

