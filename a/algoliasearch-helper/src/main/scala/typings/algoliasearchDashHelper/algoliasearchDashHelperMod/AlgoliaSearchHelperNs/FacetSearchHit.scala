package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.AlgoliaSearchHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure of each result when using
  * [`searchForFacetValues()`](reference.html#AlgoliaSearchHelper#searchForFacetValues)
  */
trait FacetSearchHit extends js.Object {
  var count: Double
  var highlighted: String
  var isRefined: Boolean
  var value: String
}

object FacetSearchHit {
  @scala.inline
  def apply(count: Double, highlighted: String, isRefined: Boolean, value: String): FacetSearchHit = {
    val __obj = js.Dynamic.literal(count = count, highlighted = highlighted, isRefined = isRefined, value = value)
  
    __obj.asInstanceOf[FacetSearchHit]
  }
}

