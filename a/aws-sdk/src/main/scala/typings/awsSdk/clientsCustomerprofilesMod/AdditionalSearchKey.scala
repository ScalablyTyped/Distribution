package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalSearchKey extends StObject {
  
  /**
    * A searchable identifier of a customer profile.
    */
  var KeyName: name
  
  /**
    * A list of key values.
    */
  var Values: requestValueList
}
object AdditionalSearchKey {
  
  inline def apply(KeyName: name, Values: requestValueList): AdditionalSearchKey = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalSearchKey]
  }
  
  extension [Self <: AdditionalSearchKey](x: Self) {
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
