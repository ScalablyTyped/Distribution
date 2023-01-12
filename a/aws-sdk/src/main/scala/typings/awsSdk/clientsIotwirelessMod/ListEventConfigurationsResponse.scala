package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventConfigurationsResponse extends StObject {
  
  /**
    * Event configurations of all events for a single resource.
    */
  var EventConfigurationsList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.EventConfigurationsList] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListEventConfigurationsResponse {
  
  inline def apply(): ListEventConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setEventConfigurationsList(value: EventConfigurationsList): Self = StObject.set(x, "EventConfigurationsList", value.asInstanceOf[js.Any])
    
    inline def setEventConfigurationsListUndefined: Self = StObject.set(x, "EventConfigurationsList", js.undefined)
    
    inline def setEventConfigurationsListVarargs(value: EventConfigurationItem*): Self = StObject.set(x, "EventConfigurationsList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
