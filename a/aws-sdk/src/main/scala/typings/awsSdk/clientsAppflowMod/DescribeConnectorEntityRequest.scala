package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorEntityRequest extends StObject {
  
  /**
    * The version of the API that's used by the connector.
    */
  var apiVersion: js.UndefOr[ApiVersion_] = js.undefined
  
  /**
    *  The entity name for that connector. 
    */
  var connectorEntityName: EntityName
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the Amazon Web Services account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The type of connector application, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
}
object DescribeConnectorEntityRequest {
  
  inline def apply(connectorEntityName: EntityName): DescribeConnectorEntityRequest = {
    val __obj = js.Dynamic.literal(connectorEntityName = connectorEntityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorEntityRequest]
  }
  
  extension [Self <: DescribeConnectorEntityRequest](x: Self) {
    
    inline def setApiVersion(value: ApiVersion_): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setConnectorEntityName(value: EntityName): Self = StObject.set(x, "connectorEntityName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
  }
}
