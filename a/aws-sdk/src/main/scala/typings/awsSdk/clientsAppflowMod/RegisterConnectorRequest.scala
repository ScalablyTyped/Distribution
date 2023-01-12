package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterConnectorRequest extends StObject {
  
  /**
    *  The name of the connector. The name is unique for each ConnectorRegistration in your Amazon Web Services account.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    * The provisioning type of the connector. Currently the only supported value is LAMBDA.
    */
  var connectorProvisioningConfig: js.UndefOr[ConnectorProvisioningConfig] = js.undefined
  
  /**
    * The provisioning type of the connector. Currently the only supported value is LAMBDA. 
    */
  var connectorProvisioningType: js.UndefOr[ConnectorProvisioningType] = js.undefined
  
  /**
    * A description about the connector that's being registered.
    */
  var description: js.UndefOr[Description] = js.undefined
}
object RegisterConnectorRequest {
  
  inline def apply(): RegisterConnectorRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorProvisioningConfig(value: ConnectorProvisioningConfig): Self = StObject.set(x, "connectorProvisioningConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectorProvisioningConfigUndefined: Self = StObject.set(x, "connectorProvisioningConfig", js.undefined)
    
    inline def setConnectorProvisioningType(value: ConnectorProvisioningType): Self = StObject.set(x, "connectorProvisioningType", value.asInstanceOf[js.Any])
    
    inline def setConnectorProvisioningTypeUndefined: Self = StObject.set(x, "connectorProvisioningType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
