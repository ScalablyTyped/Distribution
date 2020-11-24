package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticFacetFilter extends js.Object {
  
  /**
    * Whether the filter is disjunctive (true) or conjunctive (false).
    */
  val disjunctive: js.UndefOr[Boolean] = js.native
  
  /**
    * Attribute to filter on. This must match a facet placeholder in the rule’s pattern.
    */
  val facet: String = js.native
  
  /**
    * Score for the filter. Typically used for optional or disjunctive filters.
    */
  val score: js.UndefOr[Double] = js.native
}
object AutomaticFacetFilter {
  
  @scala.inline
  def apply(facet: String): AutomaticFacetFilter = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticFacetFilter]
  }
  
  @scala.inline
  implicit class AutomaticFacetFilterOps[Self <: AutomaticFacetFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFacet(value: String): Self = this.set("facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctive(value: Boolean): Self = this.set("disjunctive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisjunctive: Self = this.set("disjunctive", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
