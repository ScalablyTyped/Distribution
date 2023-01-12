package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectFilter extends StObject {
  
  /**
    * A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include: _caseId. The predefined keys you can use to search for _order include: _orderId.
    */
  var KeyName: name
  
  /**
    * A list of key values.
    */
  var Values: requestValueList
}
object ObjectFilter {
  
  inline def apply(KeyName: name, Values: requestValueList): ObjectFilter = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectFilter] (val x: Self) extends AnyVal {
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
