package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEventDetails extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  
  var event: js.UndefOr[Event] = js.undefined
  
  var eventDescription: js.UndefOr[EventDescription_] = js.undefined
  
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.clientsHealthMod.eventMetadata] = js.undefined
}
object OrganizationEventDetails {
  
  inline def apply(): OrganizationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventDetails]
  }
  
  extension [Self <: OrganizationEventDetails](x: Self) {
    
    inline def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventDescription(value: EventDescription_): Self = StObject.set(x, "eventDescription", value.asInstanceOf[js.Any])
    
    inline def setEventDescriptionUndefined: Self = StObject.set(x, "eventDescription", js.undefined)
    
    inline def setEventMetadata(value: eventMetadata): Self = StObject.set(x, "eventMetadata", value.asInstanceOf[js.Any])
    
    inline def setEventMetadataUndefined: Self = StObject.set(x, "eventMetadata", js.undefined)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
