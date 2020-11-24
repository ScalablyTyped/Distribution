package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlocklistMetadata extends js.Object {
  
  var blocklist: js.UndefOr[js.Any] = js.native
  
  var metadata: js.UndefOr[String] = js.native
  
  var profileServer: js.UndefOr[String] = js.native
}
object BlocklistMetadata {
  
  @scala.inline
  def apply(): BlocklistMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlocklistMetadata]
  }
  
  @scala.inline
  implicit class BlocklistMetadataOps[Self <: BlocklistMetadata] (val x: Self) extends AnyVal {
    
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
    def setBlocklist(value: js.Any): Self = this.set("blocklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocklist: Self = this.set("blocklist", js.undefined)
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setProfileServer(value: String): Self = this.set("profileServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileServer: Self = this.set("profileServer", js.undefined)
  }
}
