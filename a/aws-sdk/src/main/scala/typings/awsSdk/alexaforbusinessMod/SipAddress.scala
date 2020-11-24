package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipAddress extends js.Object {
  
  /**
    * The type of the SIP address.
    */
  var Type: SipType = js.native
  
  /**
    * The URI for the SIP address.
    */
  var Uri: SipUri = js.native
}
object SipAddress {
  
  @scala.inline
  def apply(Type: SipType, Uri: SipUri): SipAddress = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipAddress]
  }
  
  @scala.inline
  implicit class SipAddressOps[Self <: SipAddress] (val x: Self) extends AnyVal {
    
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
    def setType(value: SipType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: SipUri): Self = this.set("Uri", value.asInstanceOf[js.Any])
  }
}
