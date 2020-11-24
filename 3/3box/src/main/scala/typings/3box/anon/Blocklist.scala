package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blocklist extends js.Object {
  
  var addressServer: js.UndefOr[String] = js.native
  
  var blocklist: js.UndefOr[js.Function1[/* address */ String, Boolean]] = js.native
  
  var ipfs: js.UndefOr[js.Any] = js.native
  
  var metadata: js.UndefOr[String] = js.native
  
  var profileServer: js.UndefOr[String] = js.native
  
  var useCacheService: js.UndefOr[Boolean] = js.native
}
object Blocklist {
  
  @scala.inline
  def apply(): Blocklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocklist]
  }
  
  @scala.inline
  implicit class BlocklistOps[Self <: Blocklist] (val x: Self) extends AnyVal {
    
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
    def setAddressServer(value: String): Self = this.set("addressServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressServer: Self = this.set("addressServer", js.undefined)
    
    @scala.inline
    def setBlocklist(value: /* address */ String => Boolean): Self = this.set("blocklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlocklist: Self = this.set("blocklist", js.undefined)
    
    @scala.inline
    def setIpfs(value: js.Any): Self = this.set("ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpfs: Self = this.set("ipfs", js.undefined)
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setProfileServer(value: String): Self = this.set("profileServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileServer: Self = this.set("profileServer", js.undefined)
    
    @scala.inline
    def setUseCacheService(value: Boolean): Self = this.set("useCacheService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCacheService: Self = this.set("useCacheService", js.undefined)
  }
}
