package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleTriggerEventSource extends StObject {
  
  /**
    * The name of the event source.
    */
  var EventSourceName: typings.awsSdk.clientsConnectMod.EventSourceName
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: js.UndefOr[typings.awsSdk.clientsConnectMod.IntegrationAssociationId] = js.undefined
}
object RuleTriggerEventSource {
  
  inline def apply(EventSourceName: EventSourceName): RuleTriggerEventSource = {
    val __obj = js.Dynamic.literal(EventSourceName = EventSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTriggerEventSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleTriggerEventSource] (val x: Self) extends AnyVal {
    
    inline def setEventSourceName(value: EventSourceName): Self = StObject.set(x, "EventSourceName", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationIdUndefined: Self = StObject.set(x, "IntegrationAssociationId", js.undefined)
  }
}
