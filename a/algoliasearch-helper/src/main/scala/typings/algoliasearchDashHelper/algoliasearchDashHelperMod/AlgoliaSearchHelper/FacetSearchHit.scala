package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.AlgoliaSearchHelper

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FacetSearchHit]
  }
}

