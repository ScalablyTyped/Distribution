package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorEntityField extends js.Object {
  
  /**
    *  A description of the connector entity field. 
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    *  The properties applied to a field when the connector is being used as a destination. 
    */
  var destinationProperties: js.UndefOr[DestinationFieldProperties] = js.native
  
  /**
    *  The unique identifier of the connector field. 
    */
  var identifier: Identifier = js.native
  
  /**
    *  The label applied to a connector entity field. 
    */
  var label: js.UndefOr[Label] = js.native
  
  /**
    *  The properties that can be applied to a field when the connector is being used as a source. 
    */
  var sourceProperties: js.UndefOr[SourceFieldProperties] = js.native
  
  /**
    *  Contains details regarding the supported FieldType, including the corresponding filterOperators and supportedValues. 
    */
  var supportedFieldTypeDetails: js.UndefOr[SupportedFieldTypeDetails] = js.native
}
object ConnectorEntityField {
  
  @scala.inline
  def apply(identifier: Identifier): ConnectorEntityField = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorEntityField]
  }
  
  @scala.inline
  implicit class ConnectorEntityFieldOps[Self <: ConnectorEntityField] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinationProperties(value: DestinationFieldProperties): Self = this.set("destinationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationProperties: Self = this.set("destinationProperties", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSourceProperties(value: SourceFieldProperties): Self = this.set("sourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProperties: Self = this.set("sourceProperties", js.undefined)
    
    @scala.inline
    def setSupportedFieldTypeDetails(value: SupportedFieldTypeDetails): Self = this.set("supportedFieldTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedFieldTypeDetails: Self = this.set("supportedFieldTypeDetails", js.undefined)
  }
}
