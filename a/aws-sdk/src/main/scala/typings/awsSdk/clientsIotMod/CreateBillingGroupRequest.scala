package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBillingGroupRequest extends StObject {
  
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateBillingGroupRequest {
  
  inline def apply(billingGroupName: BillingGroupName): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBillingGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupProperties(value: BillingGroupProperties): Self = StObject.set(x, "billingGroupProperties", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupPropertiesUndefined: Self = StObject.set(x, "billingGroupProperties", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
