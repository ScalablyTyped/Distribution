package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticFacetFilter extends StObject {
  
  /**
    * Whether the filter is disjunctive (true) or conjunctive (false).
    */
  val disjunctive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Attribute to filter on. This must match a facet placeholder in the rule’s pattern.
    */
  val facet: String
  
  /**
    * Score for the filter. Typically used for optional or disjunctive filters.
    */
  val score: js.UndefOr[Double] = js.undefined
}
object AutomaticFacetFilter {
  
  @scala.inline
  def apply(facet: String): AutomaticFacetFilter = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticFacetFilter]
  }
  
  @scala.inline
  implicit class AutomaticFacetFilterMutableBuilder[Self <: AutomaticFacetFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisjunctive(value: Boolean): Self = StObject.set(x, "disjunctive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveUndefined: Self = StObject.set(x, "disjunctive", js.undefined)
    
    @scala.inline
    def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
