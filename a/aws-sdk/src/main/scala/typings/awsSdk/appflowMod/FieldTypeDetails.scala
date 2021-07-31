package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTypeDetails extends StObject {
  
  /**
    *  The type of field, such as string, integer, date, and so on. 
    */
  var fieldType: FieldType
  
  /**
    *  The list of operators supported by a field. 
    */
  var filterOperators: FilterOperatorList
  
  /**
    *  The list of values that a field can contain. For example, a Boolean fieldType can have two values: "true" and "false". 
    */
  var supportedValues: js.UndefOr[SupportedValueList] = js.undefined
}
object FieldTypeDetails {
  
  @scala.inline
  def apply(fieldType: FieldType, filterOperators: FilterOperatorList): FieldTypeDetails = {
    val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], filterOperators = filterOperators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypeDetails]
  }
  
  @scala.inline
  implicit class FieldTypeDetailsMutableBuilder[Self <: FieldTypeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldType(value: FieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperators(value: FilterOperatorList): Self = StObject.set(x, "filterOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperatorsVarargs(value: Operator*): Self = StObject.set(x, "filterOperators", js.Array(value :_*))
    
    @scala.inline
    def setSupportedValues(value: SupportedValueList): Self = StObject.set(x, "supportedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedValuesUndefined: Self = StObject.set(x, "supportedValues", js.undefined)
    
    @scala.inline
    def setSupportedValuesVarargs(value: Value*): Self = StObject.set(x, "supportedValues", js.Array(value :_*))
  }
}
