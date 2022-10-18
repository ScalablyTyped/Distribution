package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriptionDefinitionRequest extends StObject {
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
}
object DeleteSubscriptionDefinitionRequest {
  
  inline def apply(SubscriptionDefinitionId: string): DeleteSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriptionDefinitionRequest]
  }
  
  extension [Self <: DeleteSubscriptionDefinitionRequest](x: Self) {
    
    inline def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
