package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomLineItemOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the created custom line item. 
    */
  var Arn: js.UndefOr[CustomLineItemArn] = js.undefined
}
object CreateCustomLineItemOutput {
  
  inline def apply(): CreateCustomLineItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomLineItemOutput]
  }
  
  extension [Self <: CreateCustomLineItemOutput](x: Self) {
    
    inline def setArn(value: CustomLineItemArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
