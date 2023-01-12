package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchField extends StObject {
  
  /**
    * An enum value that indicates the key to search the channel on. MEMBERS allows you to search channels based on memberships. You can use it with the EQUALS operator to get channels whose memberships are equal to the specified values, and with the INCLUDES operator to get channels whose memberships include the specified values.
    */
  var Key: SearchFieldKey
  
  /**
    * The operator used to compare field values, currently EQUALS or INCLUDES. Use the EQUALS operator to find channels whose memberships equal the specified values. Use the INCLUDES operator to find channels whose memberships include the specified values.
    */
  var Operator: SearchFieldOperator
  
  /**
    * The values that you want to search for, a list of strings. The values must be AppInstanceUserArns specified as a list of strings.  This operation isn't supported for AppInstanceUsers with large number of memberships. 
    */
  var Values: SearchFieldValues
}
object SearchField {
  
  inline def apply(Key: SearchFieldKey, Operator: SearchFieldOperator, Values: SearchFieldValues): SearchField = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchField] (val x: Self) extends AnyVal {
    
    inline def setKey(value: SearchFieldKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SearchFieldOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SearchFieldValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: SearchFieldValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
