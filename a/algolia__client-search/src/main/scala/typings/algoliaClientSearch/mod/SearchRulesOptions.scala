package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRulesOptions extends js.Object {
  
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
  implicit class SearchRulesOptionsOps[Self <: SearchRulesOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchoring(value: String): Self = this.set("anchoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchoring: Self = this.set("anchoring", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
