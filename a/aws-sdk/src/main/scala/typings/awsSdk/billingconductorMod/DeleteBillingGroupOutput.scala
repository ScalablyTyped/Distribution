package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBillingGroupOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted billing group.
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
}
object DeleteBillingGroupOutput {
  
  inline def apply(): DeleteBillingGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBillingGroupOutput]
  }
  
  extension [Self <: DeleteBillingGroupOutput](x: Self) {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
