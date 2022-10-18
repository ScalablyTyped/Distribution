package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorRequest extends StObject {
  
  /**
    * The label of the connector. The label is unique for each ConnectorRegistration in your Amazon Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based custom connectors.
    */
  var connectorType: ConnectorType
}
object DescribeConnectorRequest {
  
  inline def apply(connectorType: ConnectorType): DescribeConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorRequest]
  }
  
  extension [Self <: DescribeConnectorRequest](x: Self) {
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
  }
}
