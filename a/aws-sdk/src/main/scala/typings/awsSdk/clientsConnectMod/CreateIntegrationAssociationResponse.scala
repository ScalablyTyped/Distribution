package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationAssociationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the association.
    */
  var IntegrationAssociationArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: js.UndefOr[typings.awsSdk.clientsConnectMod.IntegrationAssociationId] = js.undefined
}
object CreateIntegrationAssociationResponse {
  
  inline def apply(): CreateIntegrationAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntegrationAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIntegrationAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setIntegrationAssociationArn(value: ARN): Self = StObject.set(x, "IntegrationAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationArnUndefined: Self = StObject.set(x, "IntegrationAssociationArn", js.undefined)
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationIdUndefined: Self = StObject.set(x, "IntegrationAssociationId", js.undefined)
  }
}
