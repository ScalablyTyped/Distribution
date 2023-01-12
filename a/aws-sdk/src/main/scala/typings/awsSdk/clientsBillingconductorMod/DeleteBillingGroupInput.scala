package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBillingGroupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the billing group that you're deleting.
    */
  var Arn: BillingGroupArn
}
object DeleteBillingGroupInput {
  
  inline def apply(Arn: BillingGroupArn): DeleteBillingGroupInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBillingGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBillingGroupInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
