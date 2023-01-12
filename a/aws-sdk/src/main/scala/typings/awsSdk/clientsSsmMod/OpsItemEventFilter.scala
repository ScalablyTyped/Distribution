package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemEventFilter extends StObject {
  
  /**
    * The name of the filter key. Currently, the only supported value is OpsItemId.
    */
  var Key: OpsItemEventFilterKey
  
  /**
    * The operator used by the filter call. Currently, the only supported value is Equal.
    */
  var Operator: OpsItemEventFilterOperator
  
  /**
    * The values for the filter, consisting of one or more OpsItem IDs.
    */
  var Values: OpsItemEventFilterValues
}
object OpsItemEventFilter {
  
  inline def apply(Key: OpsItemEventFilterKey, Operator: OpsItemEventFilterOperator, Values: OpsItemEventFilterValues): OpsItemEventFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsItemEventFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsItemEventFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: OpsItemEventFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: OpsItemEventFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: OpsItemEventFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OpsItemEventFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
