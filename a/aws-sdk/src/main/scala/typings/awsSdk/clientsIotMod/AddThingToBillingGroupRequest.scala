package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddThingToBillingGroupRequest extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The name of the billing group.  This call is asynchronous. It might take several seconds for the detachment to propagate. 
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The ARN of the thing to be added to the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The name of the thing to be added to the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object AddThingToBillingGroupRequest {
  
  inline def apply(): AddThingToBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToBillingGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddThingToBillingGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
