package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResultsNs

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
    val __obj = js.Dynamic.literal(count = count, isExcluded = isExcluded, isRefined = isRefined, name = name)
  
    __obj.asInstanceOf[FacetValue]
  }
}

