package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
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
  implicit class ContactStatusChangeMutableBuilder[Self <: ContactStatusChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact_info(value: ContactInfo): Self = StObject.set(x, "contact_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
