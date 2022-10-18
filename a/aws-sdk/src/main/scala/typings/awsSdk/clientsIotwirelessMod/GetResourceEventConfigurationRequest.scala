package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceEventConfigurationRequest extends StObject {
  
  /**
    * Resource identifier to opt in for event messaging.
    */
  var Identifier: typings.awsSdk.clientsIotwirelessMod.Identifier
  
  /**
    * Identifier type of the particular resource identifier for event configuration.
    */
  var IdentifierType: typings.awsSdk.clientsIotwirelessMod.IdentifierType
  
  /**
    * Partner type of the resource if the identifier type is PartnerAccountId.
    */
  var PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined
}
object GetResourceEventConfigurationRequest {
  
  inline def apply(Identifier: Identifier, IdentifierType: IdentifierType): GetResourceEventConfigurationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], IdentifierType = IdentifierType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceEventConfigurationRequest]
  }
  
  extension [Self <: GetResourceEventConfigurationRequest](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierType(value: IdentifierType): Self = StObject.set(x, "IdentifierType", value.asInstanceOf[js.Any])
    
    inline def setPartnerType(value: EventNotificationPartnerType): Self = StObject.set(x, "PartnerType", value.asInstanceOf[js.Any])
    
    inline def setPartnerTypeUndefined: Self = StObject.set(x, "PartnerType", js.undefined)
  }
}
