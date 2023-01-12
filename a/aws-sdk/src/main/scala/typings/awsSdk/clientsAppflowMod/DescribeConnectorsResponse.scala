package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorsResponse extends StObject {
  
  /**
    *  The configuration that is applied to the connectors used in the flow. 
    */
  var connectorConfigurations: js.UndefOr[ConnectorConfigurationsMap] = js.undefined
  
  /**
    * Information about the connectors supported in Amazon AppFlow.
    */
  var connectors: js.UndefOr[ConnectorList] = js.undefined
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeConnectorsResponse {
  
  inline def apply(): DescribeConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConnectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorConfigurations(value: ConnectorConfigurationsMap): Self = StObject.set(x, "connectorConfigurations", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfigurationsUndefined: Self = StObject.set(x, "connectorConfigurations", js.undefined)
    
    inline def setConnectors(value: ConnectorList): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: ConnectorDetail*): Self = StObject.set(x, "connectors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
