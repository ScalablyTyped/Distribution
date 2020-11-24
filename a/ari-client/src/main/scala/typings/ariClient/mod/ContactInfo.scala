package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactInfo extends js.Object {
  
  /**
    * The Address of Record this contact belongs to.
    */
  var aor: String = js.native
  
  /**
    * The current status of the contact.
    */
  var contact_status: String = js.native
  
  /**
    * Current round trip time, in microseconds, for the contact.
    */
  var roundtrip_usec: js.UndefOr[String] = js.native
  
  /**
    * The location of the contact.
    */
  var uri: String = js.native
}
object ContactInfo {
  
  @scala.inline
  def apply(aor: String, contact_status: String, uri: String): ContactInfo = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], contact_status = contact_status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInfo]
  }
  
  @scala.inline
  implicit class ContactInfoOps[Self <: ContactInfo] (val x: Self) extends AnyVal {
    
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
    def setAor(value: String): Self = this.set("aor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact_status(value: String): Self = this.set("contact_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundtrip_usec(value: String): Self = this.set("roundtrip_usec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundtrip_usec: Self = this.set("roundtrip_usec", js.undefined)
  }
}
