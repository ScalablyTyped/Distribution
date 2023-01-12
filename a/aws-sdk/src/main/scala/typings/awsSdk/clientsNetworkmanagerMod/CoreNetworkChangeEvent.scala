package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkChangeEvent extends StObject {
  
  /**
    * The action taken for the change event.
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * The timestamp for an event change in status.
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Uniquely identifies the path for a change within the changeset. For example, the IdentifierPath for a core network segment change might be "CORE_NETWORK_SEGMENT/us-east-1/devsegment".
    */
  var IdentifierPath: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The status of the core network change event.
    */
  var Status: js.UndefOr[ChangeStatus] = js.undefined
  
  /**
    * Describes the type of change event. 
    */
  var Type: js.UndefOr[ChangeType] = js.undefined
  
  /**
    * Details of the change event.
    */
  var Values: js.UndefOr[CoreNetworkChangeEventValues] = js.undefined
}
object CoreNetworkChangeEvent {
  
  inline def apply(): CoreNetworkChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNetworkChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setIdentifierPath(value: ConstrainedString): Self = StObject.set(x, "IdentifierPath", value.asInstanceOf[js.Any])
    
    inline def setIdentifierPathUndefined: Self = StObject.set(x, "IdentifierPath", js.undefined)
    
    inline def setStatus(value: ChangeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: ChangeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValues(value: CoreNetworkChangeEventValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
  }
}
