package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemRelatedItemsFilter extends StObject {
  
  /**
    * The name of the filter key. Supported values include ResourceUri, ResourceType, or AssociationId.
    */
  var Key: OpsItemRelatedItemsFilterKey
  
  /**
    * The operator used by the filter call. The only supported operator is EQUAL.
    */
  var Operator: OpsItemRelatedItemsFilterOperator
  
  /**
    * The values for the filter.
    */
  var Values: OpsItemRelatedItemsFilterValues
}
object OpsItemRelatedItemsFilter {
  
  inline def apply(
    Key: OpsItemRelatedItemsFilterKey,
    Operator: OpsItemRelatedItemsFilterOperator,
    Values: OpsItemRelatedItemsFilterValues
  ): OpsItemRelatedItemsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsItemRelatedItemsFilter]
  }
  
  extension [Self <: OpsItemRelatedItemsFilter](x: Self) {
    
    inline def setKey(value: OpsItemRelatedItemsFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: OpsItemRelatedItemsFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: OpsItemRelatedItemsFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OpsItemRelatedItemsFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
