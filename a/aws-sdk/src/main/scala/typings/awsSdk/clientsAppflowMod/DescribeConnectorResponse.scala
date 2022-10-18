package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorResponse extends StObject {
  
  /**
    * Configuration info of all the connectors that the user requested.
    */
  var connectorConfiguration: js.UndefOr[ConnectorConfiguration] = js.undefined
}
object DescribeConnectorResponse {
  
  inline def apply(): DescribeConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectorResponse]
  }
  
  extension [Self <: DescribeConnectorResponse](x: Self) {
    
    inline def setConnectorConfiguration(value: ConnectorConfiguration): Self = StObject.set(x, "connectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConnectorConfigurationUndefined: Self = StObject.set(x, "connectorConfiguration", js.undefined)
  }
}
