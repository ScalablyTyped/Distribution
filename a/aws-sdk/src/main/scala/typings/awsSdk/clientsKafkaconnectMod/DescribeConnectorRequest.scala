package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connector that you want to describe.
    */
  var connectorArn: string
}
object DescribeConnectorRequest {
  
  inline def apply(connectorArn: string): DescribeConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorArn = connectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectorRequest]
  }
  
  extension [Self <: DescribeConnectorRequest](x: Self) {
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
  }
}
