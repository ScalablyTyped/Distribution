package typings.amazonProductApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBrowseNodeLookupOptions extends js.Object {
  
  var browseNodeId: js.UndefOr[String] = js.native
  
  var responseGroup: js.UndefOr[String] = js.native
}
object IBrowseNodeLookupOptions {
  
  @scala.inline
  def apply(): IBrowseNodeLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowseNodeLookupOptions]
  }
  
  @scala.inline
  implicit class IBrowseNodeLookupOptionsOps[Self <: IBrowseNodeLookupOptions] (val x: Self) extends AnyVal {
    
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
    def setBrowseNodeId(value: String): Self = this.set("browseNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseNodeId: Self = this.set("browseNodeId", js.undefined)
    
    @scala.inline
    def setResponseGroup(value: String): Self = this.set("responseGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseGroup: Self = this.set("responseGroup", js.undefined)
  }
}
