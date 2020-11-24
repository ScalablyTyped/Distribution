package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressServer extends js.Object {
  
  var addressServer: js.UndefOr[String] = js.native
  
  var consentCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ipfs: js.UndefOr[js.Any] = js.native
  
  var pinningNode: js.UndefOr[String] = js.native
}
object AddressServer {
  
  @scala.inline
  def apply(): AddressServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressServer]
  }
  
  @scala.inline
  implicit class AddressServerOps[Self <: AddressServer] (val x: Self) extends AnyVal {
    
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
    def setConsentCallback(value: () => Unit): Self = this.set("consentCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConsentCallback: Self = this.set("consentCallback", js.undefined)
    
    @scala.inline
    def setIpfs(value: js.Any): Self = this.set("ipfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpfs: Self = this.set("ipfs", js.undefined)
    
    @scala.inline
    def setPinningNode(value: String): Self = this.set("pinningNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinningNode: Self = this.set("pinningNode", js.undefined)
  }
}
