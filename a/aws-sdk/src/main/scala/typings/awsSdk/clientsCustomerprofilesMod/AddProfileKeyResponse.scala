package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProfileKeyResponse extends StObject {
  
  /**
    * A searchable identifier of a customer profile.
    */
  var KeyName: js.UndefOr[name] = js.undefined
  
  /**
    * A list of key values.
    */
  var Values: js.UndefOr[requestValueList] = js.undefined
}
object AddProfileKeyResponse {
  
  inline def apply(): AddProfileKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProfileKeyResponse]
  }
  
  extension [Self <: AddProfileKeyResponse](x: Self) {
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
