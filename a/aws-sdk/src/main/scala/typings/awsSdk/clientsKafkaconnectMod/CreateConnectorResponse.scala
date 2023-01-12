package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Amazon assigned to the connector.
    */
  var connectorArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the connector.
    */
  var connectorName: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the connector.
    */
  var connectorState: js.UndefOr[ConnectorState] = js.undefined
}
object CreateConnectorResponse {
  
  inline def apply(): CreateConnectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConnectorResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
    
    inline def setConnectorName(value: string): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setConnectorState(value: ConnectorState): Self = StObject.set(x, "connectorState", value.asInstanceOf[js.Any])
    
    inline def setConnectorStateUndefined: Self = StObject.set(x, "connectorState", js.undefined)
  }
}
