package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTypeDetails extends StObject {
  
  /**
    * This is the allowable length range for this field's value.
    */
  var fieldLengthRange: js.UndefOr[Range] = js.undefined
  
  /**
    *  The type of field, such as string, integer, date, and so on. 
    */
  var fieldType: FieldType
  
  /**
    * The range of values this field can hold.
    */
  var fieldValueRange: js.UndefOr[Range] = js.undefined
  
  /**
    *  The list of operators supported by a field. 
    */
  var filterOperators: FilterOperatorList
  
  /**
    * The date format that the field supports.
    */
  var supportedDateFormat: js.UndefOr[String] = js.undefined
  
  /**
    *  The list of values that a field can contain. For example, a Boolean fieldType can have two values: "true" and "false". 
    */
  var supportedValues: js.UndefOr[SupportedValueList] = js.undefined
  
  /**
    * The regular expression pattern for the field name.
    */
  var valueRegexPattern: js.UndefOr[String] = js.undefined
}
object FieldTypeDetails {
  
  inline def apply(fieldType: FieldType, filterOperators: FilterOperatorList): FieldTypeDetails = {
    val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], filterOperators = filterOperators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypeDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTypeDetails] (val x: Self) extends AnyVal {
    
    inline def setFieldLengthRange(value: Range): Self = StObject.set(x, "fieldLengthRange", value.asInstanceOf[js.Any])
    
    inline def setFieldLengthRangeUndefined: Self = StObject.set(x, "fieldLengthRange", js.undefined)
    
    inline def setFieldType(value: FieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setFieldValueRange(value: Range): Self = StObject.set(x, "fieldValueRange", value.asInstanceOf[js.Any])
    
    inline def setFieldValueRangeUndefined: Self = StObject.set(x, "fieldValueRange", js.undefined)
    
    inline def setFilterOperators(value: FilterOperatorList): Self = StObject.set(x, "filterOperators", value.asInstanceOf[js.Any])
    
    inline def setFilterOperatorsVarargs(value: Operator*): Self = StObject.set(x, "filterOperators", js.Array(value*))
    
    inline def setSupportedDateFormat(value: String): Self = StObject.set(x, "supportedDateFormat", value.asInstanceOf[js.Any])
    
    inline def setSupportedDateFormatUndefined: Self = StObject.set(x, "supportedDateFormat", js.undefined)
    
    inline def setSupportedValues(value: SupportedValueList): Self = StObject.set(x, "supportedValues", value.asInstanceOf[js.Any])
    
    inline def setSupportedValuesUndefined: Self = StObject.set(x, "supportedValues", js.undefined)
    
    inline def setSupportedValuesVarargs(value: Value*): Self = StObject.set(x, "supportedValues", js.Array(value*))
    
    inline def setValueRegexPattern(value: String): Self = StObject.set(x, "valueRegexPattern", value.asInstanceOf[js.Any])
    
    inline def setValueRegexPatternUndefined: Self = StObject.set(x, "valueRegexPattern", js.undefined)
  }
}
