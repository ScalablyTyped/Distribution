package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorEntitiesResponse extends StObject {
  
  /**
    *  The response of ListConnectorEntities lists entities grouped by category. This map's key represents the group name, and its value contains the list of entities belonging to that group. 
    */
  var connectorEntityMap: ConnectorEntityMap
  
  /**
    * A token that you specify in your next ListConnectorEntities operation to get the next page of results in paginated response. The ListConnectorEntities operation provides this token if the response is too big for the page size.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListConnectorEntitiesResponse {
  
  inline def apply(connectorEntityMap: ConnectorEntityMap): ListConnectorEntitiesResponse = {
    val __obj = js.Dynamic.literal(connectorEntityMap = connectorEntityMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectorEntitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConnectorEntitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectorEntityMap(value: ConnectorEntityMap): Self = StObject.set(x, "connectorEntityMap", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
