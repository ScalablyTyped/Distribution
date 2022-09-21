package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactStatusChange
  extends StObject
     with Event {
  
  /**
    * Contact_info.
    */
  var contact_info: ContactInfo
  
  /**
    * Endpoint.
    */
  var endpoint: Endpoint
}
object ContactStatusChange {
  
  inline def apply(
    application: String,
    contact_info: ContactInfo,
    endpoint: Endpoint,
    timestamp: js.Date,
    `type`: String
  ): ContactStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], contact_info = contact_info.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactStatusChange]
  }
  
  extension [Self <: ContactStatusChange](x: Self) {
    
    inline def setContact_info(value: ContactInfo): Self = StObject.set(x, "contact_info", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
