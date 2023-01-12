package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewContactEvent extends StObject {
  
  /** The ID of the viewed contact. */
  var contactId: String
}
object ViewContactEvent {
  
  inline def apply(contactId: String): ViewContactEvent = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContactEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewContactEvent] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
