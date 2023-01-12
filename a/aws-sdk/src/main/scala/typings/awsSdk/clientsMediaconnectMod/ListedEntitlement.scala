package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedEntitlement extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined
  
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: string
  
  /**
    * The name of the entitlement.
    */
  var EntitlementName: string
}
object ListedEntitlement {
  
  inline def apply(EntitlementArn: string, EntitlementName: string): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedEntitlement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListedEntitlement] (val x: Self) extends AnyVal {
    
    inline def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    inline def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementName(value: string): Self = StObject.set(x, "EntitlementName", value.asInstanceOf[js.Any])
  }
}
