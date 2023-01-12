package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connector.
    */
  var connectorArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the connector.
    */
  var connectorState: js.UndefOr[ConnectorState] = js.undefined
}
object UpdateConnectorResponse {
  
  inline def apply(): UpdateConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
    
    inline def setConnectorState(value: ConnectorState): Self = StObject.set(x, "connectorState", value.asInstanceOf[js.Any])
    
    inline def setConnectorStateUndefined: Self = StObject.set(x, "connectorState", js.undefined)
  }
}
