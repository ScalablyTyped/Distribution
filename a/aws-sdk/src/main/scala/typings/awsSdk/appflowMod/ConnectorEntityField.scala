package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorEntityField extends StObject {
  
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
  implicit class ConnectorEntityFieldMutableBuilder[Self <: ConnectorEntityField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationProperties(value: DestinationFieldProperties): Self = StObject.set(x, "destinationProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPropertiesUndefined: Self = StObject.set(x, "destinationProperties", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSourceProperties(value: SourceFieldProperties): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    @scala.inline
    def setSupportedFieldTypeDetails(value: SupportedFieldTypeDetails): Self = StObject.set(x, "supportedFieldTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFieldTypeDetailsUndefined: Self = StObject.set(x, "supportedFieldTypeDetails", js.undefined)
  }
}
