package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRulesOptions extends StObject {
  
  /**
    * When specified, restricts matches to rules with a specific anchoring type. When omitted, all anchoring types may match.
    */
  val anchoring: js.UndefOr[String] = js.native
  
  /**
    * Restricts matches to contextual rules with a specific context (exact match).
    */
  val context: js.UndefOr[String] = js.native
  
  /**
    * When specified, restricts matches to rules with a specific enabled status.
    * When absent (default), all rules are retrieved, regardless of their enabled status.
    */
  val enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of hits in a page. Minimum is 1, maximum is 1000.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Requested page (zero-based).
    */
  val page: js.UndefOr[Double] = js.native
  
  /**
    * Full text query.
    */
  val query: js.UndefOr[String] = js.native
}
object SearchRulesOptions {
  
  @scala.inline
  def apply(): SearchRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRulesOptions]
  }
  
  @scala.inline
  implicit class SearchRulesOptionsMutableBuilder[Self <: SearchRulesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchoring(value: String): Self = StObject.set(x, "anchoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchoringUndefined: Self = StObject.set(x, "anchoring", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
