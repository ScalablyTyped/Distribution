package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConfigurationItem extends StObject {
  
  var Events: js.UndefOr[EventNotificationItemConfigurations] = js.undefined
  
  /**
    * Resource identifier opted in for event messaging.
    */
  var Identifier: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Identifier] = js.undefined
  
  /**
    * Identifier type of the particular resource identifier for event configuration.
    */
  var IdentifierType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.IdentifierType] = js.undefined
  
  /**
    * Partner type of the resource if the identifier type is PartnerAccountId.
    */
  var PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined
}
object EventConfigurationItem {
  
  inline def apply(): EventConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventConfigurationItem]
  }
  
  extension [Self <: EventConfigurationItem](x: Self) {
    
    inline def setEvents(value: EventNotificationItemConfigurations): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierType(value: IdentifierType): Self = StObject.set(x, "IdentifierType", value.asInstanceOf[js.Any])
    
    inline def setIdentifierTypeUndefined: Self = StObject.set(x, "IdentifierType", js.undefined)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setPartnerType(value: EventNotificationPartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
    
    inline def setPartnerTypeUndefined: Self = StObject.set(x, "PartnerType", js.undefined)
  }
}
