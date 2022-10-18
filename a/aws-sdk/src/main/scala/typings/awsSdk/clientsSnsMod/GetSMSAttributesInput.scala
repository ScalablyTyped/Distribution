package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSMSAttributesInput extends StObject {
  
  /**
    * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
    */
  var attributes: js.UndefOr[ListString] = js.undefined
}
object GetSMSAttributesInput {
  
  inline def apply(): GetSMSAttributesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesInput]
  }
  
  extension [Self <: GetSMSAttributesInput](x: Self) {
    
    inline def setAttributes(value: ListString): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}
