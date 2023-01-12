package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventDataStoreRequest extends StObject {
  
  /**
    * The ARN (or the ID suffix of the ARN) of the event data store to delete.
    */
  var EventDataStore: EventDataStoreArn
}
object DeleteEventDataStoreRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): DeleteEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventDataStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventDataStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
  }
}
