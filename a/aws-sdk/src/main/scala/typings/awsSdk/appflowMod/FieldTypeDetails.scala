package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldTypeDetails extends js.Object {
  
  /**
    *  The type of field, such as string, integer, date, and so on. 
    */
  var fieldType: FieldType = js.native
  
  /**
    *  The list of operators supported by a field. 
    */
  var filterOperators: FilterOperatorList = js.native
  
  /**
    *  The list of values that a field can contain. For example, a Boolean fieldType can have two values: "true" and "false". 
    */
  var supportedValues: js.UndefOr[SupportedValueList] = js.native
}
object FieldTypeDetails {
  
  @scala.inline
  def apply(fieldType: FieldType, filterOperators: FilterOperatorList): FieldTypeDetails = {
    val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], filterOperators = filterOperators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypeDetails]
  }
  
  @scala.inline
  implicit class FieldTypeDetailsOps[Self <: FieldTypeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldType(value: FieldType): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperatorsVarargs(value: Operator*): Self = this.set("filterOperators", js.Array(value :_*))
    
    @scala.inline
    def setFilterOperators(value: FilterOperatorList): Self = this.set("filterOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedValuesVarargs(value: Value*): Self = this.set("supportedValues", js.Array(value :_*))
    
    @scala.inline
    def setSupportedValues(value: SupportedValueList): Self = this.set("supportedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedValues: Self = this.set("supportedValues", js.undefined)
  }
}
