package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomLineItemOutput extends StObject {
  
  /**
    *  Then ARN of the deleted custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
}
object DeleteCustomLineItemOutput {
  
  inline def apply(): DeleteCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomLineItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomLineItemOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
