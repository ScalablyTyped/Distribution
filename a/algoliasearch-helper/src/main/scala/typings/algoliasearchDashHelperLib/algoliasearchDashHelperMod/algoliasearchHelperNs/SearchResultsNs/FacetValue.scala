package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetValue extends js.Object {
  var count: scala.Double
  var isExcluded: scala.Boolean
  var isRefined: scala.Boolean
  var name: java.lang.String
}

object FacetValue {
  @scala.inline
  def apply(count: scala.Double, isExcluded: scala.Boolean, isRefined: scala.Boolean, name: java.lang.String): FacetValue = {
    val __obj = js.Dynamic.literal(count = count, isExcluded = isExcluded, isRefined = isRefined, name = name)
  
    __obj.asInstanceOf[FacetValue]
  }
}

