package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBillingGroupOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created billing group. 
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
}
object CreateBillingGroupOutput {
  
  inline def apply(): CreateBillingGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBillingGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBillingGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
