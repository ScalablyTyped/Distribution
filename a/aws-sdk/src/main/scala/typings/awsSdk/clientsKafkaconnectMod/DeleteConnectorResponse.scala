package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connector that you requested to delete.
    */
  var connectorArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the connector that you requested to delete.
    */
  var connectorState: js.UndefOr[ConnectorState] = js.undefined
}
object DeleteConnectorResponse {
  
  inline def apply(): DeleteConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
    
    inline def setConnectorState(value: ConnectorState): Self = StObject.set(x, "connectorState", value.asInstanceOf[js.Any])
    
    inline def setConnectorStateUndefined: Self = StObject.set(x, "connectorState", js.undefined)
  }
}
