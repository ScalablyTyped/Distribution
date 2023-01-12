package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDefinitionRequest extends StObject {
  
  /**
    * A mapping that specifies configuration information about the property. Use this field to specify information that you read from and write to an external source.
    */
  var configuration: js.UndefOr[Configuration] = js.undefined
  
  /**
    * An object that contains information about the data type.
    */
  var dataType: js.UndefOr[DataType] = js.undefined
  
  /**
    * An object that contains the default value.
    */
  var defaultValue: js.UndefOr[DataValue] = js.undefined
  
  /**
    * A Boolean value that specifies whether the property ID comes from an external data store.
    */
  var isExternalId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether the property is required.
    */
  var isRequiredInEntity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether the property is stored externally.
    */
  var isStoredExternally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether the property consists of time series data.
    */
  var isTimeSeries: js.UndefOr[Boolean] = js.undefined
}
object PropertyDefinitionRequest {
  
  inline def apply(): PropertyDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: DataValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setIsExternalId(value: Boolean): Self = StObject.set(x, "isExternalId", value.asInstanceOf[js.Any])
    
    inline def setIsExternalIdUndefined: Self = StObject.set(x, "isExternalId", js.undefined)
    
    inline def setIsRequiredInEntity(value: Boolean): Self = StObject.set(x, "isRequiredInEntity", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredInEntityUndefined: Self = StObject.set(x, "isRequiredInEntity", js.undefined)
    
    inline def setIsStoredExternally(value: Boolean): Self = StObject.set(x, "isStoredExternally", value.asInstanceOf[js.Any])
    
    inline def setIsStoredExternallyUndefined: Self = StObject.set(x, "isStoredExternally", js.undefined)
    
    inline def setIsTimeSeries(value: Boolean): Self = StObject.set(x, "isTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setIsTimeSeriesUndefined: Self = StObject.set(x, "isTimeSeries", js.undefined)
  }
}
