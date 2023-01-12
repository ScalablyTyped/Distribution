package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceFilter extends StObject {
  
  /**
    * Specify the operator that you want to use to determine whether a namespace matches the specified value. Valid values for Condition are one of the following.    EQ: When you specify EQ for Condition, you can specify only one value. EQ is supported for TYPE, NAME, and HTTP_NAME. EQ is the default condition and can be omitted.    BEGINS_WITH: When you specify BEGINS_WITH for Condition, you can specify only one value. BEGINS_WITH is supported for TYPE, NAME, and HTTP_NAME.  
    */
  var Condition: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    * Specify the namespaces that you want to get using one of the following.    TYPE: Gets the namespaces of the specified type.    NAME: Gets the namespaces with the specified name.    HTTP_NAME: Gets the namespaces with the specified HTTP name.  
    */
  var Name: NamespaceFilterName
  
  /**
    * Specify the values that are applicable to the value that you specify for Name.    TYPE: Specify HTTP, DNS_PUBLIC, or DNS_PRIVATE.    NAME: Specify the name of the namespace, which is found in Namespace.Name.    HTTP_NAME: Specify the HTTP name of the namespace, which is found in Namespace.Properties.HttpProperties.HttpName.  
    */
  var Values: FilterValues
}
object NamespaceFilter {
  
  inline def apply(Name: NamespaceFilterName, Values: FilterValues): NamespaceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamespaceFilter] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: FilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setName(value: NamespaceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
