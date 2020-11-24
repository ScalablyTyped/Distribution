package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactStatusChange extends Event {
  
  /**
    * Contact_info.
    */
  var contact_info: ContactInfo = js.native
  
  /**
    * Endpoint.
    */
  var endpoint: Endpoint = js.native
}
object ContactStatusChange {
  
  @scala.inline
  def apply(
    application: String,
    contact_info: ContactInfo,
    endpoint: Endpoint,
    timestamp: Date,
    `type`: String
  ): ContactStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], contact_info = contact_info.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactStatusChange]
  }
  
  @scala.inline
  implicit class ContactStatusChangeOps[Self <: ContactStatusChange] (val x: Self) extends AnyVal {
    
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
    def setContact_info(value: ContactInfo): Self = this.set("contact_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("endpoint", value.asInstanceOf[js.Any])
  }
}
