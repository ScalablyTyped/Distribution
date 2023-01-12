package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthParameter extends StObject {
  
  /**
    * Contains default values for this authentication parameter that are supplied by the connector.
    */
  var connectorSuppliedValues: js.UndefOr[ConnectorSuppliedValueList] = js.undefined
  
  /**
    * A description about the authentication parameter.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether this authentication parameter is required.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this authentication parameter is a sensitive field.
    */
  var isSensitiveField: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The authentication key required to authenticate with the connector.
    */
  var key: js.UndefOr[Key] = js.undefined
  
  /**
    * Label used for authentication parameter.
    */
  var label: js.UndefOr[Label] = js.undefined
}
object AuthParameter {
  
  inline def apply(): AuthParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthParameter] (val x: Self) extends AnyVal {
    
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
  }
}
