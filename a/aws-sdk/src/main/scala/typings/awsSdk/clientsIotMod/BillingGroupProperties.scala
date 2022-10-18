package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGroupProperties extends StObject {
  
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined
}
object BillingGroupProperties {
  
  inline def apply(): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupProperties]
  }
  
  extension [Self <: BillingGroupProperties](x: Self) {
    
    inline def setBillingGroupDescription(value: BillingGroupDescription): Self = StObject.set(x, "billingGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupDescriptionUndefined: Self = StObject.set(x, "billingGroupDescription", js.undefined)
  }
}
