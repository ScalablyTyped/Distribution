package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchSynonymsOptions extends js.Object {
  
  /**
    * Number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Page to retrieve.
    */
  val page: js.UndefOr[Double] = js.native
  
  /**
    * The synonym type.
    */
  val `type`: js.UndefOr[String] = js.native
}
object SearchSynonymsOptions {
  
  @scala.inline
  def apply(): SearchSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSynonymsOptions]
  }
  
  @scala.inline
  implicit class SearchSynonymsOptionsOps[Self <: SearchSynonymsOptions] (val x: Self) extends AnyVal {
    
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
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
