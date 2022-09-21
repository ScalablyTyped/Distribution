package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorRuntimeSetting extends StObject {
  
  /**
    * Contains default values for the connector runtime setting that are supplied by the connector.
    */
  var connectorSuppliedValueOptions: js.UndefOr[ConnectorSuppliedValueOptionList] = js.undefined
  
  /**
    * Data type of the connector runtime setting.
    */
  var dataType: js.UndefOr[ConnectorRuntimeSettingDataType] = js.undefined
  
  /**
    * A description about the connector runtime setting.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether this connector runtime setting is required.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains value information about the connector runtime setting.
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * A label used for connector runtime setting.
    */
  var label: js.UndefOr[Label] = js.undefined
  
  /**
    * Indicates the scope of the connector runtime setting.
    */
  var scope: js.UndefOr[ConnectorRuntimeSettingScope] = js.undefined
}
object ConnectorRuntimeSetting {
  
  inline def apply(): ConnectorRuntimeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorRuntimeSetting]
  }
  
  extension [Self <: ConnectorRuntimeSetting](x: Self) {
    
    inline def setConnectorSuppliedValueOptions(value: ConnectorSuppliedValueOptionList): Self = StObject.set(x, "connectorSuppliedValueOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectorSuppliedValueOptionsUndefined: Self = StObject.set(x, "connectorSuppliedValueOptions", js.undefined)
    
    inline def setConnectorSuppliedValueOptionsVarargs(value: ConnectorSuppliedValue*): Self = StObject.set(x, "connectorSuppliedValueOptions", js.Array(value*))
    
    inline def setDataType(value: ConnectorRuntimeSettingDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setScope(value: ConnectorRuntimeSettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
