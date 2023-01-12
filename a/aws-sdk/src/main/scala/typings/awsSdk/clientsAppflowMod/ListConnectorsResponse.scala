package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsResponse extends StObject {
  
  /**
    * Contains information about the connectors supported by Amazon AppFlow.
    */
  var connectors: js.UndefOr[ConnectorList] = js.undefined
  
  /**
    * The pagination token for the next page of data. If nextToken=null, this means that all records have been fetched.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListConnectorsResponse {
  
  inline def apply(): ListConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorsResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectors(value: ConnectorList): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: ConnectorDetail*): Self = StObject.set(x, "connectors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
