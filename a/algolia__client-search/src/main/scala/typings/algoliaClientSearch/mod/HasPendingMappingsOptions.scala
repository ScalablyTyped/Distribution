package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasPendingMappingsOptions extends js.Object {
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    *
    * @internal
    */
  val getClusters: js.UndefOr[Boolean] = js.native
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    */
  val retrieveMappings: js.UndefOr[Boolean] = js.native
}
object HasPendingMappingsOptions {
  
  @scala.inline
  def apply(): HasPendingMappingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPendingMappingsOptions]
  }
  
  @scala.inline
  implicit class HasPendingMappingsOptionsOps[Self <: HasPendingMappingsOptions] (val x: Self) extends AnyVal {
    
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
    def setGetClusters(value: Boolean): Self = this.set("getClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetClusters: Self = this.set("getClusters", js.undefined)
    
    @scala.inline
    def setRetrieveMappings(value: Boolean): Self = this.set("retrieveMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrieveMappings: Self = this.set("retrieveMappings", js.undefined)
  }
}
