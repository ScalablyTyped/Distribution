package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorEntityField extends StObject {
  
  /**
    * A map that has specific properties related to the ConnectorEntityField.
    */
  var customProperties: js.UndefOr[CustomProperties] = js.undefined
  
  /**
    * Default value that can be assigned to this field.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    *  A description of the connector entity field. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The properties applied to a field when the connector is being used as a destination. 
    */
  var destinationProperties: js.UndefOr[DestinationFieldProperties] = js.undefined
  
  /**
    *  The unique identifier of the connector field. 
    */
  var identifier: Identifier
  
  /**
    * Booelan value that indicates whether this field is deprecated or not.
    */
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Booelan value that indicates whether this field can be used as a primary key.
    */
  var isPrimaryKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The label applied to a connector entity field. 
    */
  var label: js.UndefOr[Label] = js.undefined
  
  /**
    * The parent identifier of the connector field.
    */
  var parentIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    *  The properties that can be applied to a field when the connector is being used as a source. 
    */
  var sourceProperties: js.UndefOr[SourceFieldProperties] = js.undefined
  
  /**
    *  Contains details regarding the supported FieldType, including the corresponding filterOperators and supportedValues. 
    */
  var supportedFieldTypeDetails: js.UndefOr[SupportedFieldTypeDetails] = js.undefined
}
object ConnectorEntityField {
  
  inline def apply(identifier: Identifier): ConnectorEntityField = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorEntityField]
  }
  
  extension [Self <: ConnectorEntityField](x: Self) {
    
    inline def setCustomProperties(value: CustomProperties): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationProperties(value: DestinationFieldProperties): Self = StObject.set(x, "destinationProperties", value.asInstanceOf[js.Any])
    
    inline def setDestinationPropertiesUndefined: Self = StObject.set(x, "destinationProperties", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIsDeprecated(value: Boolean): Self = StObject.set(x, "isDeprecated", value.asInstanceOf[js.Any])
    
    inline def setIsDeprecatedUndefined: Self = StObject.set(x, "isDeprecated", js.undefined)
    
    inline def setIsPrimaryKey(value: Boolean): Self = StObject.set(x, "isPrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryKeyUndefined: Self = StObject.set(x, "isPrimaryKey", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setParentIdentifier(value: Identifier): Self = StObject.set(x, "parentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setParentIdentifierUndefined: Self = StObject.set(x, "parentIdentifier", js.undefined)
    
    inline def setSourceProperties(value: SourceFieldProperties): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setSupportedFieldTypeDetails(value: SupportedFieldTypeDetails): Self = StObject.set(x, "supportedFieldTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setSupportedFieldTypeDetailsUndefined: Self = StObject.set(x, "supportedFieldTypeDetails", js.undefined)
  }
}
