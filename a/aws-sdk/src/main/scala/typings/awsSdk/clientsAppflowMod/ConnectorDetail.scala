package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorDetail extends StObject {
  
  /**
    * The application type of the connector.
    */
  var applicationType: js.UndefOr[ApplicationType] = js.undefined
  
  /**
    * A description about the registered connector.
    */
  var connectorDescription: js.UndefOr[ConnectorDescription] = js.undefined
  
  /**
    * A label used for the connector.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    * The connection mode that the connector supports.
    */
  var connectorModes: js.UndefOr[ConnectorModeList] = js.undefined
  
  /**
    * The name of the connector.
    */
  var connectorName: js.UndefOr[ConnectorName] = js.undefined
  
  /**
    * The owner of the connector.
    */
  var connectorOwner: js.UndefOr[ConnectorOwner] = js.undefined
  
  /**
    * The provisioning type that the connector uses.
    */
  var connectorProvisioningType: js.UndefOr[ConnectorProvisioningType] = js.undefined
  
  /**
    * The connector type.
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    * The connector version.
    */
  var connectorVersion: js.UndefOr[ConnectorVersion] = js.undefined
  
  /**
    * The time at which the connector was registered.
    */
  var registeredAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user who registered the connector.
    */
  var registeredBy: js.UndefOr[RegisteredBy] = js.undefined
}
object ConnectorDetail {
  
  inline def apply(): ConnectorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorDetail] (val x: Self) extends AnyVal {
    
    inline def setApplicationType(value: ApplicationType): Self = StObject.set(x, "applicationType", value.asInstanceOf[js.Any])
    
    inline def setApplicationTypeUndefined: Self = StObject.set(x, "applicationType", js.undefined)
    
    inline def setConnectorDescription(value: ConnectorDescription): Self = StObject.set(x, "connectorDescription", value.asInstanceOf[js.Any])
    
    inline def setConnectorDescriptionUndefined: Self = StObject.set(x, "connectorDescription", js.undefined)
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorModes(value: ConnectorModeList): Self = StObject.set(x, "connectorModes", value.asInstanceOf[js.Any])
    
    inline def setConnectorModesUndefined: Self = StObject.set(x, "connectorModes", js.undefined)
    
    inline def setConnectorModesVarargs(value: ConnectorMode*): Self = StObject.set(x, "connectorModes", js.Array(value*))
    
    inline def setConnectorName(value: ConnectorName): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setConnectorOwner(value: ConnectorOwner): Self = StObject.set(x, "connectorOwner", value.asInstanceOf[js.Any])
    
    inline def setConnectorOwnerUndefined: Self = StObject.set(x, "connectorOwner", js.undefined)
    
    inline def setConnectorProvisioningType(value: ConnectorProvisioningType): Self = StObject.set(x, "connectorProvisioningType", value.asInstanceOf[js.Any])
    
    inline def setConnectorProvisioningTypeUndefined: Self = StObject.set(x, "connectorProvisioningType", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setConnectorVersion(value: ConnectorVersion): Self = StObject.set(x, "connectorVersion", value.asInstanceOf[js.Any])
    
    inline def setConnectorVersionUndefined: Self = StObject.set(x, "connectorVersion", js.undefined)
    
    inline def setRegisteredAt(value: js.Date): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    inline def setRegisteredAtUndefined: Self = StObject.set(x, "registeredAt", js.undefined)
    
    inline def setRegisteredBy(value: RegisteredBy): Self = StObject.set(x, "registeredBy", value.asInstanceOf[js.Any])
    
    inline def setRegisteredByUndefined: Self = StObject.set(x, "registeredBy", js.undefined)
  }
}
