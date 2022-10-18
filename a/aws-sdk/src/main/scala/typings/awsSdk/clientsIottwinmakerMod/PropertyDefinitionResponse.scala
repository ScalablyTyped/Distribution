package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDefinitionResponse extends StObject {
  
  /**
    * A mapping that specifies configuration information about the property.
    */
  var configuration: js.UndefOr[Configuration] = js.undefined
  
  /**
    * An object that contains information about the data type.
    */
  var dataType: DataType
  
  /**
    * An object that contains the default value.
    */
  var defaultValue: js.UndefOr[DataValue] = js.undefined
  
  /**
    * A Boolean value that specifies whether the property ID comes from an external data store.
    */
  var isExternalId: Boolean
  
  /**
    * A Boolean value that specifies whether the property definition can be updated.
    */
  var isFinal: Boolean
  
  /**
    * A Boolean value that specifies whether the property definition is imported from an external data store.
    */
  var isImported: Boolean
  
  /**
    * A Boolean value that specifies whether the property definition is inherited from a parent entity.
    */
  var isInherited: Boolean
  
  /**
    * A Boolean value that specifies whether the property is required in an entity.
    */
  var isRequiredInEntity: Boolean
  
  /**
    * A Boolean value that specifies whether the property is stored externally.
    */
  var isStoredExternally: Boolean
  
  /**
    * A Boolean value that specifies whether the property consists of time series data.
    */
  var isTimeSeries: Boolean
}
object PropertyDefinitionResponse {
  
  inline def apply(
    dataType: DataType,
    isExternalId: Boolean,
    isFinal: Boolean,
    isImported: Boolean,
    isInherited: Boolean,
    isRequiredInEntity: Boolean,
    isStoredExternally: Boolean,
    isTimeSeries: Boolean
  ): PropertyDefinitionResponse = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], isExternalId = isExternalId.asInstanceOf[js.Any], isFinal = isFinal.asInstanceOf[js.Any], isImported = isImported.asInstanceOf[js.Any], isInherited = isInherited.asInstanceOf[js.Any], isRequiredInEntity = isRequiredInEntity.asInstanceOf[js.Any], isStoredExternally = isStoredExternally.asInstanceOf[js.Any], isTimeSeries = isTimeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDefinitionResponse]
  }
  
  extension [Self <: PropertyDefinitionResponse](x: Self) {
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: DataValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setIsExternalId(value: Boolean): Self = StObject.set(x, "isExternalId", value.asInstanceOf[js.Any])
    
    inline def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    inline def setIsImported(value: Boolean): Self = StObject.set(x, "isImported", value.asInstanceOf[js.Any])
    
    inline def setIsInherited(value: Boolean): Self = StObject.set(x, "isInherited", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredInEntity(value: Boolean): Self = StObject.set(x, "isRequiredInEntity", value.asInstanceOf[js.Any])
    
    inline def setIsStoredExternally(value: Boolean): Self = StObject.set(x, "isStoredExternally", value.asInstanceOf[js.Any])
    
    inline def setIsTimeSeries(value: Boolean): Self = StObject.set(x, "isTimeSeries", value.asInstanceOf[js.Any])
  }
}
