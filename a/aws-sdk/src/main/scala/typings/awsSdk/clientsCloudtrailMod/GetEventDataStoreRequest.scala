package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventDataStoreRequest extends StObject {
  
  /**
    * The ARN (or ID suffix of the ARN) of the event data store about which you want information.
    */
  var EventDataStore: EventDataStoreArn
}
object GetEventDataStoreRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): GetEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventDataStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEventDataStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
  }
}
