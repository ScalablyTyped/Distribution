package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentUpdatesSpecification extends StObject {
  
  /**
    * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent. If the active field is set to true, the startResponse, updateResponse, and timeoutInSeconds fields are required.
    */
  var active: BoxedBoolean
  
  /**
    * Provides configuration information for the message sent to users when the fulfillment Lambda functions starts running.
    */
  var startResponse: js.UndefOr[FulfillmentStartResponseSpecification] = js.undefined
  
  /**
    * The length of time that the fulfillment Lambda function should run before it times out.
    */
  var timeoutInSeconds: js.UndefOr[FulfillmentTimeout] = js.undefined
  
  /**
    * Provides configuration information for messages sent periodically to the user while the fulfillment Lambda function is running.
    */
  var updateResponse: js.UndefOr[FulfillmentUpdateResponseSpecification] = js.undefined
}
object FulfillmentUpdatesSpecification {
  
  inline def apply(active: BoxedBoolean): FulfillmentUpdatesSpecification = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentUpdatesSpecification]
  }
  
  extension [Self <: FulfillmentUpdatesSpecification](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setStartResponse(value: FulfillmentStartResponseSpecification): Self = StObject.set(x, "startResponse", value.asInstanceOf[js.Any])
    
    inline def setStartResponseUndefined: Self = StObject.set(x, "startResponse", js.undefined)
    
    inline def setTimeoutInSeconds(value: FulfillmentTimeout): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    inline def setUpdateResponse(value: FulfillmentUpdateResponseSpecification): Self = StObject.set(x, "updateResponse", value.asInstanceOf[js.Any])
    
    inline def setUpdateResponseUndefined: Self = StObject.set(x, "updateResponse", js.undefined)
  }
}
