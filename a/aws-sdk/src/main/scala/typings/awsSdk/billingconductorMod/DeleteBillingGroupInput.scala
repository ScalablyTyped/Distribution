package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBillingGroupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the billing group you're deleting.
    */
  var Arn: BillingGroupArn
}
object DeleteBillingGroupInput {
  
  inline def apply(Arn: BillingGroupArn): DeleteBillingGroupInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBillingGroupInput]
  }
  
  extension [Self <: DeleteBillingGroupInput](x: Self) {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
