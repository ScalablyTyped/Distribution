package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventIntegrationAssociation extends StObject {
  
  /**
    * The metadata associated with the client.
    */
  var ClientAssociationMetadata: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.ClientAssociationMetadata] = js.undefined
  
  /**
    * The identifier for the client that is associated with the event integration.
    */
  var ClientId: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.ClientId] = js.undefined
  
  /**
    * The name of the EventBridge rule.
    */
  var EventBridgeRuleName: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.EventBridgeRuleName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the event integration association.
    */
  var EventIntegrationAssociationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The identifier for the event integration association.
    */
  var EventIntegrationAssociationId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of the event integration.
    */
  var EventIntegrationName: js.UndefOr[Name] = js.undefined
}
object EventIntegrationAssociation {
  
  inline def apply(): EventIntegrationAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventIntegrationAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventIntegrationAssociation] (val x: Self) extends AnyVal {
    
    inline def setClientAssociationMetadata(value: ClientAssociationMetadata): Self = StObject.set(x, "ClientAssociationMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientAssociationMetadataUndefined: Self = StObject.set(x, "ClientAssociationMetadata", js.undefined)
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setEventBridgeRuleName(value: EventBridgeRuleName): Self = StObject.set(x, "EventBridgeRuleName", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeRuleNameUndefined: Self = StObject.set(x, "EventBridgeRuleName", js.undefined)
    
    inline def setEventIntegrationAssociationArn(value: Arn): Self = StObject.set(x, "EventIntegrationAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationAssociationArnUndefined: Self = StObject.set(x, "EventIntegrationAssociationArn", js.undefined)
    
    inline def setEventIntegrationAssociationId(value: UUID): Self = StObject.set(x, "EventIntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationAssociationIdUndefined: Self = StObject.set(x, "EventIntegrationAssociationId", js.undefined)
    
    inline def setEventIntegrationName(value: Name): Self = StObject.set(x, "EventIntegrationName", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationNameUndefined: Self = StObject.set(x, "EventIntegrationName", js.undefined)
  }
}
