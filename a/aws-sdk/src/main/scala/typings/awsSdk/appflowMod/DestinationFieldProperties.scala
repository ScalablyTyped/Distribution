package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationFieldProperties extends js.Object {
  
  /**
    *  Specifies if the destination field can be created by the current user. 
    */
  var isCreatable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies if the destination field can have a null value. 
    */
  var isNullable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies whether the field can be updated during an UPDATE or UPSERT write operation. 
    */
  var isUpdatable: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or update them if they do. 
    */
  var isUpsertable: js.UndefOr[Boolean] = js.native
  
  /**
    *  A list of supported write operations. For each write operation listed, this field can be used in idFieldNames when that write operation is present as a destination option. 
    */
  var supportedWriteOperations: js.UndefOr[SupportedWriteOperationList] = js.native
}
object DestinationFieldProperties {
  
  @scala.inline
  def apply(): DestinationFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationFieldProperties]
  }
  
  @scala.inline
  implicit class DestinationFieldPropertiesOps[Self <: DestinationFieldProperties] (val x: Self) extends AnyVal {
    
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
    def setIsCreatable(value: Boolean): Self = this.set("isCreatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCreatable: Self = this.set("isCreatable", js.undefined)
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = this.set("isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNullable: Self = this.set("isNullable", js.undefined)
    
    @scala.inline
    def setIsUpdatable(value: Boolean): Self = this.set("isUpdatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUpdatable: Self = this.set("isUpdatable", js.undefined)
    
    @scala.inline
    def setIsUpsertable(value: Boolean): Self = this.set("isUpsertable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUpsertable: Self = this.set("isUpsertable", js.undefined)
    
    @scala.inline
    def setSupportedWriteOperationsVarargs(value: WriteOperationType*): Self = this.set("supportedWriteOperations", js.Array(value :_*))
    
    @scala.inline
    def setSupportedWriteOperations(value: SupportedWriteOperationList): Self = this.set("supportedWriteOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedWriteOperations: Self = this.set("supportedWriteOperations", js.undefined)
  }
}
