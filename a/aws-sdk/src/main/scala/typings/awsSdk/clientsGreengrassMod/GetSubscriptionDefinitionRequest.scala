package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionDefinitionRequest extends StObject {
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
}
object GetSubscriptionDefinitionRequest {
  
  inline def apply(SubscriptionDefinitionId: string): GetSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionDefinitionRequest]
  }
  
  extension [Self <: GetSubscriptionDefinitionRequest](x: Self) {
    
    inline def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
  }
}
