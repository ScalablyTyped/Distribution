package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationFlowConfig extends StObject {
  
  /**
    * The API version that the destination connector uses.
    */
  var apiVersion: js.UndefOr[ApiVersion_] = js.undefined
  
  /**
    *  The name of the connector profile. This name must be unique for each connector profile in the Amazon Web Services account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType
  
  /**
    *  This stores the information that is required to query a particular connector. 
    */
  var destinationConnectorProperties: DestinationConnectorProperties
}
object DestinationFlowConfig {
  
  inline def apply(connectorType: ConnectorType, destinationConnectorProperties: DestinationConnectorProperties): DestinationFlowConfig = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any], destinationConnectorProperties = destinationConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFlowConfig]
  }
  
  extension [Self <: DestinationFlowConfig](x: Self) {
    
    inline def setApiVersion(value: ApiVersion_): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectorProperties(value: DestinationConnectorProperties): Self = StObject.set(x, "destinationConnectorProperties", value.asInstanceOf[js.Any])
  }
}
