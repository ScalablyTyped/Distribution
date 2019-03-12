package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.AlgoliaSearchHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of each result when using
  * [`searchForFacetValues()`](reference.html#AlgoliaSearchHelper#searchForFacetValues)
  */
trait FacetSearchHit extends js.Object {
  var count: scala.Double
  var highlighted: java.lang.String
  var isRefined: scala.Boolean
  var value: java.lang.String
}

object FacetSearchHit {
  @scala.inline
  def apply(
    count: scala.Double,
    highlighted: java.lang.String,
    isRefined: scala.Boolean,
    value: java.lang.String
  ): FacetSearchHit = {
    val __obj = js.Dynamic.literal(count = count, highlighted = highlighted, isRefined = isRefined, value = value)
  
    __obj.asInstanceOf[FacetSearchHit]
  }
}

