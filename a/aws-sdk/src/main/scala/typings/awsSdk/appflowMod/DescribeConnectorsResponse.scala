package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorsResponse extends StObject {
  
  /**
    *  The configuration that is applied to the connectors used in the flow. 
    */
  var connectorConfigurations: js.UndefOr[ConnectorConfigurationsMap] = js.undefined
  
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
  
  extension [Self <: DescribeConnectorsResponse](x: Self) {
    
    inline def setConnectorConfigurations(value: ConnectorConfigurationsMap): Self = StObject.set(x, "connectorConfigurations", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfigurationsUndefined: Self = StObject.set(x, "connectorConfigurations", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
