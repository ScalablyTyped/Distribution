package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceDestinationProperties extends js.Object {
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.native
  
  /**
    *  The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete. 
    */
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.native
  
  /**
    *  The object specified in the Salesforce flow destination. 
    */
  var `object`: Object = js.native
  
  /**
    *  This specifies the type of write operation to be performed in Salesforce. When the value is UPSERT, then idFieldNames is required. 
    */
  var writeOperationType: js.UndefOr[WriteOperationType] = js.native
}
object SalesforceDestinationProperties {
  
  @scala.inline
  def apply(`object`: Object): SalesforceDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceDestinationProperties]
  }
  
  @scala.inline
  implicit class SalesforceDestinationPropertiesOps[Self <: SalesforceDestinationProperties] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Object): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = this.set("errorHandlingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandlingConfig: Self = this.set("errorHandlingConfig", js.undefined)
    
    @scala.inline
    def setIdFieldNamesVarargs(value: Name*): Self = this.set("idFieldNames", js.Array(value :_*))
    
    @scala.inline
    def setIdFieldNames(value: IdFieldNameList): Self = this.set("idFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdFieldNames: Self = this.set("idFieldNames", js.undefined)
    
    @scala.inline
    def setWriteOperationType(value: WriteOperationType): Self = this.set("writeOperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteOperationType: Self = this.set("writeOperationType", js.undefined)
  }
}
