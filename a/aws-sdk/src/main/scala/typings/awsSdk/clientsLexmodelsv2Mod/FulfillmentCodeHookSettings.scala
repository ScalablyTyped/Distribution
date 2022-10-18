package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentCodeHookSettings extends StObject {
  
  /**
    * Determines whether the fulfillment code hook is used. When active is false, the code hook doesn't run.
    */
  var active: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
    */
  var enabled: Boolean
  
  /**
    * Provides settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment updates can be used only with streaming conversations.
    */
  var fulfillmentUpdatesSpecification: js.UndefOr[FulfillmentUpdatesSpecification] = js.undefined
  
  /**
    * Provides settings for messages sent to the user for after the Lambda fulfillment function completes. Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
    */
  var postFulfillmentStatusSpecification: js.UndefOr[PostFulfillmentStatusSpecification] = js.undefined
}
object FulfillmentCodeHookSettings {
  
  inline def apply(enabled: Boolean): FulfillmentCodeHookSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentCodeHookSettings]
  }
  
  extension [Self <: FulfillmentCodeHookSettings](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentUpdatesSpecification(value: FulfillmentUpdatesSpecification): Self = StObject.set(x, "fulfillmentUpdatesSpecification", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentUpdatesSpecificationUndefined: Self = StObject.set(x, "fulfillmentUpdatesSpecification", js.undefined)
    
    inline def setPostFulfillmentStatusSpecification(value: PostFulfillmentStatusSpecification): Self = StObject.set(x, "postFulfillmentStatusSpecification", value.asInstanceOf[js.Any])
    
    inline def setPostFulfillmentStatusSpecificationUndefined: Self = StObject.set(x, "postFulfillmentStatusSpecification", js.undefined)
  }
}
