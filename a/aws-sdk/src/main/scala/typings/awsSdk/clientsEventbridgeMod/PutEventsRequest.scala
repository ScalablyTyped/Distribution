package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsRequest extends StObject {
  
  /**
    * The URL subdomain of the endpoint. For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is abcde.veo.  When using Java, you must include auth-crt on the class path. 
    */
  var EndpointId: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EndpointId] = js.undefined
  
  /**
    * The entry that defines an event in your system. You can specify several parameters for the entry such as the source and type of the event, resources associated with the event, and so on.
    */
  var Entries: PutEventsRequestEntryList
}
object PutEventsRequest {
  
  inline def apply(Entries: PutEventsRequestEntryList): PutEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setEntries(value: PutEventsRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: PutEventsRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
  }
}
