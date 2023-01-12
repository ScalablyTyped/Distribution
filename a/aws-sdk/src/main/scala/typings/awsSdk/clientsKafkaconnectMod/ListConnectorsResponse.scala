package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsResponse extends StObject {
  
  /**
    * An array of connector descriptions.
    */
  var connectors: js.UndefOr[listOfConnectorSummary] = js.undefined
  
  /**
    * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where it left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListConnectorsResponse {
  
  inline def apply(): ListConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectors(value: listOfConnectorSummary): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: ConnectorSummary*): Self = StObject.set(x, "connectors", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
