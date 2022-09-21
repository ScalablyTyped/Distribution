package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2CustomParameter extends StObject {
  
  /**
    * Contains default values for this authentication parameter that are supplied by the connector.
    */
  var connectorSuppliedValues: js.UndefOr[ConnectorSuppliedValueList] = js.undefined
  
  /**
    * A description about the custom parameter used for OAuth 2.0 authentication.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether the custom parameter for OAuth 2.0 authentication is required.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this authentication custom parameter is a sensitive field.
    */
  var isSensitiveField: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key of the custom parameter required for OAuth 2.0 authentication.
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * The label of the custom parameter used for OAuth 2.0 authentication.
    */
  var label: js.UndefOr[Label] = js.undefined
  
  /**
    * Indicates whether custom parameter is used with TokenUrl or AuthUrl.
    */
  var `type`: js.UndefOr[OAuth2CustomPropType] = js.undefined
}
object OAuth2CustomParameter {
  
  inline def apply(): OAuth2CustomParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2CustomParameter]
  }
  
  extension [Self <: OAuth2CustomParameter](x: Self) {
    
    inline def setConnectorSuppliedValues(value: ConnectorSuppliedValueList): Self = StObject.set(x, "connectorSuppliedValues", value.asInstanceOf[js.Any])
    
    inline def setConnectorSuppliedValuesUndefined: Self = StObject.set(x, "connectorSuppliedValues", js.undefined)
    
    inline def setConnectorSuppliedValuesVarargs(value: ConnectorSuppliedValue*): Self = StObject.set(x, "connectorSuppliedValues", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setIsSensitiveField(value: Boolean): Self = StObject.set(x, "isSensitiveField", value.asInstanceOf[js.Any])
    
    inline def setIsSensitiveFieldUndefined: Self = StObject.set(x, "isSensitiveField", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: OAuth2CustomPropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
